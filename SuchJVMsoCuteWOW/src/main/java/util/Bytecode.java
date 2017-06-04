package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

enum Bytecode {
    Push, Store, Load, BoolInv, Invert, Add, Sub, Mul, Div, Mod,
    Clone, Jump, IfEq, IfNE, IfGT, IfLT, IfGE, IfLE, IfEZ,
    Eq, NE, GT, LT, GE, LE, Or, Xor, And, Print, Read, Return;

    private static final String PATH = "src/main/resources/bytecodeInstructions.properties";
    private static Properties properties;
    private String value;

    private void init() throws IOException {
        if (properties == null) {
            properties = new Properties();
            FileInputStream fis = new FileInputStream(PATH);
            properties.load(fis);
        }

        value = (String) properties.get(this.toString());
    }

    public String V() {
        if (value == null) {
            try {
                init();
            } catch (IOException e) {
                System.err.println(e.getMessage());
                System.exit(1);
            }
        }

        return value;
    }
}