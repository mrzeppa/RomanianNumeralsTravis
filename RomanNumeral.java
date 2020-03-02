package main;

public class RomanNumeral {
    private final int number;

    public RomanNumeral(int i) {
        number = i;
    }

    public String getRomanNumeral() {
        String units = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}[number % 10];
        String tens = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}[(number % 100) / 10];
        String hundreds = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}[(number % 1000) / 100];
        String thousands = new String[]{"", "M", "MM", "MMM"}[(number / 1000)];
        return thousands + hundreds + tens + units;
    }
}