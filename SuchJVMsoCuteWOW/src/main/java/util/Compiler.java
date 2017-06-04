package util;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Compiler {
    public static void compile(String sourceFilePath) throws IOException {
        String compiledFilePath = sourceFilePath.substring(0, sourceFilePath.indexOf(".kindofjava")) + ".kindofclass";

        ANTLRInputStream input = new ANTLRInputStream(new FileReader(sourceFilePath));
        JavaGrammarLexer lexer = new JavaGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaGrammarParser parser = new JavaGrammarParser(tokens);
        ParseTree tree = parser.code();
        ParseTreeWalker walker = new ParseTreeWalker();
        CodeListener codeListener = new CodeListener();
        walker.walk(codeListener, tree);

        FileWriter fileWriter = new FileWriter(compiledFilePath);
        ArrayList<String> byteCode = CodeListener.getAnswer();
        int size = byteCode.size();
        for (int i = 0; i < size; i++) {
            fileWriter.write(i + ": " + byteCode.get(i) + '\n');
        }

        fileWriter.flush();
    }
}
