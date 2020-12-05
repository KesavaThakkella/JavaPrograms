
public class Constructor {

	// Constructor means a class entity which is used to define some class
	// features while creating the object
	// Constructor cannot return any value and name should be same as class
	// name
	// Constructor looks like a function but it is not a function and we
	// don't write any void or return type some thing inside a constructor
	// we don't write any return statement.

	// Can i over load the constructor:
	// Yes you can overload the constructor
	// How to call a constructor
	// Ans: constructor will be called immediately when we create the object
	// of this particular class
	// How to call a method if it is a non static we need to create an
	// object reference and by using object reference we need to call it for
	// the methods.
	// But for constructor will be called immediately when we create the
	// object of this particular class
	// Default constructor is a hidden constructor. but for other one
	// parameterized or two parameterized there is no hidden constructors.

	public Constructor() {

		System.out.println("Default constructor");

	}

	public Constructor(int i) {
		System.out.println("Single parameterized constructor");
		System.out.println("The Value of i is " + i);
	}

	public Constructor(int i, int j) {

		System.out.println("Double parameterized constructor");
		System.out.println("The Value of i is " + i);
		System.out.println("The Value of j is " + j);
	}

	public static void main(String[] args) {

		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(5);
		Constructor obj2 = new Constructor(5, 10);

	}

}
