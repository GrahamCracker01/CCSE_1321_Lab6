//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
import java.util.Random;

class Lab6B {
    public static void main(String[] args){

        //declare objects and variables
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int intUser;
        int intGuess = 0;

        //starting output and get number
        System.out.println("Enter a number between 1 and 1000: ");
        intUser = scan.nextInt();

        //loop guessing number and counting guesses
        int i = 0;
        while ((intUser > 1) && (intUser < 1001) && intGuess != intUser) {
            intGuess = (rand.nextInt(1000) + 1);
            System.out.println("My guess was " + intGuess);
            i++;
        }
        System.out.println("\nI guessed the number was " + intUser + " and it only took me " + i + " guesses");

    }
}