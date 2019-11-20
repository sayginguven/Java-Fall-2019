package ca.saygin.Classes;

import ca.saygin.RegularExpressions;

import java.util.Scanner;

public class ExceptionHandlingAndValidation {

    public static void main(String[] args) {
        System.out.println("Welcome to Java");

        try{
            System.out.println(5/0);//error
        } catch (ArithmeticException e){
            RegularExpressions.red("error : " + e.getMessage());
        } finally {
            System.out.println("arithmetic exception done");
            System.out.println("________________");
        }


        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e ){
            RegularExpressions.red("error : " + e.getMessage());
        }finally {
            System.out.println("null pointer exception done");
            System.out.println("________________");
        }

        try {
            int[] nums = {1, 2, 3, 4, 5};
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            RegularExpressions.red("error : " + e.getMessage());
        } finally {
            System.out.println("array index out of bounds exception done");
            System.out.println("________________");
        }


        try{
            double result = divide(5,0);
            System.out.println("your first payment is " + result/2);
            System.out.println("your second payment is " + result/2);

        } catch (Exception e){
            RegularExpressions.red("error : " + e.getMessage());
        }
        finally {
            System.out.println("custom divide by zero exception done");
            System.out.println("________________");
        }

        try{

            String num1 = "10a";
            String num2 = "0";

            System.out.println(divide(Double.parseDouble(num1), Double.parseDouble(num2)));

        }catch (ArithmeticException e){

            RegularExpressions.red("ArithmeticException error : " + e.getMessage());

        } catch (NumberFormatException e){

            RegularExpressions.red("NumberFormatException error : " + e.getMessage());

        } finally {

            System.out.println("custom divide by zero exception done");
            System.out.println("________________");

        }

        System.out.println("thank you for using Java");


        String[] array = new String[] {"10", "20", "thirty", "40"};


        for (int i = 0; i < array.length; i++) {

            try{
                System.out.println(Double.parseDouble(array[i]));
                System.out.println(array[i] + " is double");
            } catch (Exception e){
                RegularExpressions.red(array[i] + "is not double");
                System.out.println(e.getMessage());
            }

        }


        Scanner sn = new Scanner(System.in);

        int counter =0;
        while(counter < 5){

            System.out.println("give me a number");

            double userinput;

            if(sn.hasNextDouble()){
                userinput = sn.nextDouble();
                System.out.println("thats a double value : " + userinput);
            } else{
                System.out.println(sn.next() + " is not a double");
            }
            counter+=1;
        }

        sn.close();
    }

    static double divide(double a, double b){

        if(b==0) throw new ArithmeticException("divide by zero exception detected");

        return a/b;
    }

}
