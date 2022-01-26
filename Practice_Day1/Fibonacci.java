import java.util.Scanner;

class Fibonacci {

    static void method(int N){          //iter 
        int num1 = 0, num2 = 1;
  
        int counter = 0;
  
        // Iterate till counter is N
        while (counter < N) {
  
            // Print the number
            System.out.print(num1 + " ");
  
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
        int n = sc.nextInt();
        method(n);

        sc.close();
    }



    // static int fun(int n){                   //rec
    //     if(n<=1)
    //     return n;
        
    //     return fun(n-1) + fun(n-2);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("enter a number ");
    //     int n = sc.nextInt();
    //     for (int j = 0; j < n; j++) {
    //         System.out.print(fun(j)+ " ");
    //     }

    //     sc.close();    
    // }
}
