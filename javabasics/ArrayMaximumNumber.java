public class ArrayMaximumNumber {
    public static void main(String args[]) {
        int numbers[] = { 17, 12, 5, 8, 24, 20 };
        int max = numbers[0];

        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum number in array is : " + max);
    }
}
