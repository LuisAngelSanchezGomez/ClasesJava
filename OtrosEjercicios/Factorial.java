package OtrosEjercicios;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa numero");
        int num = scanner.nextInt();
        long fact = 1;

        for (int i = 1; i<num; i++){
            fact *= i;
        }
        System.out.println("the factorial of "+ num+" es "+ fact);
    }
}
