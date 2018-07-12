import java.sql.*;
import java.util.ArrayList;

import com.cb.beans.AddNewCaseBean;





public class AddNewCaseDAO{

	public AddNewCaseDAO() {

	}

	public boolean insert(AddNewCaseBean nb) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
			PreparedStatement p =con.prepareStatement("insert into caseinfo(Email,CaseType,CaseRegDate,Evidences) values(?,?,?,?)");

			p.setString(1,nb.getEmail());
			p.setString(2, nb.getCaseType());
			p.setString(3,nb.getCaseRegDate());
			p.setString(4,nb.getEvidences());

			if(p.executeUpdate()==1)
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




	public ArrayList<AddNewCaseBean> getOpenCases(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
			PreparedStatement p = con.prepareStatement("select * from caseinfo where CaseStatus = 'open' ");
			ResultSet rs =p.executeQuery();
			ArrayList<AddNewCaseBean> CaseIDList= new ArrayList<AddNewCaseBean>();
			while (rs.next()){
				System.out.println(rs.getInt(1));
				AddNewCaseBean tb = new AddNewCaseBean(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7));
				CaseIDList.add(tb);
				System.out.println(tb);
			}
			return CaseIDList;
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}

		catch (SQLException se) {
			se.printStackTrace();
		}
		return null;
	}


	public ArrayList<AddNewCaseBean> getCloseCases(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
			PreparedStatement p = con.prepareStatement("select * from caseinfo where CaseStatus = 'close' ");
			ResultSet rs =p.executeQuery();
			ArrayList<AddNewCaseBean> CaseIDList= new ArrayList<AddNewCaseBean>();
			//while (rs.next()){
			//  AddNewCaseBean tb = new AddNewCaseBean(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7));
			//CaseIDList.add(tb);
			//System.out.println(tb);
			//}
			return CaseIDList;
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}

		catch (SQLException se) {
			se.printStackTrace();
		}
		return null;
	}


	public ArrayList<AddNewCaseBean> getUnassignedCases() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
			PreparedStatement p = con.prepareStatement("select * from caseinfo where Agent_Email is null");
			ResultSet rs = p.executeQuery();
			ArrayList<AddNewCaseBean> CaseIDList = new ArrayList<AddNewCaseBean>();
			while (rs.next()){
				System.out.println(rs.getInt(1));
				AddNewCaseBean tb = new AddNewCaseBean(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7));
				CaseIDList.add(tb);
				//System.out.println(tb);
			}
			return CaseIDList;
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}

		catch (SQLException se) {
			se.printStackTrace();
		}
		return null;
	}
	public boolean assign(AddNewCaseBean tb){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
			PreparedStatement ps = con.prepareStatement("update caseinfo set Agent_Email = ? where CaseID = ?");
			ps.setString(1, tb.getAgent_Email());
			ps.setInt(2, tb.getCaseID() );
			

			if(ps.executeUpdate() == 1)
				return true;
			else
				return false;

		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}

		catch (SQLException se) {
			se.printStackTrace();
		}
		return false;
	}

}