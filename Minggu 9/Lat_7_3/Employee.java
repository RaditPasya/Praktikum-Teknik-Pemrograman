package Lat_7_3;

public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String eName, String eAddress, String ePhone, String socSecNum, double rate){
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNum;
        payRate = rate;
    }

    public String toString(){
        String result = super.toString();

        result += "\nSocial Security Number: " + socialSecurityNumber;

        return result;
    }

    public double pay(){
        return payRate;
    }
}
