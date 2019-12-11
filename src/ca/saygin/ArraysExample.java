package ca.saygin;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23};
        int[] reference = primeNumbers;

        System.out.println("reference[2] : " + reference[2]);//5
        reference[2] = 0;
        System.out.println("primeNumbers[2] : " +primeNumbers[2]);//0

        //int[] copy = primeNumbers.clone();
        int[] copy = Arrays.copyOf(primeNumbers, 9);//similar to clone

        System.out.println("copy[2] : " + copy[2]);
        copy[2] = 50;
        System.out.println("primeNumbers[2] : " + primeNumbers[2]);//0
        System.out.println("prime numbers array");
        printArr(primeNumbers);
        System.out.println("reference array");
        printArr(reference);
        System.out.println("copy array");
        printArr(copy);

        int[] rev = reverseArr(primeNumbers);

        System.out.println("reverse array array");
        printArr(rev);
    }

    public static void array () {
        //string students array
        String[] students = new String[6];

        students[0] = "daniel";
        students[1] = "sina";
        students[2] = "hamed";
        students[3] = "satoshi";
        students[4] = "jose";
        students[5] = "mariana";

        System.out.println("students[2] : " + students[2]);

        //integer numbers array
        int[] numbers = { 5,17,35,4,2,7,4,2,6,8 };

        System.out.println("numbers[5] : " + numbers[5]);

        //System.out.println(numbers[20]);
        //System.out.println("this will not execute!");

        double[] marks = new double[] { 95.0, 94.2, 99.6, 100, 94.5, 75.3};

        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" +i+ "] = " + marks[i] );
        }

        //uninitialized arrays are automagically initialized with
        // if type is int or double 0
        // if type is String null
        String[] emptyArray = new String[10];
        for (int i = 0; i < emptyArray.length; i++) {
            System.out.println("emptyArray[" +i+ "] = " + emptyArray[i] );
        }

        //sort the marks array
        System.out.println("sorted marks array");
        Arrays.sort(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" +i+ "] = " + marks[i] );
        }


        //binary search will work with sorted array
        int number = 100;
        int indexForMarks = Arrays.binarySearch(marks,number);

        if(indexForMarks < 0){
            System.out.println(number + " is not found");
        } else {
            System.out.println("the index of "+number+" is " + indexForMarks);
        }


        //for each loop
        for (Object student : students){
            student = "this info is copy";
            System.out.println(student);
        }

        //for each loop
        System.out.println("print after copy values will not change");
        for (Object student : students){
            System.out.println(student);
        }

        for (int num : numbers ){
            System.out.println(num);
        }

    }

    public static void twoDArray () {

        //create 2 dimensional array
        int[][] num = new int[10][10];

        int row = num.length;
        int col = num[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num[i][j] = (j+1) + i*row ;
            }
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(num[i][j] < 10){
                    System.out.print(" " + num[i][j] + " ");
                }else {
                    System.out.print(num[i][j] + " ");
                }
            }
            System.out.println(" ");
        }



        //initialize with {}
        double[][] twoDarray = new double[][]{

                { 1.0, 2.0, 3.0, 4.0 },

                { 1.1, 1.2, 1.3, 1.4 },

                { 2.1, 2.2, 2.3, 2.4}

        };

        System.out.println(twoDarray[2][2]);//2.3


    }

    public static void threearray () {
        //4,2,3
        int[][][] threeDarray = new int[][][] {

                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                },
                {
                        {13, 14, 15},
                        {16, 17, 18}
                },
                {
                        {19, 20, 21},
                        {22, 23, 24}
                }

        };

        for (int i = 0; i < threeDarray.length; i++) {
            for (int j = 0; j < threeDarray[0].length; j++) {
                for (int k = 0; k < threeDarray[0][0].length; k++) {
                    System.out.print(threeDarray[i][j][k] + " " );
                }
            }
        }
    }

    static void printArr(int[] arr) {

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");

    }

    static int[] reverseArr(int[] arr){
        int[] newArr = arr.clone();
        int middle = newArr.length/2;
        int lastIndex = newArr.length-1;
        int temp;

        for (int i = 0; i < middle ; i++) {

            temp = newArr[i];
            newArr[i] = newArr[lastIndex];
            newArr[lastIndex] = temp;
            lastIndex -=1;

        }

        return newArr;
    }

}
