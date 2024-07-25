package com.yourname.assignment.employees;

public class Developer extends Employee{
	
	private String language;

	public Developer(String ename, int empid, double salary, String language) {
		super(ename, empid, salary);
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Developer [language=" + language + "]";
	}
	
	
	
	

}
