class Mobile {
    String brand;
    static String category;
    int price;

    public void show() {
        System.out.println(category + " : " + brand + " is for " + price + " rupees/-");
    }

    public static void show1(Mobile mb) {
        System.out.println(mb.category + " : " + mb.brand + " is for " + mb.price + " rupees/- (via static method)");
    }
}

public class StaticMethod {
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

        Mobile.show1(mb);
    }
}
