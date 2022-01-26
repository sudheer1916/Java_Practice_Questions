import java.util.Scanner;

public class RowColumnSum {
    void rowSum(int[][] arr){
        System.out.print("row sum = ");
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum = sum + arr[i][j];
            }
            System.out.print(sum+" ");
        }
    }
    void columnSum(int[][] arr){
        
        int k = arr[0].length-1;
        int i = 0;
        System.out.print("column sum = ");
        while(k>=0){
            
            int j = 0;
            int sum = 0;
            while (j < arr.length) {
                sum = sum + arr[j++][i];
            }
            System.out.print(sum+" ");
            k--;
            i++;
        }
    }
    public static void main(String[] args) {
        RowColumnSum obj = new RowColumnSum();

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        obj.rowSum(arr);
        System.out.println();
        obj.columnSum(arr);
        sc.close();
    }
}
