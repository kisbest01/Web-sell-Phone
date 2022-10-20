package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Cart;
import model.Orders;

import java.io.IOException;

import dao.OrdersDAO;

/**
 * chức năng lưu thông tin chi tiết đơn hàng và khách hàng vào datasource
 */
public class PayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PayController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		try {
			HttpSession session = request.getSession(true);
			if(session.getAttribute("cart") != null) {
			OrdersDAO dao = new OrdersDAO();
			Cart c = (Cart)session.getAttribute("cart");
			String username = request.getParameter("name");
			String discount = request.getParameter("discount");
			String address = request.getParameter("address");
			Orders d = new Orders(username, 2, discount, address, "", null);
			dao.insertOrder(d, c);
			dao.insertOrderDetail(c);
			}
			response.sendRedirect("index.jsp"); 
		} catch (Exception e) {
			// TODO: handle exception
			response.getWriter().print(e);
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
