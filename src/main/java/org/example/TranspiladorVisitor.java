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
	 * Visit a parse tree produced by {@link TranspiladorParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(TranspiladorParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#metodoDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoDef(TranspiladorParser.MetodoDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(TranspiladorParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#navegar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavegar(TranspiladorParser.NavegarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#clickPorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClickPorId(TranspiladorParser.ClickPorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#clickPorCss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClickPorCss(TranspiladorParser.ClickPorCssContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#escribirPorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscribirPorId(TranspiladorParser.EscribirPorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#asercion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsercion(TranspiladorParser.AsercionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranspiladorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TranspiladorParser.ExprContext ctx);
}