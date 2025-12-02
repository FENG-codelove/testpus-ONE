package demo3;

import java.util.Scanner;

public class Method4 {
    public static int add1(int a) { // 修改返回类型为 int
        for (int i = 1; i <= 1000; i++) {
            a = a + i;
        }
        int sum = a;
        return sum; // 返回计算后的和
    }

    public static void main(String[] args) {
        int a = 0; // 声明并初始化变量 a
        int result = add1(a); // 调用 add1 并接收返回的 int 值
        System.out.println("结果: " + result); // 打印结果
    }
}
