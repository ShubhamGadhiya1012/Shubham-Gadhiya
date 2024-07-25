package org.employeechecking;

import org.employeemanagement.*;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Designation ds = new Designation();
		ds.setDesingation("Programmer");
		
		Employee emp = new Employee();
		emp.setEname("Shubham");
		emp.setDesign(ds);
		
		System.out.println(emp);

		
		
		
		
		
	
	}

}
