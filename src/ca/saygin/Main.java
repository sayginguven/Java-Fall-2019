package ca.saygin;

import ca.saygin.DB.Model.*;

import java.sql.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

//        Hashtable<String, String> hashtable = new Hashtable<>();
//
//        hashtable.put("Aa","jose");
//        hashtable.put("BB","khashayar");
//        hashtable.put("ab","ardeshir");
//        hashtable.put("aa","sina");
//        hashtable.put("ba","hamed");
//        hashtable.put("bb","satoshi");
//        hashtable.put("bA","daniel");
//
//        Enumeration<String> enumeration = hashtable.keys();
//
//        while(enumeration.hasMoreElements()){
//            String key = enumeration.nextElement();
//            System.out.println(key + " -> " + hashtable.get(key));
//        }
//
//        System.out.println("__ __ __ __");
//
//        Set<String> set = hashtable.keySet();
//
//        for(String i : set){
//            System.out.println(i + " -> " + hashtable.get(i));
//        }







        databaseTest();

    }

    public static void databaseTest(){
        Datasource ds = new Datasource();

        if (ds.open()) {
            System.out.println("connected to db");
        } else {
            System.out.println("not connected to db");
        }

        ds.insertCustomer("saygin guven", "sayginguven@gmail.com", "Vancouver","604 700 43 42");



        List<Product> productList = new ArrayList<>();
        productList = ds.queryProducts();

        for(Product product : productList){
            System.out.println(product.toString());
        }

        List<Category> categoryList = new ArrayList<>();
        categoryList = ds.queryCategory();

        for(Category category : categoryList){
            System.out.println(category.toString());
        }

        ds.queryProductCategoryCurrencies();

        ds.queryProductCategory();

        try {

            ds.insertProductCategory("Cookie",
                    "cooked with chocolate and mapple srup",
                    2.25,
                    1,
                    "Snack",
                    5);

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

        try {

            ds.insertProductCategory("Bread",
                    "fresh baked bread",
                    1.55,
                    1,
                    "Food",
                    5);

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }


        List<Customer> customerList;
        customerList = ds.queryCustomers();

        for(Customer i : customerList){
            System.out.println(i.toString());
        }

        ds.close();
    }

}
