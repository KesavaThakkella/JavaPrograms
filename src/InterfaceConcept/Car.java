package InterfaceConcept;

public interface Car {

	// In Interface all the methods are abstract in nature it means only method
	// name is defined no method body
	// to achieve 100 % abstraction we need to use interface concept.
	// to hide the complete implementation logic we should use interface
	// We cannot create the object of interfaces.
	// in interface we can define only final and static variables ie., int
	// final int wheels=4;

	static int wheel = 4;

	public void start();

	public void stop();

	public void refuel();

}
