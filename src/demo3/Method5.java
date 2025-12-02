package demo3;

import java.util.Scanner;

public class Method5 {
    public static int add1(int a) { // 修改返回类型为 int
        for (int i = 1; i <=a; i++) {
            System.out.println("我真是牛逼");
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数: ");
       int num = scanner.nextInt();
        int result = add1(num);
    }
}
