package Programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	// Remove duplicate character from a given string.

	public static void main(String[] args) {

		String name = "kkksseeggtyuu";

		char[] chars = name.toCharArray();
		Set<Character> present = new HashSet<Character>();

		for (char c : chars) {

			if (present.add(c)) {

				System.out.println(c);

			}

		}

	}

}
