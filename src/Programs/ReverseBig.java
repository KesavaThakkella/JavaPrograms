package Programs;

public class ReverseBig {

	public static void main(String[] args) {

		String s = { "Hello World Selenium" };
		int len = s.length();
		// String sh[] = s.split(" ");

		String rev = "";

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

	}

}
