package strings;

/**
 * Класс работает с римскими числами и преобразует
 * римское число (String) в арабское число (int), и наоборот
 */
public class RomanNumber {
    private RomanDigit[] romanDigits;

    public RomanNumber(String romanString) {
        this.romanDigits = new RomanDigit[romanString.length()];
        for (int i = 0; i < romanString.length(); i++) {
            this.romanDigits[i] = RomanDigit.valueOf(String.valueOf(romanString.charAt(i)));
        }
    }

    public RomanNumber(int arabicNumber) {
        String romanString = arabicToRoman(arabicNumber);
        this.romanDigits = new RomanDigit[romanString.length()];
        for (int i = 0; i < romanString.length(); i++) {
            this.romanDigits[i] = RomanDigit.valueOf(String.valueOf(romanString.charAt(i)));
        }
    }

    public static void main(String[] args) {
        RomanNumber romanNumber = new RomanNumber("MCMLXXXVI");
        int arabicNumber = romanNumber.toArabicValue();
        System.out.println(arabicNumber);
    }

    private String arabicToRoman(int num) {
        if (num == 0)
            return "";
        for (RomanDigit value : RomanDigit.values()) {
            if (num >= value.arabicValue) {
                return value + arabicToRoman(num - value.arabicValue);
            }
        }
        return "";
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder(romanDigits.length);
        for (RomanDigit romanDigit : romanDigits) {
            stringBuilder.append(romanDigit);
        }
        System.out.println(stringBuilder);
    }

    public int toArabicValue() {
        int length = romanDigits.length;
        int result = romanDigits[length - 1].arabicValue;
        for (int i = length - 2; i >= 0; i--) {
            if (romanDigits[i].arabicValue < romanDigits[i + 1].arabicValue) {
                result -= romanDigits[i].arabicValue;
            } else {
                result += romanDigits[i].arabicValue;
            }
        }
        return result;
    }

    private enum RomanDigit {
        M(1000),
        CM(900),
        D(500),
        CD(400),
        C(100),
        XC(90),
        L(50),
        XL(40),
        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1);

        private final int arabicValue;

        RomanDigit(int arabicDigit) {
            this.arabicValue = arabicDigit;
        }
    }
}