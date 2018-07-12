import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cb.beans.RegistrationBean;
public class AddAgentDAO {
	public AddAgentDAO() {
		// TODO Auto-generated constructor stub
	}


	public boolean insert(RegistrationBean r) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			 PreparedStatement pst = conn.prepareStatement("insert into Users(Firstname,Lastname,Email,ContactNo,Address,Gender,Password,Role)values(?,?,?,?,?,?,?,?)");
		      pst.setString(1,r.getFirstname());          
		      pst.setString(2,r.getLastname());
		      pst.setString(3,r.getEmail());
		      pst.setString(4,r.getContactNo());
		      pst.setString(5,r.getAddress());
		      pst.setString(6, r.getGender());
		      pst.setString(7,r.getPassword());
		      pst.setString(8,r.getRole());
		      
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


	public boolean remove(RegistrationBean r){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		 PreparedStatement pst = conn.prepareStatement("delete from Users where Email= ?");
	      pst.setString(1,r.getEmail());    
	      
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

