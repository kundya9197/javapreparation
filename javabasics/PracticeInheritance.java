class Calc {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class AdvCalc extends Calc {
    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

public class PracticeInheritance {
    public static void main(String args[]) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.sum(5, 05);
        int r2 = obj.sub(7, 05);
        int r3 = obj.multi(7, 05);
        int r4 = obj.div(10, 02);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}
