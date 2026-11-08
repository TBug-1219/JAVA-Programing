//Victoria Buckner
//CS 314 01
//Chapter 02 A
//This program  will take the number of surveyed customers
//calculate and  display how many of them purchase energy
//drinks and how many of them prefer cirtrus-flavored
//energy drinks.

public class Chapter_02_A
{
    public static void main(String[] args)
    {
        double customers, totalPurchased, totalPreferred;

        customers = 12467;
        totalPurchased = customers  * .14;
        totalPreferred = totalPurchased * .64;

        System.out.println("About " + totalPurchased + " customers purchased one or more energy drink.");
        System.out.println("About " + totalPreferred + " of those customers preferred cirtus flavor.");
        

    }
}