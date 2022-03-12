

public class Menu{

    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id=0;

    public Menu() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }
       
    public void setNamaMakanan(int id, String name){
        this.nama_makanan[id] = name;
    }

    public void setHargaMakanan(int id, double price){
        this.harga_makanan[id] = price;
    }

    public void setStokMakanan(int id, int stock){
        this.stok[id] = stock;
    }

    public void minStok(int id, int amount){
        this.stok[id] -= amount;
    }

    public double getHarga_makanan(int id) {
        return harga_makanan[id];
    }

    public String getNama_makanan(int id) {
        return nama_makanan[id];
    }
        
    public int getStok(int id) {
        return stok[id];
    }
        
    public static byte getId() {
        return id;
    }
    
    public static void nextId(){
        id++;
        }

    public static void currentId(){
        System.out.println(getId());
    }

}
