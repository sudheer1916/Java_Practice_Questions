import java.util.Scanner;

/**
 * ArmstrongNum
 */
public class ArmstrongNum {
    void method(int x){
        int y = x,sum=0;
        while(y>0){
            int i = y % 10;
            sum = sum + (int)Math.pow(i, 3);
            y = y/10;
        }
        if(sum == x)
        System.out.println("Armstrong Number");
        else
        System.out.println("not Armstrong Number ");
    }
}
class ArmstrongNumMain{
    public static void main(String[] args) {
        ArmstrongNum obj = new ArmstrongNum();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
        int x = sc.nextInt();
        obj.method(x);
        sc.close();
    }
}