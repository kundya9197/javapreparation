public class ArrayMinimumNumber {
    public static void main(String args[]) {
        int numbers[] = { 4, 5, 7, 8, 3 };
        int min = numbers[0];

        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number in array is : " + min);
    }
}
