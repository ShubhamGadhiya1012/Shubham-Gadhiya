package Problem;

class BankCustomer {
	  String firstName;
	  String lastName;

	  BankCustomer (String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	  }
	  
	  public String fname() {
		return firstName;
		  
	  }
//	  public void display() {
//		  
//		  System.out.println("First Name :" +" "+firstName);
//		  System.out.println("Last Name :" +" "+lastName);
//	  }
	}


class BankAccount {
	  BankCustomer forCust;
	  double balance;
	  
	  BankAccount (BankCustomer forCust, double balance) {
	    this.forCust = forCust;
	    this.balance = balance;
	  }
	  
 public void display() {
		  
		  System.out.println("First Name :" +" "+forCust);
		  System.out.println("Last Name :" +" "+balance);
	  }
	  
	  
	}


public class Question_3 {
	
	public static void main(String[] ars) {
	
		BankCustomer sc = new BankCustomer("Shubham","Gadhiya");
		BankAccount ac = new BankAccount(sc,234000);
		
//		sc.display();
		ac.display();
		
		
		
	}
	
}
