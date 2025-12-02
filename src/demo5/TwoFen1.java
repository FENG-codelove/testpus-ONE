package demo5;

public class TwoFen1 {
    public static void main(String[] args) {
        int [] arr= {55, 22, 77, 44, 66, 88, 11, 33, 99};
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
