class Car {
	public void carModel(int year, String brand ,String type, String model) {
		System.out.println("This JDM " + year + " " + brand + " " + type + " " + model);
	}

	public void specs(double engine, String engineSpecs){
		System.out.println(engine + " liter " + engineSpecs);
	}
}

public class Parameters{
	public static void main(String[] args){
		Car usedCar = new Car();

		usedCar.carModel(1997, "Honda", "Type R", "Civic");
		usedCar.specs(1.6, "DOHC VTEC B16B 4-cylinder engine");
	}
}
