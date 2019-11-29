package ca.saygin;

import ca.saygin.DB.Model.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Datasource ds = new Datasource();

        if (ds.open()) {
            System.out.println("connected to db");
        } else {
            System.out.println("not connected to db");
        }

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
