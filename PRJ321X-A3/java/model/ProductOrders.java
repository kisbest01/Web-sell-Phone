package model;
/**
 * Thông tin 1 sản phẩm trong đơn
 * @author Administrator
 *
 */
public class ProductOrders {
	private int orderID;
	private int productID;
	private int amountProduct;
	private String nameProduct;
	
	public ProductOrders(int orderID, int productID, int amountProduct, String nameProduct) {
		// TODO Auto-generated constructor stub
		this.orderID = orderID;
		this.productID = productID;
		this.amountProduct = amountProduct;
		this.nameProduct = nameProduct;
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
	 * @return the productID
	 */
	public int getProductID() {
		return productID;
	}

	/**
	 * @param productID the productID to set
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}

	/**
	 * @return the amountProduct
	 */
	public int getAmountProduct() {
		return amountProduct;
	}

	/**
	 * @param amountProduct the amountProduct to set
	 */
	public void setAmountProduct(int amountProduct) {
		this.amountProduct = amountProduct;
	}

	/**
	 * @return the nameProduct
	 */
	public String getNameProduct() {
		return nameProduct;
	}

	/**
	 * @param nameProduct the nameProduct to set
	 */
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

}
