package Aggregation;

import java.util.*;

public class AggregationMain {
    public static void main(String[] args) {
        House h1 = new House(1, 1);
        House h2 = new House(2, 1);
        House h3 = new House(3, 2);
        House h4 = new House(4, 3);
        House h5 = new House(5, 3);
        House h6 = new House(6, 3);
        House h7 = new House(7, 3);

        List<House> rumahrumah1 = new ArrayList<House>();
        rumahrumah1.add(h1);
        rumahrumah1.add(h2);
        rumahrumah1.add(h6);

        List<House> rumahrumah2 = new ArrayList<House>();
        rumahrumah2.add(h3);
        rumahrumah2.add(h4);
        rumahrumah2.add(h5);
        rumahrumah2.add(h7);

        Block TarKid = new Block("Tarogong Kidul", rumahrumah1);
        Block TarWet = new Block("Tarogong Wetan", rumahrumah2);

        List <Block> kelurahan = new ArrayList<Block>();
        kelurahan.add(TarKid);
        kelurahan.add(TarWet);    
    
        City Garut = new City("Garut", kelurahan);
        Garut.ShowInfo();
    }
}
