import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i =0; i<10;i++){
             nums[i]= sc.nextInt();
        }
        List<Integer> res = encontrarMultiplo(nums);
        System.out.println("Los multiplos de 3 o 5 son: "+res);

    }
    public static  List<Integer> encontrarMultiplo(int[] nums){
        List<Integer> multiplo = new ArrayList<>();
        for (int i=0; i< nums.length; i++){
            if (nums[i] % 5 ==0 || nums[i] % 3 ==0){
                multiplo.add(nums[i]);
            }
        }
        return multiplo;
    }
}
