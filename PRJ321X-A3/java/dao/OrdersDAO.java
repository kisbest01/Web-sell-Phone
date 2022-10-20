package dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import context.DBContext;
import model.Cart;
import model.Orders;
import model.Product;

public class OrdersDAO {

	public void insertOrder(Orders o, Cart c) {
		
		try {
			DBContext db = new DBContext();
			// connect to database 
            Connection conn = db.getConnection();
            // crate statement
            Statement stmt = conn.createStatement();
            // get data from table 
            String sql = "INSERT INTO ORDERS(user_mail, order_status, order_discount_code, order_address) VALUES('" + o.getUserMail() + "'" + ","
            	 + o.getStatus() + "," + "'" + o.getDiscount() + "'" + "," + "'" + o.getAddress() + "'" + ")";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
public void insertOrderDetail(Cart c) {
		
		try {
			DBContext db = new DBContext();
			// connect to database 
            Connection conn = db.getConnection();
            // crate statement
            Statement stmt = conn.createStatement();
            List<Product> list = c.getItems();
            List<Orders> order = db.getOrders();
            String sql = null;
            for (Product product : list) {
            	sql = "INSERT INTO ORDERS_DETAIL(order_id, product_id, amount_product, price_product) VALUES(" + order.get(0).getOrderID() + "," + product.getId() + ","
                     	 + product.getNumber() + "," + (product.getPrice() * 1000000) + ")";
            stmt.executeUpdate(sql);
			}
            stmt.close();
            conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
