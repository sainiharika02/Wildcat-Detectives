
public class LoginBean {
 String Username;
 String Password;
String Role;
 public LoginBean(String username, String password, String role) {
	super();
	Username = username;
	Password = password;
	Role = role;
 }
public String getRole() {
	return Role;
}
public void setRole(String role) {
	Role = role;
}
public boolean valid;
 
 
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}


public boolean isValid()
{
			return valid; 
}

public void setValid(boolean newValid) 
{ 
	valid = newValid;
	}
public LoginBean() {
	super();
}
}
