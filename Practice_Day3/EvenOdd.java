public class EvenOdd {
    static void even(int[] arr){
        System.out.print("Even = ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    static void odd(int[] arr){
        System.out.print("Odd = ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0)
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {45,85,105,56,15,199};
        even(arr);
        odd(arr);
        even(arr1);
        odd(arr1);
    }
}
