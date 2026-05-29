package org.example;

import java.util.HashMap;
import java.util.Map;

public class CypressVisitor extends TranspiladorBaseVisitor<String> {

    private final Map<String, String> variables = new HashMap<>();
    private String beforeBlock = "";
    private String afterBlock  = "";

    @Override
    public String visitPrograma(TranspiladorParser.ProgramaContext ctx) {
        return visit(ctx.classDef());
    }

    @Override
    public String visitClassDef(TranspiladorParser.ClassDefContext ctx) {
        String className = ctx.IDENTIFIER().getText();
        StringBuilder tests = new StringBuilder();

        for (TranspiladorParser.MiembroContext m : ctx.miembro()) {
            if (m.metodoDef() != null) {
                String anotacion = m.metodoDef().anotacion().getText();
                if (anotacion.equals("@BeforeEach")) {
                    beforeBlock = visitMetodoBody(m.metodoDef());
                } else if (anotacion.equals("@AfterEach")) {
                    afterBlock = visitMetodoBody(m.metodoDef());
                } else if (anotacion.equals("@Test")) {
                    tests.append(visitMetodoDef(m.metodoDef()));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("describe('").append(className).append("', () => {\n");
        if (!beforeBlock.isEmpty()) {
            sb.append("  beforeEach(() => {\n").append(beforeBlock).append("  });\n\n");
        }
        if (!afterBlock.isEmpty()) {
            sb.append("  afterEach(() => {\n").append(afterBlock).append("  });\n\n");
        }
        sb.append(tests);
        sb.append("});\n");
        return sb.toString();
    }

    @Override
    public String visitMetodoDef(TranspiladorParser.MetodoDefContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        StringBuilder sb = new StringBuilder();
        sb.append("  it('").append(methodName).append("', () => {\n");
        for (TranspiladorParser.SentenciaContext s : ctx.sentencia()) {
            sb.append(visitSentencia(s));
        }
        sb.append("  });\n");
        return sb.toString();
    }

    private String visitMetodoBody(TranspiladorParser.MetodoDefContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (TranspiladorParser.SentenciaContext s : ctx.sentencia()) {
            sb.append(visitSentencia(s));
        }
        return sb.toString();
    }

    @Override
    public String visitSentencia(TranspiladorParser.SentenciaContext ctx) {
        if (ctx.varDecl() != null)          return visitVarDecl(ctx.varDecl());
        if (ctx.ifSentencia() != null)       return visitIfSentencia(ctx.ifSentencia());
        if (ctx.assertSentencia() != null)   return visitAssertSentencia(ctx.assertSentencia());
        if (ctx.exprSentencia() != null)     return visitExprSentencia(ctx.exprSentencia());
        return "";
    }

    @Override
    public String visitAssertSentencia(TranspiladorParser.AssertSentenciaContext ctx) {
        String esperado = visitExprConComillas(ctx.expr(0));
        String actual   = visitExprConComillas(ctx.expr(1));
        return "    expect(" + actual + ").to.equal(" + esperado + ");\n";
    }

    @Override
    public String visitVarDecl(TranspiladorParser.VarDeclContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        String val = visitExpr(ctx.expr());
        if (ctx.expr().llamada() != null) {
            String selector = traducirExprLlamada(ctx.expr().llamada());
            variables.put(varName, selector);
        } else {
            variables.put(varName, val);
        }
        return "";
    }

    @Override
    public String visitIfSentencia(TranspiladorParser.IfSentenciaContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (TranspiladorParser.SentenciaContext s : ctx.sentencia()) {
            sb.append(visitSentencia(s));
        }
        return sb.toString();
    }

    @Override
    public String visitExprSentencia(TranspiladorParser.ExprSentenciaContext ctx) {
        if (ctx.llamada() != null) return traducirLlamada(ctx.llamada());
        if (ctx.asignacion() != null) {
            String varName = ctx.asignacion().anyName().getText();
            String val = visitExpr(ctx.asignacion().expr());
            variables.put(varName, val);
            return "";
        }
        return "";
    }

    private String traducirLlamada(TranspiladorParser.LlamadaContext ctx) {
        String receptor = ctx.receptor().getText();
        java.util.List<TranspiladorParser.AccionContext> acciones = ctx.accion();

        if (receptor.equals("driver")) {
            String primera = acciones.get(0).IDENTIFIER().getText();

            if (primera.equals("get") && acciones.size() == 1) {
                String url = stripQuotes(acciones.get(0).argList().arg(0).expr().getText());
                return "    cy.visit('" + url + "');\n";
            }
            if (primera.equals("manage")) {
                return "";
            }
            if (primera.equals("findElement") && acciones.size() == 1) {
                return "";
            }
            if (primera.equals("findElement") && acciones.size() == 2) {
                String selector = resolverSelector(acciones.get(0).argList().arg(0).byExpr());
                String accion2  = acciones.get(1).IDENTIFIER().getText();
                if (accion2.equals("click")) {
                    return "    cy.get('" + selector + "').click();\n";
                }
                if (accion2.equals("sendKeys")) {
                    String texto = stripQuotes(acciones.get(1).argList().arg(0).expr().getText());
                    return "    cy.get('" + selector + "').type('" + texto + "');\n";
                }
                if (accion2.equals("getText")) {
                    return "";
                }
            }
        }

        if (!receptor.equals("driver")) {
            String varVal = variables.getOrDefault(receptor, receptor);
            if (acciones.size() == 1) {
                String accionNombre = acciones.get(0).IDENTIFIER().getText();
                if (accionNombre.equals("sendKeys")) {
                    String texto = stripQuotes(acciones.get(0).argList().arg(0).expr().getText());
                    return "    cy.get('" + varVal + "').type('" + texto + "');\n";
                }
                if (accionNombre.equals("click")) {
                    return "    cy.get('" + varVal + "').click();\n";
                }
                if (accionNombre.equals("quit")) {
                    return "";
                }
            }
        }

        return "";
    }

    @Override
    public String visitExpr(TranspiladorParser.ExprContext ctx) {
        if (ctx.STRING() != null)     return stripQuotes(ctx.STRING().getText());
        if (ctx.llamada() != null)    return traducirExprLlamada(ctx.llamada());
        if (ctx.IDENTIFIER() != null) {
            String id = ctx.IDENTIFIER().getText();
            return variables.getOrDefault(id, id);
        }
        return "null";
    }

    private String visitExprConComillas(TranspiladorParser.ExprContext ctx) {
        if (ctx.STRING() != null)     return "'" + stripQuotes(ctx.STRING().getText()) + "'";
        if (ctx.llamada() != null)    return traducirExprLlamada(ctx.llamada());
        if (ctx.IDENTIFIER() != null) {
            String id = ctx.IDENTIFIER().getText();
            String val = variables.getOrDefault(id, id);
            if (val.startsWith("#") || val.startsWith(".") || val.startsWith("[")) {
                return "cy.get('" + val + "').invoke('text')";
            }
            return val;
        }
        return "null";
    }

    private String traducirExprLlamada(TranspiladorParser.LlamadaContext ctx) {
        String receptor = ctx.receptor().getText();
        if (receptor.equals("driver")) {
            String primera = ctx.accion(0).IDENTIFIER().getText();
            if (primera.equals("findElement") && ctx.accion().size() == 1) {
                return resolverSelector(ctx.accion(0).argList().arg(0).byExpr());
            }
            if (primera.equals("getTitle")) {
                return "cy.title()";
            }
        }
        // Resolver variable y su acción
        String varVal = variables.getOrDefault(receptor, receptor);
        if (ctx.accion().size() == 1) {
            String accion = ctx.accion(0).IDENTIFIER().getText();
            if (accion.equals("getText")) {
                return varVal;
            }
        }
        return varVal;
    }
    private String resolverSelector(TranspiladorParser.ByExprContext by) {
        if (by == null) return "";
        String tipo  = by.getChild(2).getText();
        String valor = stripQuotes(by.STRING().getText());
        switch (tipo) {
            case "id":          return "#" + valor;
            case "cssSelector": return valor;
            case "name": return "[name=\"" + valor + "\"]";
            default:            return valor;
        }
    }

    private String stripQuotes(String s) {
        if (s.startsWith("\"") && s.endsWith("\""))
            return s.substring(1, s.length() - 1);
        return s;
    }
}