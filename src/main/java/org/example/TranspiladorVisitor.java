// Generated from src/main/antlr4/Transpilador.g4 by ANTLR 4.13.2
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TranspiladorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TranspiladorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(TranspiladorParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#packageDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDecl(TranspiladorParser.PackageDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#importDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDecl(TranspiladorParser.ImportDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(TranspiladorParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#anyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyName(TranspiladorParser.AnyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(TranspiladorParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#miembro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMiembro(TranspiladorParser.MiembroContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#campoDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampoDecl(TranspiladorParser.CampoDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(TranspiladorParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#metodoDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoDef(TranspiladorParser.MetodoDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#anotacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnotacion(TranspiladorParser.AnotacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(TranspiladorParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(TranspiladorParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(TranspiladorParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(TranspiladorParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#ifSentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSentencia(TranspiladorParser.IfSentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#ifCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCond(TranspiladorParser.IfCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#assertSentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertSentencia(TranspiladorParser.AssertSentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#exprSentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSentencia(TranspiladorParser.ExprSentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(TranspiladorParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TranspiladorParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#llamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada(TranspiladorParser.LlamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#receptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceptor(TranspiladorParser.ReceptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#accion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion(TranspiladorParser.AccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(TranspiladorParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(TranspiladorParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#byExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByExpr(TranspiladorParser.ByExprContext ctx);
}