class Calculator {
    public int addTwoNumbers(int n1, int n2) {
        return n1 + n2;
    }
}

public class PracticeMethodOverloading {
    public static void main(String args[]) {
        Calculator obj = new Calculator();
        int r1 = obj.addTwoNumbers(5, 5);
        System.out.println("Addition of first two numbers is : "+r1);
    }
}
