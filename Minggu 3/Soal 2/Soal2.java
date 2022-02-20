import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak Data yang akan diinput :");
        int g = input.nextInt();
        input.nextLine();
        String nama[] = new String[g];
        int angka[] = new int[g];

        for (int i = 0; i < g; i++) {
            do{
                System.out.print("String dibawah 10 karakter :");
                nama[i] = input.nextLine();
                System.out.print("Integer dibawah 999 :");
                angka[i] = input.nextInt();
                input.nextLine();
            }while(nama[i].length()>10||angka[i]>999);
            
        }
        input.close();
        System.out.println("============================");
        for (int i = 0; i < g; i++) {
            System.out.print(nama[i]);
            for (int j = 1; j < (15-nama[i].length()); j++) {
                    System.out.print(" ");
                }
        if (angka[i]<10) {
            System.out.println("00"+angka[i]);
        }
        else if (angka[i]<100) {
            System.out.println("0"+angka[i]);       
        }   
        else {
            System.out.println(angka[i]);
        }   
        }
        System.out.println("============================");

    }
}
