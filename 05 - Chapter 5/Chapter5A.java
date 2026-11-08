//Victoria Buckner
//CS 314 01
//Chapter 5A
//This program will ask the user to input a distance in meters then give them the option to
//convert it to kilometers, inches, or feet. The program will then convert the meters given 
//the command the user inputs and display the answer. To quit the program all the user needs
//to do is choose option 4 and the program will quit. 

import java.util.Scanner;

public class Chapter5A {
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        double meters;
        int choice;

        do{
            System.out.print("Enter a distance in meters: ");
            meters = keyboard.nextDouble();
            if (meters < 0)
            {System.out.print("Distance cannot be negative. Please enter a non-negative number.");}
        }
        while (meters < 0);

        do {
            menu();
            System.out.print("Enter your choice: ");
            choice = keyboard.nextInt();

            if (choice == 1)
            {findKilometers(meters);}
            else if (choice == 2)
            {findInches(meters);}
            else if (choice == 3)
            {findFeet(meters);}
            else if (choice == 4)
            {System.out.println("Bye!");}
            else 
            {System.out.println("Error! Invalid input. Please choose a number (1-4): ");}
        }

        while (choice != 4);
    }

    public static void menu()
    {
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }

    public static void findKilometers(double meters)
    {
        double kilometers;
        kilometers = meters * 0.001;
        System.out.printf("%.2f meters is %.3f kilometers.%n", meters, kilometers);
    }

    public static void findInches(double meters)
    {
        double inches;
        inches = meters * 39.37;
        System.out.printf("%.2f meters is %.3f inches.%n", meters, inches);
    }

    public static void findFeet(double meters)
    {
        double feet;
        feet = meters * 3.281;
        System.out.printf("%.2f meters is %.3f feet.%n", meters, feet);
    }
}
