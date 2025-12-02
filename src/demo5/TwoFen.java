package demo5;

public class TwoFen {
    public static void main(String[] args) {


        int[] arr = {6, 5, 4, 3, 2, 1};
        for (int min = 0, max = arr.length - 1; min < max; min++, max--) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
