package Programs;

public class ArmstrongNumber {

	public static void main(String[] args) {

		// 370, 153, 371, 407
		// The sum of cubes of a no is equals to a given no is called as arm
		// strong number.

		isanarmstrong(370);

	}

	public static void isanarmstrong(int num) {

		int cube = 0;
		int r;
		int t;

		t = num;
		System.out.println("given number is " + num);

		while (num > 0) {

			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);

		}
		if (t == cube) {
			System.out.println("this is an armstrong number");
		} else {
			System.out.println("this is not an armstrong number");
		}

	}

}
