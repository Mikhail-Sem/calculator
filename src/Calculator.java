package Calculator;
import java.util.Scanner;


public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("результат операции:" + result);
    }

    public static int getInt() {
        System.out.println("введите 2 целых числа от 1 до 10 и операцию между ними:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("ошибка, попробуйте еще раз");
            scanner.next();
            num = getInt();
        }
        return num;
    }
    public static char getOperation () {
        System.out.println ("Введите операцию");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("ошибка, попробуйте еще раз");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
    public static int calc(int num1, int num2, char operation) {
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
    }
}

1