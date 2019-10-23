package ca.saygin;

import ca.saygin.Classes.Cat;
import ca.saygin.Classes.Classroom.ClassRoom;
import ca.saygin.Classes.Classroom.Computer;
import ca.saygin.Classes.Classroom.Monitor;
import ca.saygin.Classes.Dog;
import ca.saygin.Classes.Pet;
import ca.saygin.Classes.Toy;

import java.util.*;

public class Main {

    public static void main(String[] args) {



        ClassRoom class3 = new ClassRoom();
        class3.getProjector().powerOn();
        class3.getProjector().powerOff();
        class3.setTemprature(35.0d);

        System.out.println("temperature of classroom3 : " + class3.getTemprature());

        class3.getWindows().get(0).clean();

        List<Computer> compList = new ArrayList<>();
        compList.add(new Computer(new Monitor(),"i7", "16gb",true,true,false));
        compList.add(new Computer(new Monitor(),"i3", "8gb",true,true,false));
        compList.add(new Computer(new Monitor(),"i5", "24gb",true,true,true));
        class3.setComputers(compList);

        class3.getComputers().get(2).powerOff();


    }

}
