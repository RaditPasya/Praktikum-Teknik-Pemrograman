package Lat_7_3;

public class Executive extends Employee{
    private double bonus;

    public Executive (String eName, String eAddress, String ePhone, String socsecNumber, double rate){
        super (eName, eAddress, ePhone, socsecNumber, rate) ;
        bonus = 0; // bonus has yet to be awarded
    }

    public void awardBonus(double execBonus){
        bonus = execBonus;
    }

    public double pay(){
        double payment = super.pay() + bonus;

        bonus = 0;
        return payment;
    }

    
}
