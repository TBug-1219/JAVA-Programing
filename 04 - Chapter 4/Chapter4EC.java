//Victoria Buckner
//CS 314 01
//Chapter 04 EC
//This program will ask the user to input their guess of color. 
//Then it will randomly choose one and see if they match. If they
//do match it will tell them it is correct. If it doesn't match
//it will let them know it is wrong. Once all 10 rounds have been
//done, it will display how many the user answered correctly. 

import java.util.Random;
import java.util.Scanner;

public class Chapter4EC {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random color = new Random();
        
        String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
        int corrGuesses, i, randomIndex;
        String selColor, userGuess;

        corrGuesses = 0;
        
        
        for (i = 0; i < 10; i++) {
            randomIndex = color.nextInt(5);
            selColor = colors[randomIndex];
            
            System.out.print("Enter your guess (Red, Green, Blue, Orange, Yellow): ");
            userGuess = keyboard.nextLine();
            
            if (userGuess.equalsIgnoreCase(selColor)) {
                System.out.println("Correct!");
                corrGuesses++;
            } else {
                System.out.println("Wrong!");
            }

            System.out.println("Computer chose: " + selColor);
        }
        
        System.out.println("You got " + corrGuesses + " correct.");
    }
}
