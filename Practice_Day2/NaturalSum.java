import java.util.Scanner;

class NaturalSum{
    int sum(int x){         //recursion
        if(x == 1)
        return 1;

        return x + sum(x-1);
    }
}
class NaturalMain{
    public static void main(String[] args) {
        NaturalSum obj = new NaturalSum();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int i = sc.nextInt();

        System.out.println(obj.sum(i));
        sc.close();
    }
}