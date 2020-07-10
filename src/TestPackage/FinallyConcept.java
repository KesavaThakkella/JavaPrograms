package TestPackage;

public class FinallyConcept {

	// Finally is a block
	// finally keyword is always used to associate with try/catch blocks.
	// It doesn't matter even if exception is coming or not finally block will
	// be get executed.

	public static void main(String[] args) {

		division1();

	}

	public static void test1() {

		try {
			System.out.println("Inside the test1 method");
			throw new RuntimeException("test");
		} catch (Exception e) {

			System.out.println("Inside catch block");

		} finally {

			System.out.println("Inside finally block");

		}

	}

	public static void division() {

		int i = 10;
		try {
			System.out.println("Inside try block");
			int k = i / 0;
		} catch (ArithmeticException e) {
			System.out.println("Inside acatch block");
			System.out.println("divide by zero");

		} finally {
			System.out.println("execute this code after any exception");
		}
	}

	public static void division1() {

		int i = 10;
		try {
			System.out.println("Inside try block");
			int k = i / 0;
		} catch (NullPointerException e) {
			System.out.println("Inside acatch block");
			System.out.println("divide by zero");

		} finally {
			System.out.println("execute this code after any exception");
		}
	}

}
