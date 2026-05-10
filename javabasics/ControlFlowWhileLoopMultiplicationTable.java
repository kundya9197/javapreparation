
// Multiplication Table: Prompt the user for a number and print its multiplication table (up to 10) using a while loop.
import java.util.Scanner;

public class ControlFlowWhileLoopMultiplicationTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print it's table");
        int input = sc.nextInt();
        int num = 1;

        while (num <= 10) {
            System.out.println(input + "*" + num + "=" + input * num);
            num++;
        }
    }
}