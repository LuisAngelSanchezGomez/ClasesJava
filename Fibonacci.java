import java.util.Scanner;

public class Fibonacci extends Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero en la serie fibonnacci: ");
        int serie = sc.nextInt();
        calcularFactorial(serie);
        factorial(serie);
    }
    public static void calcularFactorial(int serie){
        int num=0;
        int sNum=1;
        int res;

        for(int i=0; i<serie; i++){
            if (serie==1||serie==0){
                System.out.println(num+serie);
            }else {
                res = num + sNum;
                num=sNum;
                sNum=res;
                System.out.println(res);
            }
        }
    }


}
