//Victoria Buckner
//CS 314 01
//Chapter 6A
//This program will ask the user to input the temperature in 
//fahrenheit. It will then convert it to celsius and kelvin and
//display the temperatures in the different units.  

import java.util.Scanner;

public class Chapter6A
{
    public static void main(String [] args)
    {
        double inputTemp;
        Temperature temp;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        inputTemp = keyboard.nextDouble();

        temp = new Temperature(inputTemp);

        System.out.printf("Fahrenheit: %2f°F\n", temp.getFahrenheit());
        System.out.printf("Celsius: %.2f°C\n", temp.celsius());
        System.out.printf("Kelvin: %.2f K\n", temp.kelvin());
    }
}

class Temperature {
    
    private double ftemp;

    public Temperature (double ftemp)
    {
        this.ftemp = ftemp;
    }

    public void setFahrenheit(double ftemp)
    {
        this.ftemp = ftemp;
    }

    public double getFahrenheit()
    {
        return ftemp;
    }

    public double celsius()
    {
        return (5.0/9.0) * (ftemp - 32);
    }

    public double kelvin()
    {
        return ((5.0/9.0) * (ftemp - 32)) + 273.15;
    }
}
