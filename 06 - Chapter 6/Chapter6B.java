//Victoria Buckner
//CS 314 01
//This program will ask the user for their name, Id number, pay rate
//and hours worked. Then it will work through the different classes 
//to calculate the gross pay for that employee then display their 
//gross pay. 

import java.util.Scanner;

public class Chapter6B {

    public static void main(String[] args)
    {
        String name;
        int IdNumber;
        double payRate;
        double hoursWorked;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        name = keyboard.nextLine();

        System.out.print("Enter employee Id number: ");
        IdNumber =keyboard.nextInt();

        Payroll employee = new Payroll(name, IdNumber);

        System.out.print("Enter hourly pay rate: ");
        payRate = keyboard.nextDouble();
        employee.setPayRate(payRate);

        System.out.print("Enter number of hours worked: ");
        hoursWorked = keyboard.nextDouble();
        employee.setHoursWorked(hoursWorked);

        System.out.print("Gross pay for " + employee.getName() + ": $" + employee.grossPay());


    }
}
