import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
    double item = 50000;
    double gajiPokok= 500000;
    Scanner input = new Scanner(System.in);
    double penjualan = input.nextInt();
    input.close();

    // Bonus 25% dari total penjualan jika minimal 40
    // Bonus 35% dari total penjualan jika diatas 80
    // Bonus 10% selain diatas
    // Denda 15% dari total penjualan dibawah 15 ke gaji pokok
    
    if (penjualan>80) {
        System.out.println(((penjualan*item)*0.35)+gajiPokok);
    }
    else if (penjualan>=40) {
        System.out.println(((penjualan*item)*0.25)+gajiPokok);
    }
    else if (penjualan<15) {
        gajiPokok = gajiPokok - ((15*item)-(penjualan*item))*0.15;
        System.out.println(gajiPokok);  
    }
    else{
        System.out.println(((penjualan*item)*0.10)+gajiPokok);
    }    
    }
    
}
