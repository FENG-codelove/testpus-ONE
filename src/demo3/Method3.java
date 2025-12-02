package demo3;

import java.util.Scanner;

public class Method3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入数字: ");
        int num = scanner.nextInt();
        String result = Method2.add(num);
        System.out.println("结果: " + result);
    }
}
