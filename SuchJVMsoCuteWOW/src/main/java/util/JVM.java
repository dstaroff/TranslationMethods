package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import static util.Bytecode.*;

public class JVM {
    private static final int SIZE = 1000;

    private static String[] instructions;
    private static int[] pool = new int[SIZE];

    private static void readBytecode(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        ArrayList<String> instructionsList = new ArrayList<>();

        String line = br.readLine();
        while (line != null) {
            instructionsList.add(line);
            line = br.readLine();
        }

        instructions = new String[instructionsList.size()];
        for (int i = 0; i < instructions.length; ++i) {
            instructions[i] = instructionsList.get(i);
        }
    }

    private static String[] deleteEmpty(String[] withEmpties) {
        ArrayList<String> temp = new ArrayList<>();
        for (String s : withEmpties) {
            if (!s.isEmpty()) {
                temp.add(s);
            }
        }

        String[] withoutEmpties = new String[temp.size()];
        for (int i = 0; i < withoutEmpties.length; ++i) {
            withoutEmpties[i] = temp.get(i);
        }

        return withoutEmpties;
    }

    public static void execute(String filePath) throws IOException {
        readBytecode(filePath);
        Stack<Integer> stack = new Stack<>();
        Scanner readScanner = new Scanner(new InputStreamReader(System.in));
        int pointer = 0;

        boolean suspend = false;
        while (!suspend) {
            if (pointer >= instructions.length) {
                break;
            }

            String instruction = instructions[pointer];
            instruction = instruction.substring(instruction.indexOf(' '));
            String[] instructionParams = instruction.split(" ");
            instructionParams = deleteEmpty(instructionParams);

            int arg = 0;
            if (instructionParams.length > 1) {
                arg = Integer.parseInt(instructionParams[1]);
            }

            ++pointer;
            instruction = instructionParams[0];

            if (instruction.equals(Push.V())) {
                stack.push(arg);
            } else if (instruction.equals(Store.V())) {
                pool[arg] = stack.pop();
            } else if (instruction.equals(Load.V())) {
                stack.push(pool[arg]);
            } else if (instruction.equals(Add.V())) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b + a);
            } else if (instruction.equals(Sub.V())) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if (instruction.equals(Mul.V())) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b * a);
            } else if (instruction.equals(Div.V())) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else if (instruction.equals(Mod.V())) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b % a);
            } else if (instruction.equals(Invert.V())) {
                int a = stack.pop();
                stack.push(-a);
            } else if (instruction.equals(BoolInv.V())) {
                int a = stack.pop();
                stack.push(Math.abs(1 - a));
            } else if (instruction.equals(Clone.V())) {
                int a = stack.pop();
                stack.push(a);
                stack.push(a);
            } else if (instruction.equals(Jump.V())) {
                pointer = arg;
            } else if (instruction.equals(IfEq.V())) {
                int a = stack.pop();
                int b = stack.pop();
                if (a == b) {
                    pointer = arg;
                }
            } else if (instruction.equals(IfNE.V())) {
                int a = stack.pop();
                int b = stack.pop();
                if (a != b) {
                    pointer = arg;
                }
            } else if (instruction.equals(IfGT.V())) {
                int a = stack.pop();
                int b = stack.pop();
                if (b > a) {
                    pointer = arg;
                }
            } else if (instruction.equals(IfLT.V())) {
                int a = stack.pop();
                int b = stack.pop();
                if (b < a) {
                    pointer = arg;
                }
            } else if (instruction.equals(IfGE.V())) {
                int a = stack.pop();
                int b = stack.pop();
                if (b >= a) {
                    pointer = arg;
                }
            } else if (instruction.equals(IfLE.V())) {
                int a = stack.pop();
                int b = stack.pop();
                if (b <= a) {
                    pointer = arg;
                }
            } else if (instruction.equals(IfEZ.V())) {
                int a = stack.pop();
                if (a == 0) {
                    pointer = arg;
                }
            } else if (instruction.equals(Eq.V())) {
                int a = stack.pop();
                int b = stack.pop();
                if (a == b) {
                    stack.push(1);
                } else {
                    stack.push(0);
                }
            } else if (instruction.equals(NE.V())) {
                int a = stack.pop();
                int b = stack.pop();
                if (a != b) {
                    stack.push(1);
                } else {
                    stack.push(0);
                }
            } else if (instruction.equals(GT.V())) {
                int a = stack.pop();
                int b = stack.pop();
                if (b > a) {
                    stack.push(1);
                } else {
                    stack.push(0);
                }
            } else if (instruction.equals(LT.V())) {
                int a = stack.pop();
                int b = stack.pop();
                if (b < a) {
                    stack.push(1);
                } else {
                    stack.push(0);
                }
            } else if (instruction.equals(GE.V())) {
                int a = stack.pop();
                int b = stack.pop();
                if (b >= a) {
                    stack.push(1);
                } else {
                    stack.push(0);
                }
            } else if (instruction.equals(LE.V())) {
                int a = stack.pop();
                int b = stack.pop();
                if (b <= a) {
                    stack.push(1);
                } else {
                    stack.push(0);
                }
            } else if (instruction.equals(Or.V())) {
                boolean a = stack.pop() != 0;
                boolean b = stack.pop() != 0;
                if (a || b) {
                    stack.push(1);
                } else {
                    stack.push(0);
                }
            } else if (instruction.equals(Xor.V())) {
                boolean a = stack.pop() != 0;
                boolean b = stack.pop() != 0;
                if (a ^ b) {
                    stack.push(1);
                } else {
                    stack.push(0);
                }
            } else if (instruction.equals(And.V())) {
                boolean a = stack.pop() != 0;
                boolean b = stack.pop() != 0;
                if (a && b) {
                    stack.push(1);
                } else {
                    stack.push(0);
                }
            } else if (instruction.equals(Print.V())) {
                System.out.println(stack.pop());
            } else if (instruction.equals(Read.V())) {
                stack.push(readScanner.nextInt());
            } else if (instruction.equals(Return.V())) {
                suspend = true;
            } else {
                System.err.println("Unknown instruction");
                suspend = true;
            }
        }
    }
}
