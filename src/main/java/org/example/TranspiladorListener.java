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
	 * Enter a parse tree produced by {@link TranspiladorParser#navegar}.
	 * @param ctx the parse tree
	 */
	void enterNavegar(TranspiladorParser.NavegarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#navegar}.
	 * @param ctx the parse tree
	 */
	void exitNavegar(TranspiladorParser.NavegarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#clickPorId}.
	 * @param ctx the parse tree
	 */
	void enterClickPorId(TranspiladorParser.ClickPorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#clickPorId}.
	 * @param ctx the parse tree
	 */
	void exitClickPorId(TranspiladorParser.ClickPorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#clickPorCss}.
	 * @param ctx the parse tree
	 */
	void enterClickPorCss(TranspiladorParser.ClickPorCssContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#clickPorCss}.
	 * @param ctx the parse tree
	 */
	void exitClickPorCss(TranspiladorParser.ClickPorCssContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#escribirPorId}.
	 * @param ctx the parse tree
	 */
	void enterEscribirPorId(TranspiladorParser.EscribirPorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#escribirPorId}.
	 * @param ctx the parse tree
	 */
	void exitEscribirPorId(TranspiladorParser.EscribirPorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranspiladorParser#asercion}.
	 * @param ctx the parse tree
	 */
	void enterAsercion(TranspiladorParser.AsercionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranspiladorParser#asercion}.
	 * @param ctx the parse tree
	 */
	void exitAsercion(TranspiladorParser.AsercionContext ctx);
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
}