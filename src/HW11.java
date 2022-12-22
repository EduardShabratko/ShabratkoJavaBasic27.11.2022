import java.util.Random;
import java.util.Scanner;

public class HW11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во строк- ");
        int N = in.nextInt();
        System.out.print("Введите кол-во строк- ");
        int M = in.nextInt();
        int[][] matrix = new int[N][M];
        int[][] array = new int[M][N];
        Random random = new Random();

        System.out.println("Оригинальная матрица");
        System.out.println("------");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = array[j][i];
            }
        }
        System.out.println("Новая матрица");
        System.out.println("------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
}

