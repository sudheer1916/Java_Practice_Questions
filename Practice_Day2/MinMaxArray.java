public class MinMaxArray {
    public static void main(String[] args) {
        int arr[] = {5,9,16,4,25,6};
        int low = arr[0];
        int high = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > high)
            high = arr[i];
            if(arr[i] < low)
            low = arr[i];
        }
        System.out.println("High = "+high);
        System.out.println("low = "+low);
    }
}
