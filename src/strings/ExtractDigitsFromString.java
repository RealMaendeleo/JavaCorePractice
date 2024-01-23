package strings;

import java.util.*;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 */

public class ExtractDigitsFromString {
    public static void main(String[] args) {
        String str = "Привет 8, как 1 2 твои дела? Предлагаю4 пойти 32 по8гулять?";
        System.out.println(str);

        int[] digitsFromString = getDigitsFromString(str);
        System.out.println(Arrays.toString(digitsFromString));

        int digitsSum = getSumOfArray(digitsFromString);
        System.out.println("Sum = " + digitsSum);
    }

    static int[] getDigitsFromString(String string) {
        int digitsCount = 0;
        for (char c : string.toCharArray()) {
            if (Character.isDigit(c)) {
                digitsCount++;
            }
        }
        int[] result = new int[digitsCount];
        int index = 0;
        for (char c : string.toCharArray()) {
            if (Character.isDigit(c)) {
                result[index] = Integer.parseInt(Character.toString(c));
                index++;
            }
        }
        return result;
    }

    static int getSumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
