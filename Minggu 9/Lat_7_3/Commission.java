package Lat_7_3;

public class Commission extends Hourly {

    private double totalSales;
    private double comRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNum, double rate, double comrate){
        super(eName, eAddress, ePhone, socSecNum, rate );
        comRate = comrate;
    }

    public void addSales(double totalSales){
        this.totalSales += totalSales;
    }

    public double pay(){

        double payment = super.pay() + (this.totalSales * comRate);
        this.totalSales = 0;
        return payment;
        
    }

    @Override

    public String toString(){
        String result = super.toString();
        
        result += "\nTotal Sales: " + totalSales;

        return result;
    }
}
