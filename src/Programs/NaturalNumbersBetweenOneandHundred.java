package Programs;

public class NaturalNumbersBetweenOneandHundred {

	// The natural numbers are the numbers that include all the positive
	// integers from 1 to infinity.
	// For example 1, 2, 3, 4, 5, ......, n. When we add these numbers together,
	// we get the sum of natural numbers.

	// Natural numbers divided by 3 and the common diff b/w each no is 3
	// 3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57,60,63,66,69,72,75,78,81,84,87,90,93,96,99

	// Natural numbers divided by 5 and the common diff b/w each no is 5
	// 55,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95

	// Natural numbers divided by both 3 and 5 & common diff b/w each no is 15
	// 15,30,45,60,75,90

	public static void main(String[] args) {

		System.out.println("Natural numbers divided by 3");
		for (int i = 1; i < 100; i++) {

			if (i % 3 == 0) {

				System.out.println(i);
			}

		}
		System.out.println("Natural numbers divided by 5");

		for (int i = 1; i < 100; i++) {

			if (i % 5 == 0) {

				System.out.println(i);

			}

		}
		System.out.println("Natural numbers divided by both 3 and 5");

		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {

				System.out.println(i);
			}
		}

	}

}
