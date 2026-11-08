//Victoria Buckner
//CS 314 01
//Chapter 03 A
//This program asks the user for the variable and the distance to be traveled.
//Then it will find the variable that is correct and do the coresponding
//calculation. Once done it will display the time it would take for the sound
//to travel that distance in that variable. 

import java.util.Scanner;
public class Chapter3A
{
    public static void main(String[] args)
    {
        String variable;
        double distance;
        double time;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter variable (air, water, or steel): ");
        variable = keyboard.nextLine();

        System.out.print("Enter distance the sound wave will travel (feet): ");
        distance = keyboard.nextDouble();

        time = 0;

        if (variable.equalsIgnoreCase("air"))
        {
            time = distance/1100;
            System.out.print("It would take " +  time + " seconds for the sound to travel.");

        }

        else if (variable.equalsIgnoreCase("water"))
        {
            time = distance/4900;
            System.out.print("It would take " +  time + " seconds for the sound to travel.");

        }

        else if (variable.equalsIgnoreCase("steel"))
        {
            time = distance/16400;
            System.out.print("It would take " +  time + " seconds for the sound to travel.");

        }

        else 
        {
            System.out.print("Invalid Input. Enter correct variable.");
        }

    }
}
