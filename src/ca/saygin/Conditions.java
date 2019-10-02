package ca.saygin;

public class Conditions {

    static void conditions(){
        
        int year = 2019;
        //year = year + 1;
        //pre increment
        System.out.println("++year = " + ++year);// ? 2020
        //post increment
        System.out.println("year++ = " + year++);// ? 2020
        //here the year value is 2021
        System.out.println("year = " +year); // ? 2021

        year %= 2;
        System.out.println("year %= 2 = " + year); // ? 1


        //conditions
        //if blocks
        int age = 18;
        System.out.println("age is " + age);
        if (age >= 120) {
            System.out.println("sorry you are dead :(");
        } else if (age >= 18) {
            System.out.println("you are adult");
        } else {
            System.out.println("you are NOT adult");
        }

        boolean islightson = true;
        System.out.println("lights are on ? " + islightson);
        if (islightson) {
            System.out.println("can you turn off the light?");
        } else {
            System.out.println("can you turn on the light?");
        }

        int studentMark = 70;
        double gpa;
        //ternary operator
        gpa = studentMark >= 80 ? 4.0 : 3.0;
        System.out.println("student gpa is " + gpa);

        // 1 - green 2 - red
        int light = 1;
        boolean go;
        go = light != 2 ? true : false;
        System.out.println("Should I pass if the light is green? : " + go);
        System.out.println("Should I pass if the light is red? : " + !go);

        // && AND
        // || OR

        age = 17;
        boolean parentPermission = false;

        if ( age >= 18 || parentPermission  ){
            System.out.println("you are allowed to do stuff");
        } else {
            System.out.println("you need to grow up or you need permission");
        }

        if (age < 18 && parentPermission){
            System.out.println("you need to grow up or you need permission");
        } else {
            System.out.println("you are allowed to do stuff");
        }

        int dayOfWeek = 3; // 0 .... 6
        // 0 - sunday
        // 1 - monday
        // ... so on
        if(dayOfWeek == 0){
            System.out.println("its sunday");
        } else if (dayOfWeek == 1){
            System.out.println("its monday");
        } else if (dayOfWeek == 2){
            System.out.println("its tuesday");
        } else if (dayOfWeek == 3){
            System.out.println("its wednesday");
        } else if (dayOfWeek == 4){
            System.out.println("its thursday");
        } else if (dayOfWeek == 5){
            System.out.println("its friday");
        } else if (dayOfWeek == 6){
            System.out.println("its saturday");
        } else {
            System.out.println("ops there is no such a day");
        }

        switch (dayOfWeek) {
            case 0:
                System.out.println("its sunday");
                break;
            case 1:
                System.out.println("its monday");
                break;
            case 2:
                System.out.println("its tuesday");
                break;
            case 3:
                System.out.println("its wednesday");
                break;
            case 4:
                System.out.println("its thursday");
                break;
            case 5:
                System.out.println("its friday");
                break;
            case 6:
                System.out.println("its saturday");
                break;
            default:
                System.out.println("ops there is no such a day");
                break;
        }
    }

    public static void main(String[] args) {

    }
}
