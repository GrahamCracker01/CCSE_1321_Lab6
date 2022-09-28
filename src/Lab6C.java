//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab6C {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int intBalance = 1000;
        int intDosh;
        int intChoice;
        char charX;

        //initial output
        System.out.println("Welcome!\nYou have $" + intBalance + " in your account.\n");
        //loop
        do {

            //main menu
            System.out.print("\nMenu\n0 - Make a deposit\n1 - Make a withdrawal\n2 - Display account value\nPlease make a selection: ");
            intChoice = scan.nextInt();

            //deposit
            if (intChoice == 0) {
                System.out.print("How much would you like to deposit? : ");
                intDosh = scan.nextInt();
                intBalance = (intBalance + intDosh);
                System.out.println("Your current balance is $" + intBalance);
            }

            //withdraw
            else if (intChoice == 1) {
                System.out.print("How much would you like to withdraw? : ");
                intDosh = scan.nextInt();
                intBalance = (intBalance - intDosh);
                System.out.println("Your current balance is $" + intBalance);
            }

            //display account
            else if (intChoice == 2) {
                System.out.println("Your current balance is $" + intBalance);
            }

            //invalid entries
            else {
                System.out.println("Invalid entry, please try again.");
            }
            
            //should happen regardless
            System.out.print("Would you like to return to the main menu (Y/N)? : ");
            charX = scan.next().charAt(0);
        }

        //loop condition
        while (charX == 89 || charX == 121);

        //final output
        System.out.println("\nThank you for banking with us!");


    }
}