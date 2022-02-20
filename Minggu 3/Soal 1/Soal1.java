import java.util.StringTokenizer;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan String: ");
        String str = input.nextLine();
        StringTokenizer token = new StringTokenizer(str,"[\\@&.?$+-]+'_;:{}^!@#$%^&*() ");
        System.out.println(token.countTokens());
        while (token.hasMoreElements()) {
            System.out.println(token.nextToken());
        }
        input.close();

        
    }
    
}
