import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cb.beans.AddAgencyBean;


public class AddAgencyDAO{
	public AddAgencyDAO() {
		// TODO Auto-generated constructor stub
	}


	public boolean insert(AddAgencyBean ab) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			 PreparedStatement pst = conn.prepareStatement("insert into agency(AgencyName,Address,ContactNo,No_Of_Agents,Ratings)values(?,?,?,?,?)");
		      pst.setString(1,ab.getAgencyName());          
		      pst.setString(2,ab.getAddress());
		      pst.setString(3,ab.getContactNo());
		      pst.setString(4,ab.getNo_Of_Agents());
		      pst.setString(5,ab.getRatings());
		      
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