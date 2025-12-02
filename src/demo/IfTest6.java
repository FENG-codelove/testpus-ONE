package demo;

import java.util.Scanner;

public class IfTest6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("考试分数:");
        int score = input.nextInt();
        if (score >=95 && score<=100) {
            System.out.println("ipad");
        }
        else if (score >=90 && score<=94) {
            System.out.println("bike");
        } else if (score >=80 && score<=89) {
            System.out.println("labubu");
        }else if (score <80){
            System.out.println("fuck you!><!");
        }else {
            System.out.println("you are a good student!");
        }
    }
}

