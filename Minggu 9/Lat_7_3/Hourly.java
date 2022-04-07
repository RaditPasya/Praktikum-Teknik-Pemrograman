package Lat_7_3;

public class Hourly extends Employee{
    private int hoursWorked;

    public Hourly(String eName, String eAddress, String ePhone, String socSecNum, double rate){

        super(eName, eAddress, ePhone, socSecNum, rate);
        hoursWorked = 0;
    }

    public void addHours(int moreHours){
        hoursWorked += moreHours;
    }

    public double pay(){
        double payment = payRate * hoursWorked;

        hoursWorked = 0;
        return payment;
    }
    @Override
    public String toString(){ 
        String result = super.toString();

        result += "\nCurrent hours: " + hoursWorked;

        return result;

    }
}
