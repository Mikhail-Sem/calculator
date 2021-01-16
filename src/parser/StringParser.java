package parser;

public class StringParser {
    public Operand leftOperand;
    public Operand rightOperand;
    public String operation;

    public StringParser(String input) {
        if (input.indexOf('+') != -1) {
            operation = "+";
        }
        if (input.indexOf('-') != -1) {
            operation = "-";
        }
        if (input.indexOf('*') != -1) {
            operation = "*";
        }
        if (input.indexOf('/') != -1) {
            operation = "/";
        }

        /**
         * Добавить обработку несуществующей операции
         */
    }
}
