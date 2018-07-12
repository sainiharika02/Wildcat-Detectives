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
 * Servlet implementation class RemoveAgentServlet
 */
@WebServlet("/RemoveAgentServlet")
public class RemoveAgentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveAgentServlet() {
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
		
		String AgencyName = request.getParameter("Email");
        Class.forName(driver).newInstance();  
        conn = DriverManager.getConnection(url+dbName,"root", "root");
        PreparedStatement pst = conn.prepareStatement(("delete from users where Email = ?"));
        pst.setString(1,AgencyName);
        
        
        int i = pst.executeUpdate(); 
        String msg=" ";
        if(i!=0){  
        	response.sendRedirect("RemovedAgent.jsp");
          }  
        else{  
          msg="failed to delete";
          pw.println("<font size='6' color=blue>" + msg + "</font>");
         }  
        pst.close();
      }  
      catch (Exception e){  
        e.printStackTrace(); 
      }  
		
		
		
		
	

	}
}