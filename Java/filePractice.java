package Java;
import java.util.*;

import java.util.Scanner;

public class filePractice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double balance = 1000.0;
        boolean running = true;

        System.out.println("--- Welcome to Java Bank ---");

        while (running) {
            System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = reader.nextInt();

            if (choice == 1) {
                System.out.println("Your balance is: $" + balance);
            } 
            else if (choice == 2) {
                    System.out.print("Enter deposit amount: ");
                    double deposit = reader.nextDouble(); 
                if (deposit <= 0) {
                    System.out.println("\nError: Invalid deposit amount!");
                    break;
                }
                    balance += deposit;
                    System.out.println("\nDeposit successful!");
            } 
            else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                double withdraw = reader.nextDouble();
                if (withdraw <= 0) {
                    System.out.println("\nError: Invalid withdrawal amount!");
                    break;
                }
                if (withdraw > balance) {
                    System.out.println("\nError: Insufficient funds!");
                } else {
                    balance -= withdraw;
                    System.out.println("\nPlease take your cash.");
                }
            } 
            else if (choice == 4) {
                System.out.println("\nThank you for using Java Bank. Goodbye!");
                running = false;
            } 
            else {
                System.out.println("\nInvalid option. Try again.");
            }
        }
        
        reader.close();
    }
}

