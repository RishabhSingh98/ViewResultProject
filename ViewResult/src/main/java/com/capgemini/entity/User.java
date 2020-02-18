package com.capgemini.entity;

/*************************************************************
 * @author Rishabh Singh 
 * @description: Creating a User class
 *************************************************************/
public class User {
	
	/**********************************************************
	 * @description: provide the fields for User class
	 **********************************************************/
	
	private String userId;
	private String name;
	private String password;
	/**********************************************************
	 * @description: provide the constructor using fields
	 **********************************************************/
	public User( String userId , String name, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
	}
	
	/**********************************************************
	 * @description: provide the getters and setters using all
	 * the fields of User class
	 **********************************************************/
	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**********************************************************
	 * @description: Override toString() using fields
	 **********************************************************/
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", password=" + password + "]";
	}


}
