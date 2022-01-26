import java.util.Arrays;

class ThirdLargest{
    int third(int[] arr){
        int len = arr.length;
        Arrays.sort(arr);
        return arr[len-3];       
    }
}
class LargestMain{
    public static void main(String[] args) {
        ThirdLargest obj = new ThirdLargest();
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {45,85,105,56,15,199};
        System.out.println(obj.third(arr));
        System.out.println(obj.third(arr1));
    }
}