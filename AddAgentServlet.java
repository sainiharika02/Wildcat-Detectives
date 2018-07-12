

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
 * Servlet implementation class AddAgentServlet
 */
@WebServlet("/AddAgentServlet")
public class AddAgentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAgentServlet() {
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
        PrintWriter pw = response.getWriter(); 
        //String connectionURL = "jdbc:mysql://127.0.0.1:3306/newData";// newData is the database  
        //Connection connection;  
        Connection conn;
        String url="jdbc:mysql://localhost:3306/";
        String dbName="project";
        String driver="com.mysql.jdbc.Driver";
    try{  
      String Firstname = request.getParameter("Firstname");   
      String Lastname = request.getParameter("Lastname"); 
      String Email = request.getParameter("Email"); 
      String ContactNo= request.getParameter("ContactNo");
      String Address = request.getParameter("Address");
      String Gender = request.getParameter("Gender");
      String Password = request.getParameter("Password");
      String Role = request.getParameter("Role");
      
      
      Class.forName(driver).newInstance();  
      conn = DriverManager.getConnection(url+dbName,"root", "root");
      PreparedStatement pst = conn.prepareStatement(("insert into Users(Firstname,Lastname,Email,ContactNo,Address,Gender,Password,Role) values(?,?,?,?,?,?,?,?)"));
      
      pst.setString(1,Firstname);          
      pst.setString(2,Lastname);
      pst.setString(3,Email);
      pst.setString(4, ContactNo);
      pst.setString(5, Address);
      pst.setString(6,Gender);
      pst.setString(7, Password);
      pst.setString(8, Role);
      
      


      int i = pst.executeUpdate(); 
      String msg=" ";
      if(i!=0){  
    	  response.sendRedirect("NewAgent.jsp");
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

