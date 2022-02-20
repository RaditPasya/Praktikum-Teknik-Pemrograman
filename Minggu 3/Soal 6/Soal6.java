import java.util.Scanner;
import java.math.BigInteger;


public class Soal6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Big Integer 1: ");
        String input1 = keyboard.nextLine();
        System.out.print("Big Integer 2: ");
        String input2 = keyboard.nextLine();
        keyboard.close();

        BigInteger angka1 = new BigInteger(input1);
        BigInteger angka2 = new BigInteger(input2);

        BigInteger jumlah, kali;

        jumlah = angka1.add(angka2);
        kali   = angka1.multiply(angka2);

        System.out.println(jumlah);
        System.out.println(kali);


    }
    
}
