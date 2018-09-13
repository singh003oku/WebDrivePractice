package DemoPakage;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class factorialOfNumber {
	public static void main(String args[]) {
		int i, fact = 1;
		int number;

		System.out.println("Please enter the Number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial Of the Number is :" + fact);
	}
}
