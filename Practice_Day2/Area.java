public class Area {
    int square(int x){
        return x*x;
    }
    int rectangle(int l,int b){
        return l*b;
    }
}
class AreaMain{
    public static void main(String[] args) {
        Area obj = new Area();
        System.out.println(obj.square(5));
        System.out.println(obj.rectangle(8, 5));
    }
}
