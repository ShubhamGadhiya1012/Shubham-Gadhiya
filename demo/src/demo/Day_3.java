package demo;

class Student{

	private int rollno;
	private String name;
	
	void getdata() {
		
		rollno = 10;
		name = "Shubham";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void display() {
		System.out.println(rollno+"   "+name);	
	}
}

public class Day_3 {
	public static void main(String[] args) {
		Student sc = new Student();
		sc.getdata();
		sc.display();
		sc.setName("Vishal");
		sc.setRollno(9);
		System.out.println("Name : "+sc.getName());
		System.out.println("Roll No  : "+sc.getRollno());
		System.out.println(sc);
	}
}