import java.util.Scanner;

public class SimpleCalculatorUsingScanner {

	void Mul(int a, int b) {

		int mul;
		mul = a * b;
		System.out.println("Div of Two Value :" + mul);
	}

	void Div(int a, int b) {

		int Div;
		Div = a / b;
		System.out.println("Div of Two Value :" + Div);
	}

	void Add(int a, int b) {
		int Sum;

		Sum = a + b;
		System.out.println("Sum of Two Values :" + Sum);

	}

	void Sub(int a, int b) {
		int Sub;

		Sub = a - b;
		System.out.println("Sum of Two Values :" + Sub);

	}

	public static void main(String[] args) {
		// Data Member
		int value1;
		int value2;
		int cal;
		// Object Creation for Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Pls enter the Value 1");
		value1 = sc.nextInt();
		System.out.println("pls enter 2nd value");

		value2 = sc.nextInt();

		System.out.println("Hi You have entered Value 1 :" + value1 + "  Value 2 :" + value2);

		// Object of current class to call the methods

		SimpleCalculatorUsingScanner CalObj = new SimpleCalculatorUsingScanner();

		// Call Add Method
		CalObj.Add(value1, value2);

		// Call Sub Methods
		CalObj.Sub(value1, value2);

		// Call Div
		CalObj.Div(value1, value2);

		// call Mul
		CalObj.Mul(value1, value2);
	}

}
