//Victoria Buckner
//CS 314 01
//Chapter 03 A
//This program will ask the user to input
//a string of numbers. To end that string
//they need to type -99. The program will
//them display the total of the numbers 
//and the highest and lowest number.

import java.util.Scanner;
public class Chapter4A
{
    public static void main(String[] args)
    {
        int number, total, highest, lowest;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a number or enter -99 to end.");

        lowest = Integer.MAX_VALUE;
        highest = Integer.MIN_VALUE;
        total = 0;

        System.out.print("Enter a number:");
        while((number = keyboard.nextInt()) != -99)
        {
            total += number;
            if (number < lowest) lowest = number;
            if (number > highest) highest = number;
        }
        
        System.out.println("The total of the numbers is: " + total);
        System.out.println("The lowest number is: " + lowest);
        System.out.println("The highest number is: " + highest);
    }
}
