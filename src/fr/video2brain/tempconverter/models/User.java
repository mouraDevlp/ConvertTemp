package fr.video2brain.tempconverter.models;

public class User {

	private String email;
	private String password;
	
	
	public User(String email, String password) {
		this.email=email;
		this.password=password;
	}
	
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	//urjrjfr
	public void setEmail(String email) {
		this.email= email;
	}
	public String setPassword(String password) {
		return password;
	}
}
