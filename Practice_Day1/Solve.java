import java.util.Scanner;

public class Solve {
    int digits(int x){
        int count=0;
        while(x > 0){
            count++;
            x = x/10;
        }
        return count;
    }
    void method(int i){
        int k = digits(i);
        int y = i,sum=0;
        while(y>0){
            int z = y % 10;
            sum = sum + (int)Math.pow(z, k);
            y = y/10;
        }
        if(sum == i)
        System.out.print(i+", ");
    }
}
class SolveMain{
    public static void main(String[] args) {
        Solve obj = new Solve();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            obj.method(i);
        }
        
        sc.close();
    }
}
