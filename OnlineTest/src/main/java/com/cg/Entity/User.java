package com.cg.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="UserTable")
public class User {
	@Id
	private long userId;
	@Column
	private String userName;
	@Column
	private String userPassword;
	@Column
	private boolean isAdmin;
	@OneToOne
	@JoinColumn(name="testId")
	private Test userTest;
	
	
	public User(long userId, String userName, String userPassword, boolean isAdmin, Test userTest) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.isAdmin = isAdmin;
		this.userTest = userTest;
	}
	public User() {
		super();
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public Test getUserTest() {
		return userTest;
	}
	public void setUserTest(Test userTest) {
		this.userTest = userTest;
	}
	
	}
