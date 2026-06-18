class Mobile {
    String brand;
    static String category;
    int price;

    public void show() {
        System.out.println(category + " : " + brand + " is for " + price + " rupees/-");
    }
}

public class StaticVariable {
    public static void main(String args[]) {
        Mobile mb = new Mobile();
        mb.brand = "iPhone";
        Mobile.category = "SmartPhone";
        mb.price = 50000;

        Mobile mb2 = new Mobile();
        mb2.brand = "Samsung";
        Mobile.category = "SmartPhone";
        mb2.price = 60000;
        mb.show();
        mb2.show();
    }
}
