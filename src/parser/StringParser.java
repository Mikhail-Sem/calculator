package parser;

public class StringParser {
    public Operand leftOperand;
    public Operand rightOperand;
    public Operation operation;

    public StringParser(String input) {
        int pos;

        pos = input.indexOf('+');
        if (pos != -1) {
            operation = Operation.Plus;
        } else {
            pos = input.indexOf('-');
            if (pos != -1) {
                operation = Operation.Minus;
            } else {
                pos = input.indexOf('*');
                if (pos != -1) {
                    operation = Operation.Multiplication;
                } else {
                    pos = input.indexOf('/');
                    if (pos != -1) {
                        operation = Operation.Division;
                    } else {
                        /**
                         * Добавить обработку несуществующей операции
                         */
                    }
                }
            }
        }

        String leftPart = input.substring(0, pos).trim();
        String rightPart = input.substring(pos + 1).trim();

        leftOperand = new Operand(leftPart);
        rightOperand = new Operand(rightPart);
    }
}
