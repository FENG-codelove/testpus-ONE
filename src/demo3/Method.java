package demo3;

import java.util.Scanner;

public class Method {
    public static String add(int a, int b) {
        if (a<b){
            System.out.println("a<b");
            return "a<b";
        }else if(a>b){
            System.out.println("a>b");
            return "a>b";
        }else {
            System.out.println("a=b");
            return "a=b";
        }
    }
}
