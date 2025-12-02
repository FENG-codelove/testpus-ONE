package demo2;

import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Random rand = new Random();
        for(int i=0; i<arr.length; i++) {
            arr[i]=rand.nextInt(10);
            System.out.println(arr[i] + " ");
        }
        int[] arr2 = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            arr2[i]=arr[i];
        }
        System.out.print("复制的数字为:"+ arr2[3]);
    }
}
