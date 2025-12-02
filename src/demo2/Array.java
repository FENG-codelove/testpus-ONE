package demo2;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
    int[] arr = new int[5];
        Random rand = new Random();
        for(int i=0; i<arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
    }
}
