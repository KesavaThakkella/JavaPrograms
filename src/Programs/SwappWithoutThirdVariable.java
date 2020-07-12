package Programs;

public class SwappWithoutThirdVariable {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;

		a = a - b;
		b = a + b;
		a = b - a;

		System.out.println("After swapping of a is " + a);
		System.out.println("After swapping of b is " + b);

	}

}
