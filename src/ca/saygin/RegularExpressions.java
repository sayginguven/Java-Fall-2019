package ca.saygin;

import java.util.Scanner;

public class RegularExpressions {

    public static void main(String[] args) {

        String str = "I love. my love but love doesnt love my as I love my love";
        String betterStr = str.replace("doesnt", "doesn't");
        System.out.println(betterStr);

        //substring is for creating strings from another string
        String love = str.substring(0,7);
        blue(love);


        //dot means any char in the regex
        System.out.println(betterStr.replaceAll(".", "="));

        //replace is checking the target not the regex
        System.out.println(betterStr.replace(".", "!"));

        // for escape the char we use \\ escape sequence
        System.out.println(betterStr.replaceAll("\\.", "!"));

        //for checking the first part of string we are using ^ at the beginning
        System.out.println(betterStr.replaceAll("^I love", "I am in love"));

        //for checking the last part of string we are using $ at the end
        System.out.println(betterStr.replaceAll("love$", "LOVE"));

        //replace each o and e individually with *
        red(betterStr.replaceAll("[oe]", "*"));
        blue(betterStr.toUpperCase());
        blue(betterStr.toLowerCase());

        //all the v and t chars which is after o or u will be replaced
        red(betterStr.replaceAll("[ou][vt]", "x"));

        String password = "your email password is iTd Canada2019!";

        //change all the itdc chars to ITDC , check both the upper and lower case
        System.out.println(password.replaceAll("[i|I][t|T][d|D][c|C]", "ITDC"));
        System.out.println(password.replaceAll("[iI][tT][dD][cC]", "ITDC"));

        //replace every char except i t d c with *
        blue(password.replaceAll("[youremilpswdTCn019!]", "*"));

        //easier way to check
        red(password.replaceAll("[^a2 ]", "*"));

        //you can check with range
        red(password.replaceAll("[b-zA-Z0-13-9!]", "*"));
        //its case sensitive
        blue(password.replaceAll("(?i)[b-z0-13-9!]", "*"));

        //replace the digits only
        System.out.println(password.replaceAll("\\d", "*"));
        //replace not the digits
        System.out.println(password.replaceAll("\\D", "*"));

        //replace if its not a whitespace excluding punc
        red(password.replaceAll("\\w", "*"));

        //replace if its a whitespace or punc
        red(password.replaceAll("\\W", "*"));

        //replace whitespaces including punc
        blue(password.replaceAll("\\s", "*"));

        //replace if its not whitespace or punc
        blue(password.replaceAll("\\S", "*"));




        String secret = "11aaa222bbbbbb333cc44dd";
        // {} will check the char before (in this case a repeated 2 times)
        System.out.println(secret.replaceAll("^11a{2}", "x"));

        //+ will check the char before if repeats any time (in this case all a will be replaced)
        red(secret.replaceAll("^11a+", "x"));

        //* will check if there is 0 or more char after previous
        blue(secret.replaceAll("^11a*", "x"));

        //check if repeated min and max limit
        red(secret.replaceAll("b{2,5}", "-")); // in a sequence


        String tel = "(604) 704-4342";

        System.out.println(tel.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

        //this will check if the word between .* and *. is in the string
        System.out.println(betterStr.matches(".*my love*."));


        String ref1 = new String("peter pan");
        String ref2 = new String("peter pan");


        // == operator will check the references are
        // pointing to the same memory address
        //if(ref1 == ref2) {

        //.equals() checks if the values are same
        if(ref1.equals(ref2)) {
            System.out.println("ref1 and ref2are same");
        } else{
            System.out.println("ref1 is not same with ref2");
        }

        // SELECT * FROM table WHERE id = 10;
        StringBuilder query = new StringBuilder("SELECT * FROM");
        query.append(" table");
        query.append(" WHERE");
        query.append(" id =");
        query.append(" 10");

        red(query.toString());

        //converts to 'h', 'e', 'l', ...
        String name = "helloworld";
        char[] charArr = name.toCharArray();

        //trim the end and the begining of string
        String email = "    saygin.guven@itdcanada.ca   ";
        blue(email.trim());



    }


    private static void red (String msg) {
        System.out.println("\u001B[31m" + msg + "\u001B[0m" );
    }

    private static void blue (String msg) {
        System.out.println("\u001B[96m" + msg + "\u001B[0m" );
    }

}
