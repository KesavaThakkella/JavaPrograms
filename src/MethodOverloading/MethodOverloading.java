package MethodOverloading;

public class MethodOverloading {

	// Definition : When method name is same but with different input parameters
	// (or) arguments with in the same class is known as method overloading.
	// Dynamic or Run time polymarphism.

	// Note Points:
	// Can we overload the main method :
	// yes we can over load the main method.
	// Duplicate methods: same method name with same no of arguments is
	// not allowed.
	// We cannot create a method inside a method

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(5);
		obj.sum(5, 10);
		main();
		main(234567890);

	}

	public void sum() {// 0 input parameters

		System.out.println("Sum method with zero input parameters or zero arguments");
		System.out.println("******************************************");
	}

	public void sum(int i) {

		System.out.println("Sum method with 1 input parameter");
		System.out.println("Value of i is " + i);
		System.out.println("******************************************");

	}

	public void sum(int j, int k) {

		System.out.println("Sum method with 2 input parameters");
		System.out.println(j + k);
		System.out.println("******************************************");
	}

	public static void main() {

		System.out.println("Overloading the main method with no arguments or with no input parameters");
		System.out.println("******************************************");

	}

	public static void main(int s) {

		System.out.println("Overloading the main method with arguments or with input parameters");
		System.out.println("Value of s is " + s);

	}
}
