//This is the Payroll Class


public class Payroll {
    private String name;
    private int IdNumber;
    private double payRate;
    private double hoursWorked;

    public Payroll (String name, int IdNumber)
    {
        this.name = name;
        this.IdNumber = IdNumber;
        this.payRate = 0.0;
        this.hoursWorked = 0.0;
    }

    public String getName()
    { return name; }

    public int getIdNumber()
    { return IdNumber; }

    public double getPayRate()
    { return payRate; }

    public double getHoursWorked()
    { return hoursWorked; }

    public void setPayRate(double payRate)
    {
        if (payRate >= 0)
        { this.payRate = payRate; }
        else
        { System.out.println("Invalid input!"); }
    }

    public void setHoursWorked(double hoursWorked)
    {
        if (hoursWorked >= 0)
        { this.hoursWorked = hoursWorked; }
        else
        { System.out.println("Invalid Input!");}
    }

    public double grossPay()
    { return payRate * hoursWorked; }

}
