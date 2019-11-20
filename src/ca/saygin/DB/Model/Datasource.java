package ca.saygin.DB.Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasource {
    private final String DATABASE_BUSINESS = "business.db";
    private final String CONNECTION_STRING = "jdbc:sqlite:/Users/saygin.guven/Documents/Java/Java-Fall-2019/";
    private Connection conn;
    private PreparedStatement queryProductsInfo;
    private PreparedStatement queryCategoryInfo;
    private PreparedStatement queryProductCategoryInfo;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING+DATABASE_BUSINESS);
            return true;
        } catch(SQLException e) {
            System.out.println("Couldn't connect to database: " + e.getMessage());
            return false;
        }
    }


    public void close() {
        try {
            if(conn != null) {
                conn.close();
            }
        } catch(SQLException e) {
            System.out.println("Couldn't close connection: " + e.getMessage());
        }
    }

    public List<Product> queryProducts(){

        List<Product> pl = new ArrayList<>();
        try {
            queryProductsInfo = conn.prepareStatement("SELECT * FROM products");
            ResultSet rs = queryProductsInfo.executeQuery();

            while(rs.next()){
                pl.add(new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getInt("currency_id")
                        )
                );
            }


        } catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }

        return pl;

    }

    public List<Category> queryCategory(){

        List<Category> cl = new ArrayList<>();
        try {
            queryCategoryInfo = conn.prepareStatement("SELECT * FROM categories");
            ResultSet rs = queryCategoryInfo.executeQuery();

            while(rs.next()){
                cl.add(new Category(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getInt("sub_category_id")
                        )
                );
            }


        } catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }

        return cl;

    }

    public void queryProductCategory(){

        try {
            queryCategoryInfo = conn.prepareStatement("SELECT p.name AS Product,  p.price AS Price, c.name AS Category FROM products p JOIN products_categories pc ON p.id = pc.products_id JOIN categories c ON c.id = pc.categories_id ORDER BY p.name");
            ResultSet rs = queryCategoryInfo.executeQuery();
            System.out.println("________________________________________");
            System.out.format("%-15s %-6s %-6s\n", "Product","Price", "Category");
            System.out.println("________________________________________");
            while(rs.next()){
                System.out.format("%-15s %-6s %-6s\n",
                        rs.getString("Product"),
                        rs.getDouble("Price"),
                        rs.getString("Category")
                );
            }
            System.out.println("________________________________________");


        } catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }

}
