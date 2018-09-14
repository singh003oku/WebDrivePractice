import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int value1;
		int value2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter the Value 1");
		value1 = sc.nextInt();
		System.out.println("pls enter 2nd value");

		value2 = sc.nextInt();

		System.out.println("Hi You have entered Value 1 - " + value1 + "  Value 2 :" + value2);

		value1 = value1 - value2;
        value2 = value1 + value2;
        value1 = value2 - value1;
        
        System.out.println("Changed Value are : Value 1 - "+value1+" Value 2 is :"+ value2);
		
	}

}
