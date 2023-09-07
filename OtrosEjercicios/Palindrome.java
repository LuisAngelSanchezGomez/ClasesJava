package OtrosEjercicios;

import java.util.Scanner;

public class Palindrome{
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Escriba una palabra: ");
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.nextLine();
            if (isPalindrome(word)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }
    }
}