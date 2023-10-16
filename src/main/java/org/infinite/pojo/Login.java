package org.infinite.pojo;

import java.sql.Timestamp;

public class Login {
	private String Name;
	private String Password;
	private Timestamp timestamp;
	public Login() {
	}
	
	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}
