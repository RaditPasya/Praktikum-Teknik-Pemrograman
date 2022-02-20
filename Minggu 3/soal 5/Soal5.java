import java.util.Scanner;
import java.util.StringTokenizer;

public class Soal5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0000;
        String mobil= input.nextLine();

        StringTokenizer token = new StringTokenizer(mobil," ");
        input.close();
        int mobil1 = Integer.parseInt(token.nextToken());
        int mobil2 = Integer.parseInt(token.nextToken());
        int mobil3 = Integer.parseInt(token.nextToken());
        int mobil4 = Integer.parseInt(token.nextToken());

        total = mobil1+mobil2+mobil3+mobil4;

        if (total%5==0) {
            System.out.println("Jalan");
        }
        else {
            System.out.println("Berhenti");
        }
    }
}
