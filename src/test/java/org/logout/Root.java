package org.logout;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.Address;

public class Root {
	
	
	private String name;
	
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public org.logout.Address getAddress() {
		return address;
	}

	public void setAddress(org.logout.Address a) {
		this.address = a;
	}

	public ArrayList<String> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}

	private boolean status;
	
	private org.logout.Address address;
	
	private ArrayList<String> courses;

	
}
