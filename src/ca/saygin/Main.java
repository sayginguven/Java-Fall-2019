package ca.saygin;

import ca.saygin.Classes.Car;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        Car car1 = new Car("toyota", "corolla", "black", true, 50.0d, 2500);
        System.out.println(car1.toString());

        for (int i = 0; i < 10; i++) {
            car1.accelerate();
        }

        System.out.println("________________________");

        Car car2 = new Car("honda", "civic", "red", false, 40.0d,50);
        System.out.println(car2.toString());

        System.out.println("_______");

        Car car3 = new Car("pontiac", "vibe", "blue", true, 55.0d,0);
        System.out.println(car3.toString());

        System.out.println("_______");

        Car car4 = new Car();
        car4.setMake("HYUNDAI");
        car4.setModel("sAnTaFE");
        System.out.println(car4.toString());

        System.out.println("_______");


        Car car5 = new Car("lamborghini", "gallardo");
        System.out.println(car5.toString());

    }

}
