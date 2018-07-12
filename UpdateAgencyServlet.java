import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cb.beans.*;
/**
 * Servlet implementation class UpdateAgencyServlet
 */
@WebServlet("/UpdateAgencyServlet")
public class UpdateAgencyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateAgencyServlet() {
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

			String AgencyName = request.getParameter("AgencyName");
			String Address = request.getParameter("Address");
			String ContactNo = request.getParameter("ContactNo");
			String No_Of_Agents = request.getParameter("No_Of_Agents");
			String Ratings =request.getParameter("Ratings");
			System.out.println(AgencyName + " " + Address + " " + ContactNo + " "+ No_Of_Agents + " "+ Ratings);

			Class.forName(Driver).newInstance();
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");

			PreparedStatement ps =con.prepareStatement("Update Agency set Address=?,ContactNo =?,No_Of_Agents= ?,Ratings =? where AgencyName =?");

			AddAgencyBean ab  = new AddAgencyBean(Address,ContactNo,No_Of_Agents,Ratings);
			ab.setAgencyName(AgencyName);
			AddAgencyDAO adp = new AddAgencyDAO();
			System.out.println(ab);
			ps.setString(1, ab.getAddress());
			ps.setString(2, ab.getContactNo());
			ps.setString(3,ab.getNo_Of_Agents());
			ps.setString(4, ab.getRatings());
			ps.setString(5, ab.getAgencyName());

			int n =   ps.executeUpdate();
			System.out.println(n);
			if(n > 0) {
				response.getWriter().println("Updated the Record");
			}

			else {

				response.getWriter().println("Failed to update the record");
			}
			ps.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}