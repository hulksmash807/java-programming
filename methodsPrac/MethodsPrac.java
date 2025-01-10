class thinkpad {
	String laptop;
	String brand;
	int year;

	int calculate(){
		int old = 2025 - year;

		return old;
	}
}

public class MethodsPrac {
   public static void main(String[] args) {
   	thinkpad pc = new thinkpad();

	pc.laptop = "X-series";
	pc.brand = "Lenovo";
	pc.year = 2010;

	int yearsOld = pc.calculate();

	System.out.println("The " + pc.laptop + " was released in " + pc.year + "\n" + "Now is " + yearsOld + " y/o.");
   }
}
