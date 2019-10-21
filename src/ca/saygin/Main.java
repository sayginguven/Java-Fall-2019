package ca.saygin;

import ca.saygin.Classes.Cat;
import ca.saygin.Classes.Dog;
import ca.saygin.Classes.Pet;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Pet[] pets = new Pet[2];

        pets[0] = new Cat();
        pets[1] = new Dog();


        for(Object i : pets){

            if (i instanceof Cat) {
                ((Cat)i).move();
            }
            if (i instanceof Dog) {
                ((Dog)i).move();
            }

        }


    }

}
