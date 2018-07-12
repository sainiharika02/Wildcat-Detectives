

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cb.beans.*;




/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
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
	 * @return
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
			System.out.println(AgencyName);
			Class.forName(Driver).newInstance();
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			PreparedStatement p =con.prepareStatement("SELECT * FROM Agency where AgencyName= ?");
			p.setString(1, AgencyName);
			ResultSet rs = p.executeQuery();
			AddAgencyBean ab = null ;
			if(rs.next()) {
				ab = new AddAgencyBean();
				ab.setAgencyID(rs.getInt(1));
				ab.setAgencyName(rs.getString(2));
				ab.setAddress(rs.getString(3));
				ab.setContactNo(rs.getString(4));
				ab.setNo_Of_Agents(rs.getString(5));
				ab.setRatings(rs.getString(6));


			}
			System.out.println(ab);
			request.setAttribute("agency", ab);
			request.getRequestDispatcher("UpdateAgency.jsp").forward(request, response);

		}


		catch(Exception e) {
			e.printStackTrace();
		}
	}
}