package demo4;

public class Test1 {
    public static void main(String[] args) {
        animal dog = new animal();
        dog.name = "旺财";
        dog.age = 3;
        dog.type = "狗";
        System.out.println("动物的名字:"+dog.name);
        System.out.println("动物的年龄"+dog.age);
        System.out.println("动物的种类"+dog.type);
        dog.eat();
        dog.sleep();
    }
}
