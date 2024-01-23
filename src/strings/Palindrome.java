package strings;

/**
 * Определить, является ли строка палиндромом
 */

public class Palindrome {
    public static void main(String[] args) {
        String string = "манекенам";
        if (isPalindrome(string)) {
            System.out.println("Строка \"" + string + "\" - палиндром");
        } else {
            System.out.println("Строка \"" + string + "\" - не палиндром");
        }
    }

    static boolean isPalindrome(String string) {
        boolean isSymmetric = true;
        int len = string.length();
        for (int i = 0; i < len / 2; i++) {
            if (string.charAt(i) != string.charAt(len - i - 1)) {
                isSymmetric = false;
            }
        }
        return isSymmetric;
    }
}
