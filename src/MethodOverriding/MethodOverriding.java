package MethodOverriding;

public class MethodOverriding {

	// Definition: when same method is present in parent class as well in child
	// class with same name and same no of arguments is called as method
	// overriding.

	public static void main(String[] args) {

		// Static or compile time polymorphism at the time of compilation java
		// will decide which method it need to call.

		// Polymarphism means one to many it means method overriding ie., with
		// same name and same no of arguments.

		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.threadsfety();

		// below is car class referred by parent itself.
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();

		// c.threadsafety- if we try to access this method it will not allow to
		// do so because parent class (Car) cannot access the methods of Child
		// class (BMW)

		// *******************************

		// Below is child class object can be referred by parent class reference
		// variable --
		// dynamic polymarphism or Runtime polymarphism.

		// this is also called as top casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();

		// from above c1.thread safety we can refer parent as a reference to
		// child but child
		// class objects we cannot be accessed by parent.

		// ***********************************

		// Down casting

		BMW b1 = (BMW) new Car();
		b1.start();
		b1.stop();
		b1.refuel();
		b1.threadsfety();

		// above will accepted at the time of compilation but at the time of
		// runtime it will give below exception called ClassCastException
		/*
		 * Exception in thread "main" Car stop method Car refuel
		 * java.lang.ClassCastException: MethodOverriding.Car cannot be cast to
		 * MethodOverriding.BMW at
		 * MethodOverriding.MethodOverriding.main(MethodOverriding.java:52)
		 */

	}

}
