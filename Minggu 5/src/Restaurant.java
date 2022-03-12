import java.util.Scanner;

public class Restaurant extends Menu implements Order{
    
    
    
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.setNamaMakanan(getId(), nama);
        this.setHargaMakanan(getId(), harga);
        this.setStokMakanan(getId(), stok);
    }
            
    
    public void tampilMenuMakanan(){
        for(int i =0; i<=getId();i++){
            if(!isOutOfStock(i)){
                    System.out.println(getNama_makanan(i) +"["+getStok(i)+"]"+"\tRp. "+getHarga_makanan(i));
            }
        }
    }

    public boolean isOutOfStock(int id){
        if(getStok(id) == 0){
            return true;
        }else{
            return false;
        }
    }

    public void Pesan(){
        Scanner input = new Scanner(System.in);

        int besar,total = 0,invoice = 1,counter = 0;
        System.out.println("Masukan Jumlah pesanan yang akan dibuat : ");
        besar = input.nextInt();
        int id[] = new int[besar];
        int amount[] = new int[besar];

        while (counter < besar) {
            
            do {
            System.out.println("Masukan Id makanan pesanan  "+ (counter + 1) +": ");
            id[counter] = input.nextInt() - 1;
            
            
            System.out.println("Masukan jumlah makanan yang akan di pesan : ");
            amount[counter] = input.nextInt();
                
            } while (isOutOfStock(id[counter]));
            

            if (counter + 1 == besar) {
                System.out.println("Apakah anda ingin mendapatkan struk ? [0/1] : ");
                invoice = input.nextInt();
            }
        
            counter++;
        }
        input.close();

        for (counter = 0; counter < besar; counter++) {
            total += getHarga_makanan(id[counter]) * amount[counter];   
        }
        
        

        if (invoice == 1) {
            Invoice(id, amount, total, besar);
        }

        for (counter = 0; counter < besar; counter++) {
            minStok(id[counter], amount[counter]);   
        }
        
    }

    public void Invoice(int id[], int amount[], int total, int besar){
        System.out.println("============TERIMA KASIH============");
        for (int counter = 0; counter < besar; counter++) {
            System.out.println(getNama_makanan(id[counter]) + " : " + amount[counter] + " = " + getHarga_makanan(id[counter]) * amount[counter] );   
        }
        System.out.println("\nTOTAL = " + total);
        System.out.println("====================================");
    }

}



