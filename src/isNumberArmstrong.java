package DemoPakage;

import java.util.Scanner;

public class isNumberArmstrong {

	public static void main(String[] args) {

		int orginalNumber, temp, newNumber = 0, rem;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number:");
		orginalNumber = s.nextInt();
		temp = orginalNumber;

		while (temp != 0) {
			rem = temp % 10;
			newNumber = newNumber + (rem * rem * rem);
			temp = temp / 10;
		}

		if (orginalNumber == newNumber) {

			System.out.println("Number is Armstong");
		} else {
			System.out.println("Number was not Armstong");

		}

	}

}
