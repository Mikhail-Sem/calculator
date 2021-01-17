package Calculator;
import java.util.Scanner;

import parser.Operand;
import parser.Operation;
import parser.StringParser;


public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {
        String inputString = getString();

        StringParser stringParser = new StringParser(inputString);

        if ((stringParser.leftOperand.value < 1) || (stringParser.leftOperand.value > 10)) {
            throw new RuntimeException("Левый операнд должен быть в диапазоне 1..10");
        }
        if ((stringParser.rightOperand.value < 1) || (stringParser.rightOperand.value > 10)) {
            throw new RuntimeException("Правый операнд должен быть в диапазоне 1..10");
        }

        int result = calc(stringParser.leftOperand, stringParser.rightOperand, stringParser.operation);
        System.out.println("Результат операции:" + result);
    }

    public static String getString() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение:");
        String input = in.nextLine();

        return input;
    }

    public static int calc(Operand leftOperand, Operand rightOperand, Operation operation) {
        int result;

        if (leftOperand.type != rightOperand.type) {
            throw new RuntimeException("Цифры должны иметь одинаковый тип (обе арабские или обе римские)");
        }

        switch (operation) {
            case Plus:
                result = leftOperand.value + rightOperand.value;
                return result;
            case Minus:
                result = leftOperand.value - rightOperand.value;
                return result;
            case Multiplication:
                result = leftOperand.value * rightOperand.value;
                return result;
            case Division:
                result = leftOperand.value / rightOperand.value;
                return result;
            default:
                System.out.println("операция не прошла, так как ввод некорректен");
                /**
                 * Нужно будет выбросить исключение
                 */
                return 0;
        }
    }
}