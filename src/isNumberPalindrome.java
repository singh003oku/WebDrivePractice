package DemoPakage;

import java.util.Scanner;

public class isNumberPalindrome {

	public static void main(String[] args) {

		int orginalNumber, mod, temp, reverseNumber = 0, rem;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number:");
		orginalNumber = s.nextInt();
		temp = orginalNumber;

		while (temp > 0) {
			rem = temp % 10;
			reverseNumber = reverseNumber * 10 + rem;
			temp = temp / 10;
		}

		if (orginalNumber == reverseNumber) {

			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number was not palindrome");

		}

	}

}
