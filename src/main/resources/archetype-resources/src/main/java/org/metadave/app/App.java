package org.metadave.app;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;


public class App {

    public static void compile(String txt) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(txt);
        org.metadave.app.parser.AppLexer lexer =
                new org.metadave.app.parser.AppLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        org.metadave.app.parser.AppParser parser =
                new org.metadave.app.parser.AppParser(tokens);
        //parser.root_rule();
    }

    public static void main(String[] args) throws Exception {
      System.out.println("Hello, world");
    }
}
