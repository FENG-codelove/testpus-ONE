package demo3;

import java.util.Random;
import java.util.Scanner;

class GamePlay {
    //定义全局变量
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    private static int totalScore = 0;
    private static int totalScoreMax = 0;

    public static void main(String[] args) {
        System.out.println("一起来玩吧");
        boolean isGameOver = false;
        while (!isGameOver) {
            System.out.println("游戏进行中...");
            int choice = showMenu();
            switch (choice) {
                case 1:
                    //猜数字游戏
                    guessNumber();
                    showScore();
                    break;
                case 2:
                    //掷色子游戏
                    throwDice();
                    showScore();
                    break;
                case 3:
                    //数字运算游戏
                    MathGame();
                    showScore();
                    break;
                case 0:
                    //退出游戏
                    isGameOver = true;
                    break;
                default:
                    System.out.println("输入错误，请重新输入！");
            }
        }

    }

    public static int showMenu() {
        System.out.println("\n=====欢迎来到游戏菜单=====");
        System.out.println("1. 猜数字游戏");
        System.out.println("2. 掷色子游戏");
        System.out.println("3. 数字运算游戏");
        System.out.println("0. 退出游戏");
        System.out.print("请选择游戏：");
        return scanner.nextInt();
    }

    public static void guessNumber() {
        //猜数字游戏
        System.out.println("猜数字游戏");
        int number = random.nextInt(100) + 1; //生成1-100之间的随机数
        boolean guess = false;
        int attempts = 0;
        while (!guess) {
            System.out.print("请输入你猜的数字1~100：");
            int guessNumber = scanner.nextInt();
            attempts++;
            int score = Math.max(0, 100 - (attempts * 10));
            if (guessNumber < 1 && guessNumber > 100) {
                System.out.println("输入错误，请重新输入！");
            } else if (guessNumber > number) {
                System.out.println("你猜的数字大了！");
            } else if (guessNumber < number) {
                System.out.println("你猜的数字小了！");
            } else {
                System.out.println("恭喜你，猜对了！");
                guess = true;
                totalScore += score;
                System.out.println("你总共猜了" + attempts + "次，得分：" + score);
                System.out.println("当前总分：" + totalScore);
            }
        }
    }

    //掷色子游戏
    public static void throwDice() {
        System.out.println("掷色子游戏");
        System.out.println("输入掷出的色子数目(1~5)：");
        int diceNum = scanner.nextInt();
        if (diceNum < 1 || diceNum > 5) {
            System.out.println("输入错误，请重新输入！");
        }
        int total = 0;
        for (int i = 0; i < diceNum; i++) {
            int dice = random.nextInt(6) + 1; //生成1-6之间的随机数
            System.out.println("第" + (i + 1) + "个色子：" + dice);
            total += dice;
        }
        System.out.println("总点数：" + total);
        int score = total * 5;
        System.out.println("得分：" + score);
        totalScore += score;
        System.out.println("当前总分：" + totalScore);
    }

    public static void MathGame() {
        System.out.println("数字运算游戏");
        System.out.println("选择难度：\n1.简单\n2.中等\n3.困难");
        int difficulty = scanner.nextInt();
        int questionsCount = 5;
        int correctCount=0;
        for (int i = 1; i <= questionsCount; i++) {
            int num1,num2,correctAnswer;
            char operator;
            if (difficulty == 1){
                num1 = random.nextInt(10) + 1;
                num2 = random.nextInt(10) + 1;
                operator = getRandimOperator(1);
            }else if (difficulty == 2){
                num1 = random.nextInt(50) + 1;
                num2 = random.nextInt(50) + 1;
                operator = getRandimOperator(2);
            }else{
                num1 = random.nextInt(100) + 1;
                num2 = random.nextInt(100) + 1;
                operator = getRandimOperator(3);
            }
            switch (operator) {
                case '+':
                    correctAnswer = num1 + num2;
                    break;
                case '-':
                    correctAnswer = num1 - num2;
                    break;
                case '*':
                    correctAnswer = num1 * num2;
                    break;
                default:
                    correctAnswer = num1 / num2;
                    break;
            }
            System.out.println("第"+i+"题："+num1+" "+operator+" " + num2 + "=");
           int userAnswer = scanner.nextInt();
            if (userAnswer == correctAnswer) {
                System.out.println("答对了！");
                correctCount++;
            } else {
                System.out.println("答错了！正确答案是：" + correctAnswer);
            }
        }

        int score = correctCount * 20;
        totalScore += score;
        System.out.println("\n答对:"+correctCount+" 得分:"+score);
        System.out.println("当前总分：" + totalScore);
    }

    //获取随机运算符
    public static char getRandimOperator(int difficulty) {
        int choice;
        if (difficulty == 1) {
            choice = random.nextInt(2);
            // + -
        } else if (difficulty == 2) {
            choice = random.nextInt(3);
            //+ -*
        } else {
            choice = random.nextInt(4);
            //+ - * /
        }
        switch (choice) {
            case 0:
                return '+';
            case 1:
                return '-';
            case 2:
                return '*';
            default:
                return '/';
        }
    }

    public static void showScore() {

        if(totalScoreMax<totalScore){
            totalScoreMax = totalScore;
            System.out.println("你破了！");
        }
            System.out.println("最高分:"+totalScoreMax);
    }
}
