package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Account;

import java.io.IOException;
import java.util.List;

import context.DBContext;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
			String user = request.getParameter("user");
			String password = request.getParameter("password");
			Account acc = new Account();
			acc.setMail(user); acc.setPassWord(password);
			HttpSession session = request.getSession(true);
			DBContext db = new DBContext();
			List<Account> list = db.getAccount();
			for (Account account : list) {
				if(user != "" && acc.getPassWord().equals(account.getPassWord()) && acc.getMail().equalsIgnoreCase(account.getMail())) {
					//set session
					session.setAttribute("name", account.getName());
					response.sendRedirect("admin.jsp");
					return;
				}
			}
			session.setAttribute("error", "wrong username or password");
			response.sendRedirect("login.jsp");
		} catch (NullPointerException ex) {
			// TODO: handle exception
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			response.getWriter().println(e);
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
