public class NonPremitiveArrayBasics {
    public static void main(String args[]) {
        int numbers[] = { 2, 3, 4, 6 };

        // changing value of existing array
        numbers[3] = 5;
        System.out.println(numbers[3]);

        // checking length of array
        System.out.println(numbers.length);
    }
}
