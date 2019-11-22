package ca.saygin.DB.Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasource {
    private final String DATABASE_BUSINESS = "business.db";
    private final String CONNECTION_STRING = "jdbc:sqlite:src/";
    private Connection conn;
    private PreparedStatement queryProductsInfo;
    private PreparedStatement queryCategoryInfo;
    private PreparedStatement queryProductCategoryCurrenciesInfo;
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


            if(queryProductsInfo != null){
                queryProductsInfo.close();
            }

            if(queryCategoryInfo != null){
                queryCategoryInfo.close();
            }

            if(queryProductCategoryCurrenciesInfo != null){
                queryProductCategoryCurrenciesInfo.close();
            }


            if(queryProductCategoryInfo != null){
                queryProductCategoryInfo.close();
            }

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
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT p.name AS Product,  p.price AS Price, c.name AS Category ");
            sb.append("FROM products p ");
            sb.append("JOIN products_categories pc ");
            sb.append("ON p.id = pc.products_id ");
            sb.append("JOIN categories c ");
            sb.append("ON c.id = pc.categories_id ");
            sb.append("JOIN currencies cur ");
            sb.append("ON p.currency_id = cur.id ");
            sb.append("where p.active = 1 ");
            sb.append("ORDER BY p.name");
            queryProductCategoryInfo = conn.prepareStatement(sb.toString());

            ResultSet rs = queryProductCategoryInfo.executeQuery();
            System.out.println("________________________________________");
            System.out.format("%-15s %-6s %-10s\n", "Product","Price", "Category");
            System.out.format("%-15s %-6s %-10s\n", "","CAD", "");

            System.out.println("________________________________________");
            while(rs.next()){
                System.out.format("%-15s %-6.2f %-10s\n",
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

    public void queryProductCategoryCurrencies(){

        try {
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT p.name AS Product,  p.price AS Price, c.name AS Category, ");
            sb.append("(SELECT curp.value FROM currencies_price curp WHERE id = 2) * p.price AS PriceUSD, ");
            sb.append("(SELECT curp.value FROM currencies_price curp WHERE id = 4) * p.price AS PriceJPY ");
            sb.append("FROM products p ");
            sb.append("JOIN products_categories pc ");
            sb.append("ON p.id = pc.products_id ");
            sb.append("JOIN categories c ");
            sb.append("ON c.id = pc.categories_id ");
            sb.append("JOIN currencies cur ");
            sb.append("ON p.currency_id = cur.id ");
            sb.append("JOIN currencies_price curp ");
            sb.append("ON curp.currency_id  = cur.id ");
            sb.append("where p.active = 1 ");
            sb.append("ORDER BY p.name");
            queryProductCategoryCurrenciesInfo = conn.prepareStatement(sb.toString());

            ResultSet rs = queryProductCategoryCurrenciesInfo.executeQuery();
            System.out.println("_____________________________________________________");
            System.out.format("%-15s %-8s %-8s %-8s %-10s\n", "Product","Price", "Price","Price","Category");
            System.out.format("%-15s %-8s %-8s %-8s %-10s\n", "","CAD","USD","JPY", "");
            System.out.println("_____________________________________________________");
            while(rs.next()){
                System.out.format("%-15s %-8.2f %-8.2f %-8.2f %-10s\n",
                        rs.getString("Product"),
                        rs.getDouble("Price"),
                        rs.getDouble("PriceUSD"),
                        rs.getDouble("PriceJPY"),
                        rs.getString("Category")
                );
            }
            System.out.println("_____________________________________________________");


        } catch(SQLException e){

            System.out.println(e.getMessage());

        }

    }

}
