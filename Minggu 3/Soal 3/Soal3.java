import java.util.Scanner;
import java.util.StringTokenizer;

public class Soal3 {
    public static void main(String[] args) {
        int hasil;
        String operasi;
        Scanner input = new Scanner(System.in);
        operasi = input.nextLine();
        input.close();
        StringTokenizer token = new StringTokenizer(operasi," ");
        
        int angka1 = Integer.parseInt(token.nextToken());
        String operator = token.nextToken();
        int angka2 = Integer.parseInt(token.nextToken());


        switch (operator) {
            case "+":
                hasil = angka1 + angka2;
                System.out.println(hasil);
                break;
            case "-":
                hasil = angka1 - angka2;
                System.out.println(hasil);
                break;
            case "*":
                hasil = angka1 * angka2;
                System.out.println(hasil);
                break;
            case "/":
                hasil = angka1 / angka2;
                System.out.println(hasil);
                break;
            case "%":
                hasil = angka1 % angka2;
                System.out.println(hasil);
                break;

            default:
                break;
        }   
    }  
}
