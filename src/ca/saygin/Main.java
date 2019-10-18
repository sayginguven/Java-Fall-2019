package ca.saygin;

import ca.saygin.Classes.*;
import ca.saygin.Classes.Box;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();// flexible size
        List<Integer> linkedList = new LinkedList<>();// flexible size

        System.out.println("this is array list");
        arrayList.add(101);
        arrayList.add(102);
        arrayList.add(100);
        arrayList.add(104);
        arrayList.add(105);

        arrayList.set(2,103);

        for(Integer i : arrayList) {
            System.out.println(i);
        }

        System.out.println("arrayList.get(0) : " + arrayList.get(0));
        System.out.println(arrayList.contains(5));//false
        System.out.println(arrayList.contains(105));//true

        System.out.println("this is linked list");
        linkedList.add(101);
        linkedList.add(102);
        linkedList.add(100);
        linkedList.add(104);
        linkedList.add(105);

        linkedList.set(2,103);

        for(Integer i : linkedList) {
            System.out.println(i);
        }

        System.out.println("arrayList.get(0) : " + linkedList.get(0));
        System.out.println(linkedList.contains(5));//false
        System.out.println(linkedList.contains(105));//true


        LinkedList<Shape> shapesList = new LinkedList<>();
        shapesList.add(new Box());
        shapesList.add(new Square());
        shapesList.add(new Circle());
        shapesList.add(new Rectangle());

        for(Shape s : shapesList){
            System.out.println(s.getName());
        }



    }

}
