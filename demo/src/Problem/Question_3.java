package Problem;

class BankCustomer {
	  String firstName;
	  String lastName;

	  BankCustomer (String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	  }
	  
	 


@Override
	public String toString() {
		return "BankCustomer [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}


class BankAccount {
	  BankCustomer forCust;
	  double balance;
	  
	  BankAccount (BankCustomer forCust, double balance) {
	    this.forCust = forCust;
	    this.balance = balance;
	  }

	@Override
	public String toString() {
		return "BankAccount [forCust=" + forCust + ", balance=" + balance + "]";
	}
	  
 
	  
	  
	}


public class Question_3 {
	
	public static void main(String[] ars) {
	
		BankCustomer sc = new BankCustomer("Shubham","Gadhiya");
		BankAccount ac = new BankAccount(sc,234000);
		
		System.out.println(ac);
		
		
	}
	
}
