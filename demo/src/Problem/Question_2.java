package Problem;




class Planet {
	  String name;
	  double distToSun;
	  double relGravity;
	  
	  Planet (String name, double distToSun, double relGravity) {
	    this.name = name;
	    this.distToSun = distToSun;
	    this.relGravity = relGravity;
	  }  

	  public void  display() {
			System.out.println(name);
			System.out.println(distToSun);
			System.out.println(relGravity);
		}
	    
}


public class Question_2 {
	
	
	public static void main(String[] args) {
	
		Planet sc1 = new Planet("Demo",45,90);
		System.out.println("First Data");
		sc1.display();

		Planet sc2 = new Planet("none",50,123);
		System.out.println("Second Data");
		sc2.display();
		
	}

}
