class Human {
    private int age;
    private String name;

    public Human() { // default constructor
        age = 25;
        name = "kundan";
    }

    public Human(int age, String name) { // parameterized constructor
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class DefaultAndParameterizedConstructorExample {
    public static void main(String args[]) {
        System.out.println("practicing default and parameterized constructor");
        Human obj = new Human();
        Human obj1 = new Human(25, "Sam");
        System.out.println(obj.getName() + " is " + obj.getAge() + " years old.");
        System.out.println(obj1.getName() + " is " + obj1.getAge() + " years old.");
    }
}
