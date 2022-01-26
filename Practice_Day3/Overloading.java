public class Overloading {
    void operation(int x){
        System.out.println(x+x);
    }
    void operation(int x,int y){
        System.out.println(y-x);
    }
    void operation(int x,int y,int z){
        System.out.println(x*y*z);
    }
    double operation(Double x,Double y){
        return x/y;
    }
    void operation(Float x, Float y){
        System.out.println(x%y);
    }
}
class OverloadingMain{
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.operation(5);
        obj.operation(5,15);
        obj.operation(5,5,5);
        System.out.println(obj.operation(45.0,15.0));
        obj.operation(5.0f, 2.0f);
    }
}
