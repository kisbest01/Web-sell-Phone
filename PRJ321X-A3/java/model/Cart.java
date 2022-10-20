package model;

import java.util.ArrayList;
import java.util.List;

/**
 * đơn hàng hiện tại
 * @author Administrator
 *
 */
public class Cart {
	private List<Product> items;
	
	public Cart() {
		// TODO Auto-generated constructor stub
		items = new ArrayList<Product>();
	}
	
	public void add(Product ci) {
		for(Product x: items) {
			if (ci.getId() == x.getId()) {
				x.setNumber(x.getNumber() + 1);
				return;
			}
		}
		items.add(ci);
	}
	
	public void remove(int id) {
		for (Product x : items) {
			if (x.getId() == id) {
				items.remove(x);
				return;
			}
		}
	}
	
	public double getAmount() {
		double s = 0;
		for (Product x : items) {
			s += x.getPrice() * x.getNumber();
		}
		return Math.round(s * 100.0) / 100.0;
	}
	
	public List<Product> getItems() {
		return items;
	}
}
