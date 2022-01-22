public class Pattern1 {
    void method(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                if(i == j){
                    //System.out.print(i);
                    while(j >= 1){
                        System.out.print(j--+" ");
                        //j--;
                    }   
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
class Pattern1Main{
    public static void main(String[] args) {
        Pattern1 p1 = new Pattern1();
        p1.method();
    }
}
