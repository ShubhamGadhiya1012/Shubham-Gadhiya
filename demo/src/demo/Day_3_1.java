package demo;


class Carrental{

	private int CarId;
	private float CarRent;
	private String CarType;
	
	public void GetCar(int CarId,String CarType) {
		
		this.CarId = CarId;
		this.CarType = CarType;
	}
		
	public float GetRent(float CarRent) {
		
		this.CarRent = CarRent;
		
		return CarRent;
		
	}
	
	public void ShowCar() {
		
		System.out.println("Car Id :"+CarId);
		System.out.println("Car Type :"+CarType);
		System.out.println("Car Rent :"+CarRent);
	}
	
}

public class Day_3_1 {
	
	public static void main(String[] ars) {
		
			Carrental obj = new Carrental();
			obj.GetCar(1,"SUV");
			obj.GetRent(2500);
			obj.ShowCar();
			
			obj.GetCar(2,"Van");
			obj.GetRent(800);
			obj.ShowCar();
			
			obj.GetCar(3,"Small Car");
			obj.GetRent(1000);
			obj.ShowCar();
				
	}
	

}
