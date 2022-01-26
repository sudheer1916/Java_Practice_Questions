public class OperatorOverloading {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int x,int y,int z){
        System.out.println(x+y+z);
    }
}
class OveloadingMain{
    public static void main(String[] args) {
        OperatorOverloading obj = new OperatorOverloading();
        obj.add(5, 6);
        obj.add(5, 6, 7);
    }
}
