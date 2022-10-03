package com.beans;

public class registration {
	private String uname;
	private String pass;
	private String cpass;
	private String email;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public registration(String uname, String pass, String cpass, String email) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.cpass = cpass;
		this.email = email;
	}
	public registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "registration [uname=" + uname + ", pass=" + pass + ", cpass=" + cpass + ", email=" + email + "]";
	}
	
	

}
