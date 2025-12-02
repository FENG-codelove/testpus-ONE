package demo4;

public class Phone {
     String brand;
     String model;
     int price;
    String color;

    public void call(String number) {
        System.out.println("给***打电话");
    }
    public String sendMsg(String number, String message) {
        System.out.println("给***发送短信");
        return "短信已发送";
    }
}
