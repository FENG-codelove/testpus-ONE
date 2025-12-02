package JavaTest;

public class test1 {
    public static void main(String[] args) {
        String name = "fz";
        //1.获取字符串的长度
        System.out.println("长度" +name.length());
        //2.获取字符串的某个字符
        System.out.println("获得第二字符" +name.charAt(1));
        //3.遍历字符串
        for (int i = 0; i <name.length(); i++) {
            char c = name.charAt(i);
            System.out.println(c);
        }
        //4.字符串转换成数组
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            System.out.println(c);
        }
        //5.equal 判断字符串内容 内容一样就返回 true
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        //6.equalsIgnoreCase 判断字符串内容 不区分大小写
        String s3 = new String("hello");
        String s4 = new String("HELLO");
        System.out.println(s3.equalsIgnoreCase(s4));
        //7.截取字符串(包前不包后)
        String s5 ="fznb666";
        String st = s5.substring(2,5);
        System.out.println(st);
        //8.替换字符串为新内容
        String s6 = "wc dj  淦 你的 wc";
        String new_s6 = s6.replace("wc","**");
        System.out.println(s6);
        System.out.println(new_s6);
        //9.是否包含某个关键字(contains)
        String s7 = "fznb123555555555!!";
        System.out.println(s7.contains("fznb"));
        //10.判断字符串以某个字符开头(startsWith) 结尾为(endsWith)
        String s8 = "hello world fznb";
        System.out.println(s8.startsWith("hello"));
        //11.分割字符串(split)
        String s9 = "python,c++,scala,java";
        String[] codes = s9.split(",");
        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i]);
        }
    }

}
