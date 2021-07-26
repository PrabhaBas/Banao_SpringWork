package com.prabha.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="users")
public class RegisterModel {
	
	@Id
	@Column(columnDefinition = "int AUTO_INCREMENT=1")
	private int id;
	private String type;
	private String fname;
	@NotNull
	private String email ;
	private String password;
	private String cpass;
	private boolean loggedIn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	@Override
	public String toString() {
		return "RegisterModel [id=" + id + ", type=" + type + ", fname=" + fname + ", email=" + email + ", password="
				+ password + ", cpass=" + cpass + "]";
	}
	

	public boolean isLoggedIn() {
        return loggedIn;
    }
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
	
	
	

}
