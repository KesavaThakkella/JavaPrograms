package Programs;

public class RemoveJunkOrSpecialCharacters {

	public static void main(String[] args) {

		String s = "%&*kesavaSUBASH991458221";
		s = s.replaceAll("[^A-Z0-9]", " ");
		System.out.println(s);

		String s1 = "kesavaSUBASH901456%^&*";

		s1.replaceAll("[^a-z]", " ");
		System.out.println(s1);

	}

}
