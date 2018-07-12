

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.ResultSet;

/**
 * Servlet implementation class AddNewCaseServlet
 */
@WebServlet("/AddNewCaseServlet")
public class AddNewCaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddNewCaseServlet() { 
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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbname = "project";
		String Driver = "com.mysql.jdbc.Driver";
		try {
			String Email = request.getParameter("Email");
			String CaseType = request.getParameter("CaseType");
			String CaseRegDate = request.getParameter("CaseRegDate");
			String Evidences = request.getParameter("Evidences");

			//Class.forName(Driver).newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			PreparedStatement p =con.prepareStatement("insert into caseinfo(Email,CaseType,CaseRegDate,Evidences) values(?,?,?,?)");
			p.setString(1,Email);
			p.setString(2, CaseType);
			p.setString(3,CaseRegDate);
			p.setString(4,Evidences );


			int i = p.executeUpdate();
			String msg = " ";
			if(i!= 0) {
				response.sendRedirect("CaseRegistered.jsp");



			}
			else {
				msg = "Failed to insert the record";
				out.println("<font-size ='5' color = blue>" + msg +"</font>");
			}

			p.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}





	}


}
