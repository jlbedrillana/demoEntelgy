package com.entelgy.demo.model;

public class Reestructura {
	
	private Integer id;
	private String last_name;
	private String email;
	
	
	public Reestructura() {
	}

	public Reestructura(Integer id, String last_name, String email) {
		this.id = id;
		this.last_name = last_name;
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
