package dev.galasa.simframe.saf;

public class User {
	private String userName;
	private String password;
	
	public User(String user, String pass) {
		this.userName = user;
		this.password = pass;
	}

	public String getUserName() {
		return this.userName;
	}
	
	public boolean authenticate(String password) {
		return this.password.equals(password);
	}
}
