package com.cb.beans;

public class AddNewCaseBean {
	int CaseID;
	String Email =" ";
	String CaseType;
	String CaseRegDate;
	String  Evidences;
	String Agent_Email;
	String CaseStatus;

	public AddNewCaseBean(int caseID, String email, String caseType,
			String caseRegDate, String evidences, String agent_Email,
			String caseStatus) {
		super();
		CaseID = caseID;
		Email = email;
		CaseType = caseType;
		CaseRegDate = caseRegDate;
		Evidences = evidences;
		Agent_Email = agent_Email;
		CaseStatus = caseStatus;
	}




	public int getCaseID() {
		return CaseID;
	}




	public void setCaseID(int caseID) {
		CaseID = caseID;
	}




	public String getEmail() {
		return Email;
	}




	public void setEmail(String email) {
		Email = email;
	}




	public String getCaseType() {
		return CaseType;
	}




	public void setCaseType(String caseType) {
		CaseType = caseType;
	}




	public String getCaseRegDate() {
		return CaseRegDate;
	}




	public void setCaseRegDate(String caseRegDate) {
		CaseRegDate = caseRegDate;
	}




	public String getEvidences() {
		return Evidences;
	}




	public void setEvidences(String evidences) {
		Evidences = evidences;
	}




	public String getAgent_Email() {
		return Agent_Email;
	}




	public void setAgent_Email(String agent_Email) {
		Agent_Email = agent_Email;
	}




	public String getCaseStatus() {
		return CaseStatus;
	}




	public void setCaseStatus(String caseStatus) {
		CaseStatus = caseStatus;
	}




	public AddNewCaseBean() {
		super();
	}
}



