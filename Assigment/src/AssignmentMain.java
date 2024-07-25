import com.yourname.assignment.employees.Developer;
import com.yourname.assignment.employees.Manager;
import com.yourname.assignment.utilities.EmployeeUtilities;



public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 	Manager ma = new Manager("Shubham",12,23000,"Coder");
	        Developer de = new Developer("krishna", 34, 3400000,"Python");
	        EmployeeUtilities employeeUtilities = new EmployeeUtilities();
	        
	        
	       
	        
			employeeUtilities.display(ma);
			 System.out.println("Department : "+ma.getDept());
			
	        System.out.println("\n");
	        employeeUtilities.display(de);
	        System.out.println("Language : "+de.getLanguage());
			
	}

}
