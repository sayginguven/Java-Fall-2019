package ca.saygin;

public class Loop {

    static void loop(){
        System.out.println("test from loop method");

        //first one is counter loop - for
        //second one is conditional loop - while

        System.out.println("_____");
        System.out.println("printing from 1 - 10 number");
        for(int i = 0; i < 10; i += 1){
            int printThis = i+1;
            System.out.println(printThis);
        }

        System.out.println("_____");
        System.out.println("printing the power of 2 starting from 10 to 0");
        for (int i = 10; i > 0; i -= 1) {
            System.out.println("2 ^ " + i + " = " + (int)Math.pow(2,i));
        }

        for (char i = 'A'; i <= 'Z'; i+=1) {
            System.out.print(i + " ");
        }

        for (char i = 65; i < 91; i+=1) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

    }
}
