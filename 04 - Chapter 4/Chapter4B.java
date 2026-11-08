//Victoria Buckner
//CS 314 01
//Chapter 04 B
//This program will ask the user for the number of floors in the hotel.
//It will then use that number for the loop to ask the user for the 
//number of rooms on the floor and the number of rooms occupied on that
//floor. Then it will calculate and display the total number of rooms, 
//total rooms occupied, total vacant rooms, and the occupancy rate. 

import java.util.Scanner;
public class Chapter4B
{
    public static void main(String[] args)
    {
        int occupied, rooms, floors, totOcc, totRoom, totVac, i;
        double occRate;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the number of floors in the hotel: ");
        floors = keyboard.nextInt();

        totRoom = 0;
        totOcc = 0;

        for (i = 1; i <= floors; i++)
        {
            System.out.print("Rooms on floor " + i + ": ");
            rooms = keyboard.nextInt();

            System.out.print("Occupied Rooms: ");
            occupied = keyboard.nextInt();

            totRoom += rooms;
            totOcc += occupied;
        }

        totVac = totRoom - totOcc;
        occRate = ((double)totOcc/totRoom);

        System.out.println("Total number of rooms: " + totRoom);
        System.out.println("Total rooms occupied: " + totOcc);
        System.out.println("Number of vacant rooms: " + totVac);
        System.out.println("Occupancy Rate: " + occRate);

    }
}
