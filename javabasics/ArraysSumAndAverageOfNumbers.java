// Sum & Average
// Problem: Create an integer array with 5 elements (e.g., {12, 45, 7, 23, 9}). 
// Write a program to calculate the total sum and the average of all the elements.

// Logic Hint: You need a loop to visit every index from 0 to array.length - 1, 
// adding the value at each step to a sum variable. 
// For the average, divide the final sum by the array's length (watch out for integer division!).

public class ArraysSumAndAverageOfNumbers {
    public static void main(String args[]) {
        int Numbers[] = { 5, 7, 12, 6, 2 };
        int sum = 0;
        double average;
        for (int i = 0; i <= Numbers.length - 1; i++) {
            sum = sum + Numbers[i];

        }
        average = (double) sum / Numbers.length;

        System.out.println("Total sum:" + sum);
        System.out.println("Average is:" + average);
    }
}
