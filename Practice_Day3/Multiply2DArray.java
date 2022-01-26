import java.util.Scanner;

public class Multiply2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Multiply2DArray obj = new Multiply2DArray();
        int[][] arr = new int[3][3];
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
