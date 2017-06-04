import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import util.RomanSumLexer;
import util.RomanSumParser;

import java.io.IOException;

public class RomanSumming {
    public static void main(String[] args) {
        try {
            ANTLRFileStream in = new ANTLRFileStream(args[0]);
            RomanSumLexer lexer = new RomanSumLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RomanSumParser parser = new RomanSumParser(tokens);

            System.out.println(parser.sum().result);
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
