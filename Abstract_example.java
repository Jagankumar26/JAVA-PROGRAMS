package anudip;

abstract class Bike {
	Bike() {
		System.out.println("bike is a two wheeler bike");
	}

	abstract void run();
}

class petrolBike extends Bike {
	public void run() {
		System.out.println("bike has Started");
	}
}

public class Abstract_example {

	public static void main(String[] args) {
		petrolBike pulser = new petrolBike();
		pulser.run();

	}

}
