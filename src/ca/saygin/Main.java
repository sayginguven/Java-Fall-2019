package ca.saygin;

import ca.saygin.Classes.Cat;
import ca.saygin.Classes.Dog;
import ca.saygin.Classes.Pet;
import ca.saygin.Classes.Toy;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Toy aToy = new Toy("ball", "purple and white");

        Cat tweety = new Cat(aToy);
        System.out.println(tweety.getToy().getColor());

        List<Toy> toyList = new ArrayList<>();
        toyList.add(new Toy("ball", "black and white"));
        toyList.add(new Toy("chewing bone", "brown"));
        toyList.add(new Toy("GIJO", "green"));
        toyList.add(new Toy("stick", "blue"));

        Dog fluffy = new Dog(toyList);


        for ( Toy i : fluffy.getToys() ) {
                System.out.println(i.getName() + " - " + i.getColor());
        }

    }

}
