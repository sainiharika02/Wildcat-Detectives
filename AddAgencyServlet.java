

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

/**
 * Servlet implementation class AddAgencyServlet
 */
@WebServlet("/AddAgencyServlet")
public class AddAgencyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAgencyServlet() {
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
		response.setContentType("text/html");  
        PrintWriter pw = response.getWriter(); 
        //String connectionURL = "jdbc:mysql://127.0.0.1:3306/newData";// newData is the database  
        //Connection connection;  
        Connection conn;
        String url="jdbc:mysql://localhost:3306/";
        String dbName="project";
        String driver="com.mysql.jdbc.Driver";
    try{  
      String AgencyName = request.getParameter("AgencyName");   
      String Address = request.getParameter("Address"); 
      String ContactNo = request.getParameter("ContactNo"); 
      String No_Of_Agents = request.getParameter("No_Of_Agents");
      String Ratings = request.getParameter("Ratings");
      
      Class.forName(driver).newInstance();  
      conn = DriverManager.getConnection(url+dbName,"root", "root");
      PreparedStatement pst = conn.prepareStatement(("insert into agency(AgencyName,Address,ContactNo,No_Of_Agents,Ratings) values(?,?,?,?,?)"));
      
      pst.setString(1,AgencyName);          
      pst.setString(2,Address);
      pst.setString(3,ContactNo);
      pst.setString(4, No_Of_Agents);
      pst.setString(5, Ratings);
      


      int i = pst.executeUpdate(); 
      String msg=" ";
      if(i!=0){  
    	  response.sendRedirect("NewAgency.jsp"); 
        }  
      else{  
        msg="failed to insert the data";
        pw.println("<font size='6' color=blue>" + msg + "</font>");
       }  
      pst.close();
    }  
    catch (Exception e){  
      e.printStackTrace(); 
    }  

	}
	}