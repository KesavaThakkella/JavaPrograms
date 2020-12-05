package InterfaceConcept;

public class BMW implements Car {

	@Override
	public void start() {

		System.out.println("BMW start method");

	}

	@Override
	public void stop() {

		System.out.println("BMW stop method");
	}

	@Override
	public void refuel() {

		System.out.println("BMW refuel method");

	}

	// We can also have non overridden methods:
	public void threadsafety() {

		System.out.println("BMW having its own threadsafety method");

	}

}
