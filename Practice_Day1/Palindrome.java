import java.util.Scanner;

public class Palindrome {
    boolean method(int x){
        int rev=0,temp=0;
	    int org=x;
	    while(x>0){
		    temp=x%10;
		    rev = rev*10+temp;
		    x/=10;
	    }
	    return rev==org;
    }
}
class PMain{
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
        int x = sc.nextInt();
        System.out.println(obj.method(x));
        sc.close();
    }
}
