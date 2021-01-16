package parser;

public class Operand {
    public int value;
    public OperandType type;

    public Operand(String input) {
        try {
            value = new Integer(input);
            type = OperandType.Arabic;
        } catch (NumberFormatException e) {
            type = OperandType.Roman;
        }
    }
}
