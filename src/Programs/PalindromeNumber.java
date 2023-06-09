package Programs;

A palindromic number is a number that remains the same when 
its digits are reversed

public class PalindromeNumber {

	public static void main(String[] args) {

		ispalindrome(15151);
	}

	public static void ispalindrome(int num) {

		int r = 0;
		int sum = 0;
		int t;

		t = num;

		while (num > 0) {

			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (t == sum) {

			System.out.println("Given no is a palindrome number");

		} else {
			System.out.println("Given no is not a palindrome number");
		}

	}

}
