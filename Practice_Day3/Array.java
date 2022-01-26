public class Array {
    int i=0;
    void method(int[] arr){                     //using recursion
        int n = arr.length;
        System.out.print(arr[i]+" ");
        i++;
        if(i == n)
        return ;
        method(arr);
    }
    public static void main(String[] args) {
        Array obj = new Array();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        obj.method(arr);
    }
}
