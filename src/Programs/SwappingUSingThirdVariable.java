package Programs;

public class SwappingUSingThirdVariable {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c;

		c = a;
		a = b;
		b = c;

		System.out.println("Swapping of A is " + a);
		System.out.println("Swapping of B is " + b);

	}

}
