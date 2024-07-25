package Constructor_inheritance;

public class TwoWheeler extends Vehical {
	
	

	private String fuel_type;

	public TwoWheeler(String camp, String fuel_type) {
		super(camp);
		this.fuel_type = fuel_type;
	}

	@Override
	public String toString() {
		return  "Car Type :  "+super.toString()+"\n" +"Fuel Type :" +fuel_type ;
	}
	
	
	
	

}
