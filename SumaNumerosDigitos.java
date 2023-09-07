import java.util.HashMap;
import java.util.Scanner;

public class SumaNumerosDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero ");
        int num = sc.nextInt();
        ValidarResultado(num);

    }
    public static void ValidarResultado(int num){
        int suma = 0;
       while (num!=0){
           suma+= num%10;
           num/=10;
       }
        System.out.println("La suma de los dígitos es: " + suma);
    }
}
