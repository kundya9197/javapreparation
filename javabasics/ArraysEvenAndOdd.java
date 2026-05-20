public class ArraysEvenAndOdd {
    public static void main(String args[]) {

        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                System.out.println("Even number is : " + nums[i]);
                evenCount++;
            } else {
                System.out.println("Odd number is : " + nums[i]);
                oddCount++;
            }
        }

        System.out.println("Total even numbers : " + evenCount);
        System.out.println("Total odd numbers : " + oddCount);
    }
}