package model;

/**
 * Thông tin 1 đơn hàng
 */
import java.sql.Date;
import java.util.List;

public class Orders {
	private int orderID;
	private float price;
	private int status;
	private Date orderDate;
	private String address;
	private String phoneNumber;
	private List<ProductOrders> lp;
	private String userMail;
	private Date receivedDate;
	private String discount;
	
	public Orders(int orderID, float price, int status, Date orderDate, String address, String phoneNumber, List<ProductOrders> lp, String userMail, Date receivedDate, String discount) {
		// TODO Auto-generated constructor stub
		this.orderID = orderID;
		this.price = price;
		this.status = status;
		this.orderDate = orderDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.lp = lp;
		this.userMail = userMail;
		this.receivedDate = receivedDate;
		this.discount = discount;
	}
	
	public Orders(String userMail, int status, String discount, String address, String phoneNumber, Date receivedDate) {
		// TODO Auto-generated constructor stub
		this.status = status;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.userMail = userMail;
		this.receivedDate = receivedDate;
		this.discount = discount;
	}

	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Orders(String userMail, int orderID, int status, Date orderDate, String discount, String address) {
		// TODO Auto-generated constructor stub
		this.userMail = userMail;
		this.orderID = orderID;
		this.status = status;
		this.orderDate = orderDate;
		this.discount = discount;
		this.address = address;
	}

	/**
	 * @return the orderID
	 */
	public int getOrderID() {
		return orderID;
	}

	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the lp
	 */
	public List<ProductOrders> getLp() {
		return lp;
	}

	/**
	 * @param lp the lp to set
	 */
	public void setLp(List<ProductOrders> lp) {
		this.lp = lp;
	}

	/**
	 * @return the userMail
	 */
	public String getUserMail() {
		return userMail;
	}

	/**
	 * @param userMail the userMail to set
	 */
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	/**
	 * @return the receivedDate
	 */
	public Date getReceivedDate() {
		return receivedDate;
	}

	/**
	 * @param receivedDate the receivedDate to set
	 */
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	/**
	 * @return the discount
	 */
	public String getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(String discount) {
		this.discount = discount;
	}

}
