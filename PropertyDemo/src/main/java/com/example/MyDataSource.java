package com.example;

public class MyDataSource {
	private String driverClass;
	private String url;
	private String username;
	private String password;
	
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "MyDataSource [driverClass=" + driverClass + ", url=" + url + ", username=" + username + ", password="
				+ password + "]";
	}
	
}
