import java.util.Scanner;

public class ReverseNumber {            //recursion 
    void method(int x){
        while(x > 0){
            System.out.print(x%10);
            method(x/10);
        }
        return ;
    }
}
class ReverseMain{
    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int x = sc.nextInt();
        obj.method(x);
        sc.close();
    }
}
