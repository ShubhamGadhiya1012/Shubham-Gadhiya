package arrayofobject;
import java.util.*;
import demo.Employee;

public class Arrayofemployee {

	public void CreateArrayofemployee() {
		
		
		Scanner sc = new Scanner(System.in);
		int[] no = new int[12];
		Employee[] emp = new Employee[10];
		
		for(int i=0; i<3; i++) {
		    emp[i] = new Employee();
		}

		for(int k=0; k<3; k++) {
		    System.out.println("enter name");
		    emp[k].setName(sc.next());
		    System.out.println("enter designation");
		    emp[k].setDesignation(sc.next());
		   
		    
		}
		
		for (int j=0;j<3;j++) {
			
			System.out.println(emp[j]);
		}
		
	}
	
	
	
	
	
	
	

}
