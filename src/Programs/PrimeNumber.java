package Programs;

public class PrimeNumber {

	// Prime no is a number which can be divided by itself or by 1 is known as
	// prime no.
	// Eg: 13 divided by 13
	// 4 can be divided by 2 and also divided by 4 alos so it is not a prime no.
	// 17 is a prime no
	// 2 is the lowest prime no

	public static boolean isPrimeNumber(int num) {

		if (num <= 1) {

			return false;
		}
		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {

		System.out.println("12 is prime number " + isPrimeNumber(12));
		System.out.println("13 is prime number " + isPrimeNumber(13));
		System.out.println("10 is prime number" + isPrimeNumber(10));
	}

}
