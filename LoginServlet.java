

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cb.beans.RegistrationBean;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
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



	}





	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		try { 
			RegistrationBean user = new RegistrationBean(); 
			user.setEmail(request.getParameter("uname")); 
			user.setPassword(request.getParameter("pwd")); 




			if ((user = new LoginDAO().login(user)) != null) 
			{ 

				HttpSession session = request.getSession(); 
				session.setAttribute("user",user);
				if (user.getRole().equals("Customer")) {
					response.sendRedirect("AddNewCase.jsp");
				}
				else if(user.getRole().equals("Agent")) {
					response.sendRedirect("Agent.jsp");
				}
				else if(user.getRole().equals("Admin")){
					response.sendRedirect("Admin.jsp");
				} else 
					response.sendRedirect("Login.jsp"); 
			} 
		}

		catch (Throwable theException) {
			theException.printStackTrace();
		} 
	} 



}

