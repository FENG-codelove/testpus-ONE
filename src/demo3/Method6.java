package demo3;

import java.util.Scanner;

public class Method6 {
    public static void add1(int []a) { // 修改返回类型为 int
        for (int i = 1; i <a.length; i++) {
            System.out.println(a[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        add1(arr);
    }
}
