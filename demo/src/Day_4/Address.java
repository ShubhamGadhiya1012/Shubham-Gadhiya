package Day_4;

public class Address {
	
	String societyName, Area;
	int pincode;
	
	public Address(){
		
		this.societyName="Kalasagar Heights";
		this.Area="New-Ranip";
		this.pincode=382480;
	}

	public Address(String societyName, String area, int pincode) {
		super();
		this.societyName = societyName;
		Area = area;
		this.pincode = pincode;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

	@Override
	public String toString() {
		return "Address [societyName=" + societyName + ", Area=" + Area + ", pincode=" + pincode + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
