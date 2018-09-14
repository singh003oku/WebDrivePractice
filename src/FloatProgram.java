package DemoPakage;

import java.util.Scanner;

public class FloatProgram {

	public static void main(String[] args) {

		float a, b, sum;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		a = sc.nextFloat();
		System.out.println("Enter second Number");
		b = sc.nextFloat();
		System.out.println("Sum of Two number" + (a + b));
	}

}
