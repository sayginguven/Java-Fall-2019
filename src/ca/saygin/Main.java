package ca.saygin;

import ca.saygin.DB.Model.*;

import java.sql.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        databaseTest();

    }

    public static void databaseTest(){
        Scanner sn = new Scanner(System.in);
        int userInput = 0;
        Datasource ds = new Datasource();

        if (ds.open()) {
            System.out.println("connected to db");
        } else {
            System.out.println("not connected to db");
        }

        do{

            System.out.println("\u001B[96m");
            System.out.println("****************");
            System.out.println("PLEASE SELECT ONE OF THE ITEM");
            System.out.println("1 - Insert a customer");
            System.out.println("2 - List all the products");
            System.out.println("3 - List all categories");
            System.out.println("4 - Insert to product and category");
            System.out.println("5 - List all customers");
            System.out.println("\u001B[0m");

            userInput = sn.nextInt();
            sn.nextLine();
            switch (userInput){
                case 1: //insert customer
                    break;
                case 2://list all the products
                    ds.queryProductCategoryCurrencies();
                    break;
                case 3: //list all the categories
                    List<Category> categoryList = new ArrayList<>();
                    categoryList = ds.queryCategory();

                    for(Category category : categoryList){
                        System.out.println(category.toString());
                    }
                    break;
                case 4: //Insert to product category
                    try {
                        System.out.println("what is product name?");
                        String productName = sn.nextLine();
                        System.out.println("what is product description?");
                        String productDescription = sn.nextLine();
                        System.out.println("what is product price?");
                        double productPrice = sn.nextDouble();
                        sn.nextLine();
                        System.out.println("what is the product currency ID  1-CAD 2-USD 3-JPY");
                        int currencyId = sn.nextInt();
                        sn.nextLine();
                        System.out.println("what is category");
                        String categoryName = sn.nextLine();
                        System.out.println("what is sub category");
                        int subCategory = sn.nextInt();
                        sn.nextLine();

                        ds.insertProductCategory(productName,
                                productDescription,
                                productPrice,
                                currencyId,
                                categoryName,
                                subCategory);

                    } catch (SQLException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5: // list all the customers
                    List<Customer> customerList;
                    customerList = ds.queryCustomers();

                    for(Customer i : customerList){
                        System.out.println(i.toString());
                    }

                    break;
                case 0:
                    ds.close();
                    System.out.println("BYE");
                    break;
                default:
                    System.out.println("this option doesn't exist");


            }


        }while(userInput != 0);
    }

}
