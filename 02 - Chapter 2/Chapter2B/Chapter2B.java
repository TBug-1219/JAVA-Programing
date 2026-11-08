//Victoria Buckner
//CS 314 01
//Chapter 02 B
//This program will ask the user to input the length of 
//the row, the amount of space used by an end-post assembly,
//and the amount of space between vines. Then it will 
//calculate how many grapevines will fit in the row.

import java.util.Scanner;

public class Chapter2B
{
    public static void main(String[] args)
    {
        int V;
        int R;
        int E;
        int S;
        int multiplyE;
        int subE;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the length of the row (feet):");
        R = keyboard.nextInt();

        System.out.print("Enter the amount of space used by end-post assembly (feet):");
        E = keyboard.nextInt();

        System.out.print("Enter the space between the vines (feet):");
        S = keyboard.nextInt();

        multiplyE = E * 2;
        subE = R - multiplyE;
        V  = subE / S;

        System.out.println("You can plant " + V + " grapevines.");

    }
}