package DemoPakage;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {

			
		int orginalNumber, mod, reverseNumber = 0,rem;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        orginalNumber = s.nextInt();
       
        
        while(orginalNumber > 0)
        {
            rem = orginalNumber % 10;
            reverseNumber = reverseNumber * 10 + rem;
            orginalNumber = orginalNumber / 10;
        }
		
        System.out.println("Reverse Number is :"+reverseNumber);
        
	}

}
