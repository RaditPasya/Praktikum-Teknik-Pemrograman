package Aggregation;

import java.util.*;

public class Block {
    String name;
    private List<House> rumah;


    public Block(String name, List<House> rumah) {
        this.name = name;
        this.rumah = rumah;
    }

    public List<House> getRumah(){
        return rumah;
    }

}
