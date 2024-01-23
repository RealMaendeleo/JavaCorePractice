package strings;

/**
 * Дана строка s ([a-zA-Z]) и число k.
 * Лексикографически сравнить подстроки
 * и найти наименьшую и наибольшую подстроки длины k
 */

public class SubstringComparisons {
    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
        String result = getSmallestAndLargest(s, k);
        System.out.println("The smallest and largest substrings respectively");
        System.out.println(result);
    }

    static String getSmallestAndLargest(String string, int size) {
        String smallest = string.substring(0, size);
        String largest = string.substring(0, size);
        String substring;
        for (int i = 0; i <= string.length() - size; i++) {
            substring = string.substring(i, i + size);
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        return smallest + "\n" + largest;
    }
}
