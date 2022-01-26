public class ReverseString {
    static char method(String str){
        //String ans="";
        int i = str.length()-1;
        System.out.print(str.charAt(i)+" ");
        i--;
        if(i == 0)
        return str.charAt(0);
        
        
        return method(str);
    }
    public static void main(String[] args) {
        method("Sudheer");
        
    }
}

