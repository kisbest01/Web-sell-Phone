package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Account;
import model.Orders;
import model.Product;

/**
 * Kết nối database dùng jdbc
 * @author Administrator
 *
 */
public class DBContext {
	private final String serverName = "localhost";
	private final String dbName = "ShoppingDB";
	private final String portNumber = "1433";
	private final String instance = "";
	private final String userID = "admin";
	private final String passWord = "1234";

	public Connection getConnection() throws Exception {
		String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "\\" + instance + ";databaseName=" + dbName + ";encrypt=true;trustServerCertificate=true;";
		if (instance == "" || instance.trim().isEmpty())
			url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName + ";encrypt=true;trustServerCertificate=true;";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url, userID, passWord);
	}
	
	public List<Product> getProducts(int start, int total) {
		List<Product> list = new ArrayList<Product>();
		try {
            // connect to database 
            Connection conn = getConnection();
            // crate statement
            Statement stmt = conn.createStatement();
            // get data from table 
            ResultSet rs = stmt.executeQuery(
            		"SELECT * FROM PRODUCTS "
            		+ "ORDER BY PRODUCT_ID "
            		+ "OFFSET " + start + "ROWS "
    				+ "FETCH NEXT " + total + " ROWS ONLY;");
            // show data
            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getString(6), rs.getString(7));
                list.add(p);
            }
            // close connection
            conn.close();
		} catch (Exception ex) {
            ex.printStackTrace();
		}
		return list;
	}
	
	public List<Product> getProducts() {
		List<Product> list = new ArrayList<Product>();
		try {
            // connect to database 
            Connection conn = getConnection();
            // crate statement
            Statement stmt = conn.createStatement();
            // get data from table 
            String sql = "SELECT * FROM PRODUCTS;";
            ResultSet rs = stmt.executeQuery(sql);
            // show data
            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getString(6), rs.getString(7));
                list.add(p);
            }
            // close connection
            rs.close();
            stmt.close();
            conn.close();
		} catch (Exception ex) {
            ex.printStackTrace();
		}
		return list;
	}
	public List<Orders> getOrders() {
		List<Orders> list = new ArrayList<Orders>();
		try {
            // connect to database 
            Connection conn = getConnection();
            // crate statement
            Statement stmt = conn.createStatement();
            // get data from table 
            String sql = "SELECT * FROM ORDERS ORDER BY order_id DESC;";
            ResultSet rs = stmt.executeQuery(sql);
            // show data
            while (rs.next()) {
                Orders o = new Orders(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getDate(4), rs.getString(5), rs.getString(6));
                list.add(o);
            }
            // close connection
            rs.close();
            stmt.close();
            conn.close();
		} catch (Exception ex) {
            ex.printStackTrace();
		}
		return list;
	}
	
	public List<Account> getAccount() {
		List<Account> list = new ArrayList<Account>();
		try {
            // connect to database 
            Connection conn = getConnection();
            // crate statement
            Statement stmt = conn.createStatement();
            // get data from table 
            String sql = "SELECT * FROM ACCOUNT;";
            ResultSet rs = stmt.executeQuery(sql);
            // show data
            while (rs.next()) {
                Account o = new Account(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6));
                list.add(o);
            }
            // close connection
            rs.close();
            stmt.close();
            conn.close();
		} catch (Exception ex) {
            ex.printStackTrace();
		}
		return list;
	}
}
