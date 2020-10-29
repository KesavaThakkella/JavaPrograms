package StringsConcept;

public class StringManipulation {

	// A string is a collection of different characters. which encoaded in
	// double codes.

	public static void main(String[] args) {

		String s = "The rains have started here";
		System.out.println(s.length());

		// i want to find what exactly char is available at 5 index or location.

		System.out.println(s.charAt(5));

		// Finding the index of a character.

		System.out.println(s.indexOf('s')); // 1st occurrence of s

		// if we want to check the 2nd index of s in a given string.

		// here do not start the counting from 0th location start the counting
		// from 9th location

		System.out.println(s.indexOf('s', 9));

		// Above is hard coded value it's better to do like below.
		// Below is 2nd occurrence of s

		System.out.println(s.indexOf('s', s.indexOf('s') + 1));

		// Below is getting particular index of a given string

		System.out.println(s.indexOf("have"));

		// if we are searching for not declared string in a given string
		// below will return -1 value

		System.out.println(s.indexOf("kesava"));// it should not throw any error

		// String comparison
		// string comparison will be case sensitive.
		// make sure that when we do any string comparison both the strings are
		// exactly same if not it will throw false value.
		// But if both the strings are same then it will throw true value.

		String s1 = "The rains have started here";

		// String s1 = "The rains have started Here";

		System.out.println(s.equals(s1));

		// even if both the cases are not same and wanted to ignore the case
		// sensitive and print the string we have below method then it will
		// throw true
		// value.

		String s2 = "The rains have started Here";

		System.out.println(s.equalsIgnoreCase(s2));

		// Below is getting substring of a given string
		// Below will not print the value at 8th position

		System.out.println(s.substring(0, 8));

		// from above to print the 8th position also we should declare 9th
		// position then it will ignore the 9th position and will print the
		// character at 8th position.

		System.out.println(s.substring(0, 9));

		// trim
		// trim method can be used to remove before and after space and print
		// exact values from a given
		// string.

		String s3 = "  Hello World  ";

		System.out.println(s3.trim());

		// To remove space between the given string we have to use replace
		// method.

		System.out.println(s3.replace(" ", ""));

		// Below is 2nd Eg: for replace string.

		String date = "08-04-1996";

		System.out.println(date.replace("-", "/"));

		// Split Method: Return type of split method is string array.

		String test = "Hello_World_Selenium";
		String testvalue[] = test.split("_");

		for (int i = 0; i < testvalue.length; i++) {

			System.out.println(testvalue[i]);
		}
		// Below is concadinate what it will do is it will add the values to the
		// given string

		String s4 = "cares";

		System.out.println(s4.concat("sy"));

		// Below is very very imp interview question

		String x = "Hello";
		String y = "World";

		int a = 100;
		int b = 200;

		System.out.println(x + y);
		System.out.println(a + b);
		System.out.println(x + y + a + b); // left to right it will print.
		System.out.println(a + b + x + y); // left to right it will print.
		System.out.println(x + y + (a + b));

		String ss = "kesavasubashnaidus";
		System.out.println(ss.indexOf('s', ss.indexOf(s)) + 1);

	}

}
