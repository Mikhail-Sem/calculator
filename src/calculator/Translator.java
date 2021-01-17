package calculator;

public class Translator {
    public String value;
    String [] roman = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public Translator (int input) {
        if ((input < 1) || (input > 10)) {
            throw new RuntimeException("Транслятор переводит цифры только из диапзона 1..10");
        }

        value = roman[input - 1];
    }
}
