package org.example;

import org.antlr.v4.runtime.*;

public class ErrorHandler extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        String tipo = (recognizer instanceof Lexer) ? "Léxico" : "Sintáctico";
        System.err.println("Error " + tipo + " en línea " + line
                + ", columna " + charPositionInLine + ": " + msg);
        throw new RuntimeException("Error de compilación detectado. Traducción abortada.");
    }
}