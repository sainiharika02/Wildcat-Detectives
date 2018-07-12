package com.cb.beans;

public class AddAgencyBean {
	int    AgencyID;
	String AgencyName;
	String Address;
	String ContactNo;
	String No_Of_Agents;
	String Ratings;
	
	
	public int getAgencyID() {
		return AgencyID;
	}

	public void setAgencyID(int agencyID) {
		AgencyID = agencyID;
	}

	
	
	public String getAgencyName() {
		return AgencyName;
	}

	public void setAgencyName(String agencyName) {
		AgencyName = agencyName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getContactNo() {
		return ContactNo;
	}

	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}

	public String getNo_Of_Agents() {
		return No_Of_Agents;
	}

	public void setNo_Of_Agents(String no_Of_Agents) {
		No_Of_Agents = no_Of_Agents;
	}

	public String getRatings() {
		return Ratings;
	}

	public void setRatings(String ratings) {
		Ratings = ratings;
	
	}
	
	public AddAgencyBean(int agencyId,String agencyName, String address,
			String contactNo, String noOfAgents, String ratings) {
		super();
		AgencyID = agencyId;
		AgencyName = agencyName;
		Address = address;
		ContactNo = contactNo;
		No_Of_Agents = noOfAgents;
		Ratings = ratings;
	}

	public AddAgencyBean() {
		// TODO Auto-generated constructor stub
	}

	public AddAgencyBean(String address, String contactNo, String no_Of_Agents,
			String ratings) {
		super();
		Address = address;
		ContactNo = contactNo;
		No_Of_Agents = no_Of_Agents;
		Ratings = ratings;
	}

	

	

	
}