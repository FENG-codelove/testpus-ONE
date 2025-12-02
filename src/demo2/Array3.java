package demo2;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
    int []  arr = new int[3];
        System.out.println(arr);
        arr[1]=100;
        int [] arr2 = arr;
        arr2[1]=1000;
        System.out.println(arr[1]);
        System.out.println(arr2[1]);

    }
}
