package org.example;

public class CypressVisitor extends TranspiladorBaseVisitor<String> {

    @Override
    public String visitPrograma(TranspiladorParser.ProgramaContext ctx) {
        return visit(ctx.classDef());
    }

    @Override
    public String visitClassDef(TranspiladorParser.ClassDefContext ctx) {
        String className = ctx.IDENTIFIER().getText();
        StringBuilder sb = new StringBuilder();
        sb.append("describe('").append(className).append("', () => {\n");
        for (TranspiladorParser.MetodoDefContext m : ctx.metodoDef()) {
            sb.append(visit(m));
        }
        sb.append("});\n");
        return sb.toString();
    }

    @Override
    public String visitMetodoDef(TranspiladorParser.MetodoDefContext ctx) {
        String methodName = ctx.IDENTIFIER().get(0).getText();
        StringBuilder sb = new StringBuilder();
        sb.append("  it('").append(methodName).append("', () => {\n");
        for (TranspiladorParser.SentenciaContext s : ctx.sentencia()) {
            sb.append(visit(s));
        }
        sb.append("  });\n");
        return sb.toString();
    }

    @Override
    public String visitSentencia(TranspiladorParser.SentenciaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitNavegar(TranspiladorParser.NavegarContext ctx) {
        String url = stripQuotes(ctx.STRING().getText());
        return "    cy.visit('" + url + "');\n";
    }

    @Override
    public String visitClickPorId(TranspiladorParser.ClickPorIdContext ctx) {
        String id = stripQuotes(ctx.STRING().getText());
        return "    cy.get('#" + id + "').click();\n";
    }

    @Override
    public String visitClickPorCss(TranspiladorParser.ClickPorCssContext ctx) {
        String selector = stripQuotes(ctx.STRING().getText());
        return "    cy.get('" + selector + "').click();\n";
    }

    @Override
    public String visitEscribirPorId(TranspiladorParser.EscribirPorIdContext ctx) {
        String id    = stripQuotes(ctx.STRING(0).getText());
        String texto = stripQuotes(ctx.STRING(1).getText());
        return "    cy.get('#" + id + "').type('" + texto + "');\n";
    }

    @Override
    public String visitAsercion(TranspiladorParser.AsercionContext ctx) {
        String esperado = visit(ctx.expr(0));
        String actual   = visit(ctx.expr(1));
        return "    expect(" + actual + ").to.equal(" + esperado + ");\n";
    }

    @Override
    public String visitExpr(TranspiladorParser.ExprContext ctx) {
        if (ctx.STRING() != null) {
            return "'" + stripQuotes(ctx.STRING().getText()) + "'";
        }
        return ctx.IDENTIFIER().getText();
    }

    private String stripQuotes(String s) {
        return s.substring(1, s.length() - 1);
    }
}