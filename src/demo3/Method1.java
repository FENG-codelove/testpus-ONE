package demo3;


import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.print("输入数字: ");
           int num = sc.nextInt();
           int num2 = sc.nextInt();
           String result = Method.add(num, num2);
           System.out.println("结果为: " + result);
    }
}
