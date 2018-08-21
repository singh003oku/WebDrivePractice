import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		// Data Member
		int num;
		int temp;
		System.out.println("Pls Enter the Number to print the table");

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			temp = num * i;
			System.out.println("2*" + i + "= " + temp);
		}

	}

}
