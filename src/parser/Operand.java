package parser;

public class Operand {
    public int value;
    public OperandType type;

    public Operand(String input) {
        value = 1;
        type = OperandType.Arabic;
    }
}
