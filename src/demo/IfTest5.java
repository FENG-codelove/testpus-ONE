package demo;

import java.util.Scanner;

public class IfTest5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个星期数:");
        int dayOfWeek = input.nextInt();
        if (dayOfWeek == 1 ) {
            System.out.println("星期一");
        } else if (dayOfWeek == 2 ) {
            System.out.println("星期二");
        } else if (dayOfWeek == 3) {
            System.out.println("星期三");
        } else if (dayOfWeek == 4 ) {
            System.out.println("星期四");
        } else if (dayOfWeek == 5 ) {
            System.out.println("星期五");
        } else if (dayOfWeek == 6) {
            System.out.println("星期六");
        } else if (dayOfWeek == 7 ) {
            System.out.println("星期日");
        } else {
            System.out.println("输入错误");
        }
    }
}
