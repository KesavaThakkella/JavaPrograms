package Programs;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {

		String names[] = { "java", "javascript", "selenium", "java", "python", "c", "selenium" };
		Set<String> store = new HashSet<String>();

		for (String name : names) {

			if (store.add(name) == false) {

				System.out.println("Duplicate element from a given string is : " + name);
				System.out.println("Kesava Subash");

			}
		}

		System.out.println("*********************Below is 2nd method using two for loops************************");

		// 2nd Method
		System.out.println("Below using two for loops it's time complixcity is O(nxn) which is worst ");

		for (int i = 0; i < names.length; i++) {

			for (int j = i + 1; j < names.length; j++) {

				if (names[i].equals(names[j])) {

					System.out.println("duplicate element is : " + names[i]);
					System.out.println("Kesava Subash");

				}

			}

		}

	}
}
