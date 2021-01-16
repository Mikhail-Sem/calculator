package parser;

public class StringParser {
    public Operand leftOperand;
    public Operand rightOperand;
    public Operation operation;

    public StringParser(String input) {
        if (input.indexOf('+') != -1) {
            operation = Operation.Plus;
        }
        if (input.indexOf('-') != -1) {
            operation = Operation.Minus;
        }
        if (input.indexOf('*') != -1) {
            operation = Operation.Multiplication;
        }
        if (input.indexOf('/') != -1) {
            operation = Operation.Division;
        }

        /**
         * Добавить обработку несуществующей операции
         */
    }
}
