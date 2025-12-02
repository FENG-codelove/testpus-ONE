package demo2;
import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("猜一个数字(1-100)");
        int guess = sc.nextInt();
        while (guess < 1 || guess > 100) {
            System.out.println("输入错误，请重新输入：");
            guess = sc.nextInt();
        }
        while (num != guess){
            if (num > guess) {
                System.out.println("猜小了，请重新输入：");
                guess = sc.nextInt();
            } else {
                System.out.println("猜大了，请重新输入：");
                guess = sc.nextInt();
            }
        }
        System.out.println("恭喜你，猜对了！");
        }
    }

