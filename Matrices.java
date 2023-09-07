import java.util.Random;

public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Random rand = new Random();
                int ranNum = rand.nextInt(10);
                matriz[i][j] = ranNum ;
            }
            System.out.println();
        }
        for(int i=0; i<4; i++) {
            matriz[i][i] = -1;
            matriz[i][3-i] = -1;
        }
        

        // Imprimir la matriz
        for(int i=0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == -1) {
                    System.out.print("* ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
