package Constructor_inheritance;

public class Vehical {
	
	public String camp;

	public Vehical(String camp) {
		super();
		this.camp = camp;
	}

	@Override
	public String toString() {
		return camp + "  ";
	}
	

}
