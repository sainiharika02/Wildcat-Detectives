import java.sql.*;
import java.util.ArrayList;

import com.cb.beans.RegistrationBean;




public class RegistrationDAOImpl implements RegistrationDAO {

	
	@Override
	public boolean insert(RegistrationBean r) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			  PreparedStatement pst = con.prepareStatement("insert into users(Firstname,Lastname,Email,ContactNo,Address,Gender,Password) values(?,?,?,?,?,?,?)");
		      pst.setString(1,r.getFirstname());          
		      pst.setString(2,r.getLastname());
		      pst.setString(3,r.getEmail());
		      pst.setString(4,r.getContactNo());
		      pst.setString(5,r.getAddress());
		      pst.setString(6,r.getGender());
		      pst.setString(7,r.getPassword());

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

	public ArrayList<RegistrationBean> getAllAgentMails() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			PreparedStatement p =con.prepareStatement("select * from users where Role = 'Agent' ");
			ResultSet rs = p.executeQuery();
			ArrayList<RegistrationBean> AgentList = new ArrayList<RegistrationBean>();
			while(rs.next()){
				RegistrationBean cb =new RegistrationBean(rs.getString(3));
				AgentList.add(cb);
			
			}
			return AgentList;
			
		}  catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
	