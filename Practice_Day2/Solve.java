import java.util.Scanner;

public class Solve {
    void grade(int x){
        if(x<=100 && x>=90)
        System.out.println("O");
        else if(x<=89 && x>=80)
        System.out.println("A1");
        else if(x<=79 && x>=70)
        System.out.println("A2");
        else if(x<=69 && x>=60)
        System.out.println("B1");
        else if(x<=59 && x>=50)
        System.out.println("B2");
        else if(x<=49 && x>=40)
        System.out.println("C1");
        else if(x<=39 && x>=34)
        System.out.println("P");
        else if(x<=33 && x>=0)
        System.out.println("F");
        else
        System.out.println("Invalid Number");
    }
    public static void main(String[] args) {
        Solve obj = new Solve();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the marks ");
        int x = sc.nextInt();
        obj.grade(x);
        sc.close();
    }
}
