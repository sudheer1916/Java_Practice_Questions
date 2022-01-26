import java.util.Scanner;
// make a largest possible element with given array elements
//should not seperate digits like "795" cannot break as (79 5, 7 95, 7 9 5)  
//eg = 48,105,6,99,26 => 9948626105
public class Solve1 {
    void method(int arr[]){
        boolean loop = true;
        int len = arr.length;
        while (loop) {
            int last = arr[0] % 10;
            int lastI = 0;
            for (int i = 1; i < len; i++) {
                if((arr[i] % 10) < last)
                {
                    last = arr[i]%10;
                    lastI = i;
                }
            }
            //swap arr[lasI] with arr[len -1]
            int swap = arr[lastI];
            arr[lastI] = arr[len-1];
            arr[len-1] = swap;

            len--;

            if(len-1 == 0)
            loop = false;
        }
    }
    // int method1(int[] arr){
    //     int digits=0;
    //     int ans = 0;
    //     for (int i = arr.length -1 ; i >= 0; i++) {
    //         ans = ans + 
    //     }
    // }
    // int count(int x){
    //     int count = 0;
    //     while (x!=0) {
    //         count++;
    //         x = x/10;
    //     }
    //     return count;
    // }
    public static void main(String[] args) {
        Solve1 obj = new Solve1();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size ");
        int i = sc.nextInt();

        int arr[] = new int[i];
        System.out.println("enter the elements ");
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
        }
        obj.method(arr);

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
        System.out.println();
        // String str = arr.toString();
        // int ans = Integer.valueOf(str);
        // System.out.println(ans);
        //System.out.println("number = "+ obj.method1(arr));
        sc.close();
    }
}
