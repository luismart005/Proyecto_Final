// Generated from src/main/antlr4/Transpilador.g4 by ANTLR 4.13.2
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TranspiladorParser}.
 */
public interface TranspiladorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(TranspiladorParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(TranspiladorParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#packageDecl}.
	 * @param ctx the parse tree
	 */
	void enterPackageDecl(TranspiladorParser.PackageDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#packageDecl}.
	 * @param ctx the parse tree
	 */
	void exitPackageDecl(TranspiladorParser.PackageDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void enterImportDecl(TranspiladorParser.ImportDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void exitImportDecl(TranspiladorParser.ImportDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(TranspiladorParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(TranspiladorParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#anyName}.
	 * @param ctx the parse tree
	 */
	void enterAnyName(TranspiladorParser.AnyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#anyName}.
	 * @param ctx the parse tree
	 */
	void exitAnyName(TranspiladorParser.AnyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(TranspiladorParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(TranspiladorParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#miembro}.
	 * @param ctx the parse tree
	 */
	void enterMiembro(TranspiladorParser.MiembroContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#miembro}.
	 * @param ctx the parse tree
	 */
	void exitMiembro(TranspiladorParser.MiembroContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#campoDecl}.
	 * @param ctx the parse tree
	 */
	void enterCampoDecl(TranspiladorParser.CampoDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#campoDecl}.
	 * @param ctx the parse tree
	 */
	void exitCampoDecl(TranspiladorParser.CampoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(TranspiladorParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(TranspiladorParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#metodoDef}.
	 * @param ctx the parse tree
	 */
	void enterMetodoDef(TranspiladorParser.MetodoDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#metodoDef}.
	 * @param ctx the parse tree
	 */
	void exitMetodoDef(TranspiladorParser.MetodoDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#anotacion}.
	 * @param ctx the parse tree
	 */
	void enterAnotacion(TranspiladorParser.AnotacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#anotacion}.
	 * @param ctx the parse tree
	 */
	void exitAnotacion(TranspiladorParser.AnotacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(TranspiladorParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(TranspiladorParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(TranspiladorParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(TranspiladorParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(TranspiladorParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(TranspiladorParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(TranspiladorParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(TranspiladorParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#ifSentencia}.
	 * @param ctx the parse tree
	 */
	void enterIfSentencia(TranspiladorParser.IfSentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#ifSentencia}.
	 * @param ctx the parse tree
	 */
	void exitIfSentencia(TranspiladorParser.IfSentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#ifCond}.
	 * @param ctx the parse tree
	 */
	void enterIfCond(TranspiladorParser.IfCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#ifCond}.
	 * @param ctx the parse tree
	 */
	void exitIfCond(TranspiladorParser.IfCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#assertSentencia}.
	 * @param ctx the parse tree
	 */
	void enterAssertSentencia(TranspiladorParser.AssertSentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#assertSentencia}.
	 * @param ctx the parse tree
	 */
	void exitAssertSentencia(TranspiladorParser.AssertSentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#exprSentencia}.
	 * @param ctx the parse tree
	 */
	void enterExprSentencia(TranspiladorParser.ExprSentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#exprSentencia}.
	 * @param ctx the parse tree
	 */
	void exitExprSentencia(TranspiladorParser.ExprSentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(TranspiladorParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(TranspiladorParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TranspiladorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TranspiladorParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#llamada}.
	 * @param ctx the parse tree
	 */
	void enterLlamada(TranspiladorParser.LlamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#llamada}.
	 * @param ctx the parse tree
	 */
	void exitLlamada(TranspiladorParser.LlamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#receptor}.
	 * @param ctx the parse tree
	 */
	void enterReceptor(TranspiladorParser.ReceptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#receptor}.
	 * @param ctx the parse tree
	 */
	void exitReceptor(TranspiladorParser.ReceptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAccion(TranspiladorParser.AccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAccion(TranspiladorParser.AccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(TranspiladorParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(TranspiladorParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(TranspiladorParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(TranspiladorParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#byExpr}.
	 * @param ctx the parse tree
	 */
	void enterByExpr(TranspiladorParser.ByExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#byExpr}.
	 * @param ctx the parse tree
	 */
	void exitByExpr(TranspiladorParser.ByExprContext ctx);
}