package ca.saygin;

import ca.saygin.Classes.Car;
import ca.saygin.Classes.Circle;
import ca.saygin.Classes.Rectangle;
import ca.saygin.Classes.Shape;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Rectangle rec = new Rectangle();

        rec.setHeight(50d);
        rec.setWidth(100d);
        rec.setName("this is my rectangle"); // this setName method from Shape
        System.out.println(rec.getName());


    }

}
