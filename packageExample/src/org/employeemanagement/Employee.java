package org.employeemanagement;

public class Employee {
	
	private String ename;
	private Designation design;
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Designation getDesign() {
		return design;
	}
	public void setDesign(Designation design) {
		this.design = design;
	}
	
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", design=" + design + "]";
	}
	
}

