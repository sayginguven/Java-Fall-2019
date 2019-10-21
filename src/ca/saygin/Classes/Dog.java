package ca.saygin.Classes;

public class Dog implements Animal, Pet{


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
