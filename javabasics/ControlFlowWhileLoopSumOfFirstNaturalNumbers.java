
// sum of first n natural numbers
// (e.g. if n=5, the output should be 1+2+3+4+5=15)

import java.util.Scanner;

public class ControlFlowWhileLoopSumOfFirstNaturalNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate sum");
        int input = sc.nextInt();
        int current = 1;
        int result = 0;
        while (current <= input) {
            result = result + current;
            System.out.println("Adding " + current + ", current total: " + result);
            current++;

        }
        System.out.println("Final Sum of first " + input + " numbers is: " + result);
        sc.close();
    }
}
