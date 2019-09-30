package ca.saygin;

public class Main {

    public static void main(String[] args) {

        //different variables
        //byte short int long

        System.out.println("Hello Java!");
        //primitive types
        byte byteNumber = Byte.MAX_VALUE;
        short shortNumber = Short.MIN_VALUE;
        int intNumber = 2_147_483_647 + 1;
        int negativeInt = -2_147_483_648 -1;
        System.out.println(intNumber);// overflow
        System.out.println(negativeInt);// overflow

        System.out.println("byte number value is " + byteNumber);
        System.out.println("short number value is " + shortNumber);

        //casting
        byte aByteValue = 60;
        byte anotherByteValue = (byte)(aByteValue/2);

        System.out.println(anotherByteValue);

        int a = 130;
        //truncated
        byte b = (byte)a;
        System.out.println(b);//?

        byte x = 127;
        //all good
        int y = x;
        System.out.println(y);
    }
}
