package InterfaceConcept;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.threadsafety();

		// Dynamic polymarphism or top casting

		Car c = new BMW(); // Here child class BMW is referred by parent class
		c.start(); // object called car so we can access all the methods
		c.stop();
		c.refuel();
		// this one we cannot access.threadsafety();

	}

}
