import java.util.Scanner;

public class MinYMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];

        for (int i =0; i<10; i++){
            System.out.println("Dame un numero: ");
            num[i] =scanner.nextInt();
        }
        int min = num[0];
        int max = num[0];

        for (int i=0; i<10; i++){
            if (num[i]>max){
                max = num[i];
            }
            if (num[i] < min){
                min = num[i];
            }
        }

        System.out.println("el numero mayor es: "+max+"\nnumero menor es: "+min);
    }
}
