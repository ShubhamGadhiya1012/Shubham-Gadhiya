package org.employeemanagement;

public class City extends Country{
	
	private String cname;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "City [cname=" + cname + "]";
	}
	

}
