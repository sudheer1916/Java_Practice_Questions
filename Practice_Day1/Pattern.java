public class Pattern {
    void method(){
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
class PatternMain{
    public static void main(String[] args) {
        Pattern obj = new Pattern();
        obj.method();
    }
}
