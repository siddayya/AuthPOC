/**
 * 
 */
package com.dev.ewt.devops.devops.auth;

/**
 * @author Sid
 *
 */
public class Principle {
    long    userId;
	String  userName;
	String  userSex;
    String  dob;
    boolean isValid;
    
    String token;
    
    //constructor
    Principle(long userId, String  userName, String  userSex, String  dob, boolean isValid){
    	this.userId=userId;
    	this.userName = userName;
    	this.userSex = userSex;
    	this.dob = dob;
    	this.isValid = isValid;
    }
    
	
    /**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}
	
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * @return the userSex
	 */
	public String getUserSex() {
		return userSex;
	}
	
	/**
	 * @param userSex the userSex to set
	 */
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	/**
	 * @return the isValid
	 */
	public boolean isValid() {
		return isValid;
	}
	
	/**
	 * @param isValid the isValid to set
	 */
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}


	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}


	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	} 
    
	
}
