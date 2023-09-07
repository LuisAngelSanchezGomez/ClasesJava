package OtrosEjercicios;//import java.util.HashSet;

public class PairsNumber{
    public static void main(String[]args) {
        int[] arr = {1,5,7,1};
        int n = 4;
        int k = 6;
        int count = getPairs(arr, n, k);
        System.out.println("Number of pairs with sum " + k + ": " + count);
    }

    public static int getPairs(int[] arr, int n, int k) {
        int counter = 0;
        //we can use HashSet library to track the elements in the array
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    counter++;
                }
            }
        }
        return counter;

    }
}