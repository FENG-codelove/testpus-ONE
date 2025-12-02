package demo2;

import java.util.Random;

public class Array5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100)+1;
            if (i%3 == 0 && i%5 == 0 &&i%7 != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
