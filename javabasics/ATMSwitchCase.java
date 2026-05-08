// package javabasics;

import java.util.Scanner;

// give option to user to check
// -check balance
// -withdraw
// -deposit
// and based on his option show following options to user
// -bank balance
// -money deposited
// -money withdraw
// do it using switch case
public class ATMSwitchCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM!! which operation you want to perform");

        System.out.println("1. Check balance");

        System.out.println("2. Withdraw amount");

        System.out.println("3. Deposite money");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your account balance is 5000");
                break;
            case 2:
                System.out.println("Amount withdrawn");
                break;
            case 3:
                System.out.println("Money deposited");
                break;
            default:
                System.out.println("Enter valid choice");
        }
    }
}
