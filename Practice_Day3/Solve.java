import java.util.Scanner;
//count no if items with sum < 0
public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("enter the size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            //int sum=0;
            for (int j = i+1; j < arr.length; j++) {
                //sum = ;
                if(arr[i] + arr[j] < 0)
                count++;
            }
        }
        System.out.println("count = "+count);
        sc.close();
    }
}
