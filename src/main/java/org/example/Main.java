package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) throws Exception {


        String inputPath;
        if (args.length > 0) {
            inputPath = args[0];
        } else {
            inputPath = "LoginTest.java";
        }

        File inputFile = new File(inputPath);
        if (!inputFile.exists()) {
            System.err.println("Error: No se encontró el archivo: " + inputPath);
            System.exit(1);
        }


        CharStream input = CharStreams.fromFileName(inputPath);

        TranspiladorLexer lexer = new TranspiladorLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ErrorHandler());

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        TranspiladorParser parser = new TranspiladorParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorHandler());


        TranspiladorParser.ProgramaContext tree = parser.programa();


        CypressVisitor visitor = new CypressVisitor();
        String resultado = visitor.visit(tree);


        String outputPath = inputFile.getName().replace(".java", ".cy.js");
        Files.writeString(Path.of(outputPath), resultado);

        System.out.println("Traduccion exitosa: " + outputPath);
        System.out.println(resultado);
    }
}