package Association;

import java.util.*;

public class AssociationMain {
    public static void main(String[] args) {
        Dealership toyota = new Dealership();
        toyota.setLocation("Bandung");

        Car one = new Car("Satu");
        Car two = new Car("Dua");

        List<Car> mobil = new ArrayList<Car>();
        mobil.add(one);
        mobil.add(two);

        toyota.setCars(mobil);
        System.out.println(toyota.getCars()+"Are the cars on sale in the "+toyota.getLocation()+" Dealership");
    }
}
