//Victoria Buckner
//CS 314 01
//Assignment: Final
//This program will import the files given and read them and present the desired information. 

//Importing the file class to handle file inputs
import java.io.File;
//Importing Scanner class to read from the files and read user inputs.
import java.util.Scanner;
//Imports to handle possible file not found exceptions
import java.io.FileNotFoundException;

//Create the project class labeled Final
public class Final {
    //Create the main class inside the project class
    public static void main(String[] args) throws FileNotFoundException{
        
        //States there are 59 records in each file.
        final int size = 59;

        //Creating the arrays for the three files
        int[] years = new int[size];
        String[] winners = new String[size];
        String[] losers = new String[size];

        //Creating scanners for each file
        Scanner yearFile = new Scanner(new File("SuperBowlYear.txt"));
        Scanner winnerFile = new Scanner(new File("SuperBowlWinners.txt"));
        Scanner loserFile = new Scanner(new File("SuperBowlLosers.txt"));

        //Setting the index to 0 and reaing the file line for line
        //then adding it to the array
        int index = 0;
        while(yearFile.hasNextLine() && index < size)
        {
            years[index] = Integer.parseInt(yearFile.nextLine().trim());
            index++;
        }

        //Setting the index to 0 and reaing the file line for line
        //then adding it to the array
        index = 0;
        while(winnerFile.hasNextLine() && index < size)
        {
            winners[index] = winnerFile.nextLine().trim();
            index++;
        }

        //Setting the index to 0 and reaing the file line for line
        //then adding it to the array
        index = 0;
        while(loserFile.hasNextLine() && index < size)
        {
            losers[index] = loserFile.nextLine().trim();
            index++;
        }

        //Creating a scanner to read the user inputs
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;

        //Creating the menu for the user to choose from.
        while(choice != 5) {
            System.out.println("1. Display the winning team and losing team for a specific year");
            System.out.println("2. Display the years and number of times a specific team has won the super Bowl");
            System.out.println("3. Display the years and number of times a specific team has lost the Super Bowl");
            System.out.println("4. Display the number of times a specific team has been in the Super Bowl");
            System.out.println("5. Quit");

            //Letting the user choose what they want the program to do.
            System.out.print("Enter your choice: ");
            choice = keyboard.nextInt();
            keyboard.nextLine();

            //If the user chooses 1 it asks the year they want and then
            //pulls the winning and losing team from each array and displays it.
            if (choice == 1){
                System.out.print("Enter a year (1967 to 2025): ");
                int year = keyboard.nextInt();
                keyboard.nextLine();

                boolean found = false;
                for(int i = 0; i < size; i++){
                    if (years[i] == year) {
                        System.out.println("In " + year + ", " + winners[i] + " defeated " + losers[i]);
                        System.out.println();
                        found = true;
                        break;
                    }
                }
                
                //If it doesn't find the year entered it displays an error message.
                if (!found){
                    System.out.println("Invalid Input! Year not found!");
                }
            }
            //If the user enters 2 it will find the team they choose and display
            //which years they won and how many total wins they have. 
            else if (choice == 2){
                System.out.print("Enter team name: ");
                String team = keyboard.nextLine();
                int count = 0;

                for (int i = 0; i < size; i++){
                    if(winners[i].equalsIgnoreCase(team)){
                        System.out.println(team + " won in " + years[i]);
                        count++;
                    }
                }
                System.out.println("Total wins: " + count); 
                System.out.println();    
            }
            //If the user enters 3 it will find the team they choose and display
            //which years they lost and how many total losses they have.
            else if (choice == 3){
                System.out.print("Enter team name: ");
                String team = keyboard.nextLine();
                int count = 0;

                for (int i = 0; i < size; i++){
                    if(losers[i].equalsIgnoreCase(team)){
                        System.out.println(team + " lost in " + years[i]);
                        count++;
                    }
                }
                System.out.println("Total losses: " + count);
                System.out.println();
            }
            //If the user enters 4 it will find the team they choose and display
            //which years the team appeared in the Super bowl and how namy total appearances they have.
            else if (choice == 4){
                System.out.print("Enter team name: ");
                String team = keyboard.nextLine();
                int count = 0;

                for (int i = 0; i < size; i++){
                    if(winners[i].equalsIgnoreCase(team) || losers[i].equalsIgnoreCase(team)){
                        System.out.println(team + " appeared in " + years[i]);
                        count++;
                    }
                }
                System.out.println("Total appearances: " + count);
                System.out.println();
            }
            //If the user enters 5 it will quit the program.
            else if (choice == 5){
                System.out.println("Program Quit!");
            }
            //If the user enters something incorrect it will display an error message.
            else{
                System.out.println("Invalid Input. Please enter a number 1-5.");
                System.out.println();
            }  
        }   
    }
}


