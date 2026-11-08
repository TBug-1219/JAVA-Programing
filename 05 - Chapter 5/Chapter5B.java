//Victoria Buckner
//CS 314 01
//Chapter 05B
//This program will ask the user ro input the number of days they spent in 
//the hospital. Then it will ask for the extra charges (medical, surgical
//lab and physical rehabilitation). After it has the info it will calculate
//the base charge for the days, the other miscelanious charges, and the
//total of those charges combined. Then it will display the results. 
//Extra Credit has been added

import java.util.Scanner;

public class Chapter5B {
    public static double CalcStayCharges(int days)
    { return days * 575;}

    public static double CalcMiscCharges(double med, double sur, double lab, double rehab)
    { return med + sur + lab + rehab;}

    public static double CalcTotalCharges(double stayCharges, double miscCharges)
    { return stayCharges + miscCharges;}

    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int days;
        double med;
        double sur;
        double lab;
        double rehab;
        double stayCharges;
        double miscCharges;
        double totalCharges;

        try
        {
            do
            {
                System.out.print("Enter the number of days spent in the hospital (must be > 0): ");
                days = keyboard.nextInt();
                if (days <= 0) 
                    {System.out.print("Invalid Input! Enter a number greater than 0: ");}
            }
            while (days <= 0);

            System.out.print("Enter medication charges: $");
            med = keyboard.nextDouble();

            System.out.print("Enter surgical charges: $");
            sur = keyboard.nextDouble();

            do
            {
                System.out.print("Enter lab charges: $");
                lab = keyboard.nextDouble();
                if (lab < 0 || lab > 2000)
                    {System.out.print("Invalid Input! Enter a number greater than 0 or less than 2000: $");}
            }
            while (lab < 0 || lab > 2000);

            System.out.print("Enter rehab charges: $");
            rehab = keyboard.nextDouble();

            stayCharges = CalcStayCharges(days);
            miscCharges = CalcMiscCharges(med, sur, lab, rehab);
            totalCharges = CalcTotalCharges(stayCharges, miscCharges);

            System.out.printf("Number of days spent in hospital: %d\n", days);
            System.out.printf("Base charges: $%.2f\n", stayCharges);
            System.out.printf("Miscellaneous Charges: $%.2f\n", miscCharges);
            System.out.printf("Total Charges: $%.2f\n", totalCharges);
        }
        finally {}
    }
}
