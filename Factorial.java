import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        for (int i = 0; i<9;i++){
            System.out.println("El factorial de "+ i + " es: "+factorial(i));
        }


    }
    public static int factorial(int n){
        int res=1;
        for (int i = 1; i<=n; i++){
            res *=i;
        }
        return res;
    }

}
