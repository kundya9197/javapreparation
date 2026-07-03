class Car {
    public Car() {
        super();
        System.out.println("In car constructor");
    }

    public Car(int n) {
        super();
        System.out.println("In Car parameterised constructor");
    }
}

class Model extends Car {
    public Model() {
        super(); // super() method executes the constructor of the super class
        System.out.println("In Model constructor");
    }

    public Model(int n) {
        this(); // this() method executes the constructor of same class
        System.out.println("In model parameterised constructor");
    }
}

public class ThisAndSuper {
    public static void main(String args[]) {
        Model M = new Model(5); // whenever we create object of class which extends a parent class it will call
                                // both parents and clild class's constructors.
    }
}