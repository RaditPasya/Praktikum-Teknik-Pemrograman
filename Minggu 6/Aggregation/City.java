package Aggregation;

import java.util.*;

public class City {
    String cityName;
    private List<Block> kelurahan;


    public City(String cityName, List<Block> kelurahan) {
        this.cityName = cityName;
        this.kelurahan = kelurahan;
    }

    public void ShowInfo(){
        List<House> rumah;
        for(Block blok : kelurahan){
            int totalHouse =0;
            rumah = blok.getRumah();
            for(House home : rumah){
                totalHouse++;
            }
            System.out.println("Nama Kelurahan = " + blok.name);
            System.out.println("Jumlah Rumah = "+ totalHouse);
        }
    }


}
