//Victoria Buckner
//CS 314 01
//Chapter 7A
//This program is going to read the file provided and assign the numbers from
//the file to the correct days of the month and then it will calculate the
//average steps taken in each month and display them. 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Chapter7A
{
    public static void main(String[] args) throws FileNotFoundException
    {
        final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        final String[] monthNames = {"January", "February", "March", "April", "May",
                                    "June", "July", "August", "September", "October",
                                    "November", "December"};
        int[] steps = new int[365];
        int index = 0;

        File file = new File("steps.txt");
        Scanner keyboard = new Scanner(file);

        while (keyboard.hasNextLine() && index < 365)
        {
            steps[index] = Integer.parseInt(keyboard.nextLine().trim());
            index++;
        }

        int stepIndex = 0;
        for(int i = 0; i < 12; i++)
        {
            int monthTotal = 0;
            for (int j = 0; j < daysInMonth[i]; j++)
            {
                monthTotal += steps[stepIndex];
                stepIndex++;
            }

            double average = (double) monthTotal/daysInMonth[i];
            System.out.printf("%s: %.2f steps%n", monthNames[i], average);
        }
    }
}

