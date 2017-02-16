package com.model;

import javax.persistence.*;

@Entity
@Table(name = "tblUser")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;
	
	@Column(name = "role")
	private String role;
	
	public User() {}
	
	public int getId() {
		return this.id;
	}
	
	public void setId( int id ) {
		this.id = id;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername( String usernameParam ) {
		this.username = usernameParam;
	}

	public String getPassword() {
		return this.password;
	}
	
	public void setPassword( String passwordParam ) {
		this.password = passwordParam;
	}

	public String getRole() {
		return this.role;
	}
	
	public void setRole( String roleParam ) {
		this.role = roleParam;
	}

}