

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
 * Servlet implementation class RemoveAgencyServlet
 */
@WebServlet("/RemoveAgencyServlet")
public class RemoveAgencyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveAgencyServlet() {
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
        Connection conn;
        String url="jdbc:mysql://localhost:3306/";
        String dbName="project";
        String driver="com.mysql.jdbc.Driver";
        
		
		
		try{
		
		String AgencyName = request.getParameter("AgencyName");
        Class.forName(driver).newInstance();  
        conn = DriverManager.getConnection(url+dbName,"root", "root");
        PreparedStatement pst = conn.prepareStatement("delete from agency where AgencyName = ?");
        pst.setString(1,AgencyName);
        
        
        int i = pst.executeUpdate(); 
        String msg=" ";
        if(i!=0){  
        	response.sendRedirect("RemovedAgency.jsp");  
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
