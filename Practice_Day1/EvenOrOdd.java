import java.util.Scanner;

class EvenOrOdd{
    void method(int i){
        if(i % 2 == 0)
        System.out.println("Even Number ");
        else
        System.out.println(" Odd Number ");

    }
    public static void main(String[] args) {
        EvenOrOdd obi = new EvenOrOdd();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
        int i = sc.nextInt();
        obi.method(i);

        sc.close();
    }
}