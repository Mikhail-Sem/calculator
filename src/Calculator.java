package Calculator;
import java.util.Scanner;
import parser.StringParser;


public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {
        String inputString = getString();

        //System.out.println(inputString);
        StringParser stringParser = new StringParser(inputString);
        System.out.println(stringParser.operation);

        /** int result = calc(num1, num2, operation);
        System.out.println("результат операции:" + result);*/
    }

    public static String getString() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение:");
        String input = in.nextLine();

        return input;
    }

    /** public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("операция не прошла, так как ввод некорректен");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }*/
}