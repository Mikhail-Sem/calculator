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

        if (type == OperandType.Roman) {
            String [] roman = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            int index;
            for (index = 0; index < roman.length; index++) {
                if (roman[index].equals(input)) {
                    break;
                }
            }
            value = ++index;
        }
    }
}
