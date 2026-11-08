//Victoria Buckner
//CS 314 01
//Chapter 03 A
//This program will ask the user to input the weight
//of their package and the distance it will be traveling.
//Then it will determine the shipping price for that 
//weight and distance. 

import java.util.Scanner;
public class Chapter3B 
{
    public static void main(String[] args)
    {
        double rate, weight, totalCost;
        int distance, shippingCharges;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the Weight of the package: ");
        weight = keyboard.nextDouble();

        System.out.print("Enter the distance: ");
        distance = keyboard.nextInt();

        if (weight <= 2)
        { rate = 1.10; }

        else if (weight <= 6)
        { rate = 2.20; }

        else if (weight <= 10)
        { rate = 3.70; }

        else 
        { rate = 3.80; }

        shippingCharges = distance/500;
        totalCost = shippingCharges * rate;

        System.out.printf("The shipping cost is: $%.2f\n", totalCost);
    }
}
