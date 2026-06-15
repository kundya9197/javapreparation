class Mobile {

    public void brand() {
        System.out.println("iPhone");
        System.out.println("Samsung");
        System.out.println("Google");
    }

    public String features(int price) {
        if (price == 50000) {
            System.out.println("iPhone has exciting camera");
        } else if (price == 60000) {
            System.out.println("Samsung has good video shooting stability");
        } else if (price >= 80000) {
            System.out.println("Google has all of features");

        } else {
            System.out.println("We dont have phones less than 50,000/- rupees");
        }
        return "Phones";
    }
}

public class ParcticeMethodsOne {

    public static void main(String args[]) {
        Mobile mb = new Mobile();
        mb.brand();
        mb.features(60000);
    }
}
