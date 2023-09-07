import java.util.Scanner;

public class Palindromo {
    public static boolean isPalindrome(String str) {
        str= str.replaceAll("\\s+" ,"").toLowerCase();
        int n = str.length();
        System.out.println("El tamaño de el String es de: "+n);
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
