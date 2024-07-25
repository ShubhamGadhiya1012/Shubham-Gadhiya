package Constructor_inheritance;

public class DemoV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoWheeler tw = new TwoWheeler("BMW","Petrol");
		
		System.out.println(tw);
		
		Vehical v = new TwoWheeler("BMW","Petrol");
		
		System.out.println(v instanceof Vehical);
	}

}
