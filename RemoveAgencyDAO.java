import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cb.beans.AddAgencyBean;


public class RemoveAgencyDAO{
	public RemoveAgencyDAO() {
		// TODO Auto-generated constructor stub
	}


	public boolean delete(AddAgencyBean ab) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			 PreparedStatement pst = conn.prepareStatement("delete from agency where AgencyName = ?");
		      pst.setString(1,ab.getAgencyName());          
		     
		      
			if(pst.executeUpdate()==1)
				return true;
			else
				return false;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}