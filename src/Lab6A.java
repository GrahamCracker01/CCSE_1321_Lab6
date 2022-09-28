//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab6A {
    public static void main(String[] args){

        //declare scanner and variable
        Scanner scan = new Scanner(System.in);
        int intNumHighest = 1;

        //starting output
        System.out.println("Please enter 10 numbers and this program will display the largest.\n");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Please enter number " + i + ": ");
            int intNumUser = scan.nextInt();
            if (intNumHighest < intNumUser) {
                intNumHighest = intNumUser;
            }
        }
        System.out.println("\nThe largest number was " + intNumHighest);

    }
}