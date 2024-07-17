package Problem;

class Student {
	

	  String firstName;
	  String lastName;
	  int classYear;
	  String major;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getClassYear() {
		return classYear;
	}
	public void setClassYear(int classYear) {
		this.classYear = classYear;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	  
	 
}  
	  

public class Question_1 {
	
	public static void main(String[] ars) {
		
		Student sc= new Student();
		
		sc.setClassYear(2025);
		sc.setFirstName("Shubham");
		sc.setLastName("Patel");
		sc.setMajor("Nothing");
		
		
		System.out.println(sc.getFirstName());
		System.out.println(sc.getLastName());
		System.out.println(sc.getClassYear());
		System.out.println(sc.getMajor());
		
		
	}

}
