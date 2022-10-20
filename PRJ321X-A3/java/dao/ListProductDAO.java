package dao;

import java.util.ArrayList;
import java.util.List;

import context.DBContext;
import model.Product;

public class ListProductDAO {
	
	public List<Product> search(String characters) {
		List<Product> list = new ArrayList<Product>();
		DBContext db = new DBContext();
		List<Product> listProduct = db.getProducts();
		for (Product product : listProduct) {
			String name = product.getName().toLowerCase();
			if(name.contains(characters.toLowerCase())) {
				list.add(product);
			}
		}
		return list;
	}
	
	public Product getProduct(String characters) {
		int id = Integer.parseInt(characters);
		DBContext db = new DBContext();
		List<Product> listProduct = db.getProducts();
		for (Product product : listProduct) {
			if(product.getId() == id) {
				return product;
			}
		}
		return null;
	}
}
