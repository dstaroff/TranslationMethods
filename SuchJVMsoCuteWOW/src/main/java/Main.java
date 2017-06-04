import util.Compiler;
import util.JVM;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String source = args[0];
            String compiled = source.substring(0, source.indexOf(".kindofjava")) + ".kindofclass";

            Compiler.compile(source);
            JVM.execute(compiled);
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
