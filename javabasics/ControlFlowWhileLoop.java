// The Countdown: Write a program that takes a number from the user and counts down to zero, printing each number on a new line.

import java.util.Scanner;

public class ControlFlowWhileLoop {
    public static void main(String args[]) {
        // int inupt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = sc.nextInt();

        if (input < 0) {
            System.out.println("Number is already below 0!");
        }

        while (input >= 0) {
            System.out.println(input);
            input--;
        }
        
        sc.close();
    }
}
