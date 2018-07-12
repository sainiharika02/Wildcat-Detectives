import java.sql.*;

import com.cb.beans.RegistrationBean;
import com.mysql.jdbc.Statement;


public class LoginDAO
{
	public RegistrationBean login(RegistrationBean r) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			Statement st = (Statement) con.createStatement();

			String Username = r.getEmail();
			String Password = r.getPassword();


			String Search = "select * from users where Email='"
					+ Username + 
					"' AND Password='" + Password + "'";


			ResultSet rs = st.executeQuery(Search);
			if(rs.next()){
				r.setRole(rs.getString(8));
				r.setEmail(rs.getString(3));
				return r;
			}
			return null;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;


	}
}        



