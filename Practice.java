class Person {
	String name;
	String location;
	int num;

	void Speak(){
		System.out.println(name + " de " + location);
	}

	int calculate() {
		int yearsLeft = 70 - num;

		return yearsLeft;
	}
}

public class Practice {
   public static void main(String[] args) {
      Person random = new Person();

      random.name = "Kiko";
      random.location = "Zona oeste";
      random.num = 55;

      random.Speak();
      int years = random.calculate();

      System.out.println("im tired boss. lemme quit in " + years + " years.");
   }
}

