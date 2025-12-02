package demo;

import java.util.Scanner;

public class IfTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个两个数字:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + "大于" + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + "小于" + num2);
        } else {
            System.out.println(num1 + "等于" + num2);
        }
    }
}
