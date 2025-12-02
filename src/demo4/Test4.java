package demo4;

public class Test4 {
    public static int method1(int n) {
        if(n ==1){
            return 1;
        }
        return n * method1(n-1);
    }

    public static void main(String[] args) {
        method1(5);
        System.out.println(method1(5));
    }
}

