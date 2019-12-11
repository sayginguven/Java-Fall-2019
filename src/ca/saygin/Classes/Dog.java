package ca.saygin.Classes;

import java.util.ArrayList;
import java.util.List;

public class Dog implements Animal, Pet{


    private List<Toy> toys;

    public Dog(){
        toys = new ArrayList<>();
        toys.add(new Toy("ball", "black"));
    }

    public Dog(List<Toy> toys) {
        this.toys = toys;
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void setToys(List<Toy> toys) {
        this.toys = toys;
    }


    public void makeSound(){
        System.out.println("woof woof");
    }

    public void eat() {
        System.out.println("I am eating some bones");
    }

    public void move() {
        System.out.println("I move like a dog, I usually run");
    }


    public void wash() {
        System.out.println("wash the dog every week");
    }

    public void feed() {
        System.out.println("put some food to dogs cup");
    }

    public void cuddle() {
        System.out.println("I am a cuddling a dog");
    }
}
