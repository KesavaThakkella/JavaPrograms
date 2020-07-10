
public class StaticAndNonStaticConcept {

	// Global variables: The scope of global variables will be available across
	// all the functions with some conditions.

	String name = "kesava"; // non static global variable
	static int age = 25; // static global variable

	public static void main(String[] args) {

		// how to call static methods:

		// 1. direct calling.
		sum();

		// 2. calling by class name.

		StaticAndNonStaticConcept.sum();

		// How to call static variables:
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);

		// How to call non static methods and variables:
		// ...................................................
		// To call non static methods and variable we need to create object
		// reference to that class name then only we can call the non static
		// methods and variables.

		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendemail();
		System.out.println(obj.name);

		// Can i access static methods by using object reference?
		// ANS: yes we can access the static methods using object reference. but
		// below is not a good practice because static variables are freely
		// stored in a java memory then again there is no point of creating the
		// object reference to the static variables.
		//obj.sum();

	}

	public void sendemail() { // non static method

		System.out.println("send mail method");

	}

	public static void sum() { // static method

		System.out.println("sum method");
	}
}
