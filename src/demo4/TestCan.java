package demo4;

public class TestCan {
    public static void main(String[] args) {
    String result =cnocat("hello", "world", "!");
        System.out.println(result);
        }
        public static String cnocat(String... str) {
        String s = " ";
            for (int i = 0; i < str.length; i++) {
                s += str[i];
            }
            return s;
        }
}
