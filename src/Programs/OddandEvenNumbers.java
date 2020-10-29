package Programs;

public class OddandEvenNumbers {

	public static void main(String[] args) {

		// Definition: we can print even and odd no by getting the remainder of
		// each element and checking whether it is divided by 2 or not if it is
		// divided
		// by 2 then it is an even no otherwise it is an odd no

		int a[] = { 1, 2, 3, 45, 99, 34, 67 };

		System.out.println("Odd numbers is : ");

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {

				System.out.println(a[i]);

			}

		}

		System.out.println("Even numbers is : ");

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				
				System.out.println(a[i]);
			}

		}
	}
}
