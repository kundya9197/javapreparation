class Human {
    private int age;
    private String name;

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

public class EncapsulationProgram {
    public static void main(String args[]) {
        Human obj = new Human();
        obj.setAge(25);
        obj.setName("Kundan");

        System.out.println(obj.getName() + " is " + obj.getAge() + " years old.");
        System.out.println("-Encapsulation first program of the series");
    }
}
