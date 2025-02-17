package marks10;

import java.util.Scanner;

public class IDValidation {
	
	public static void validateID(String input) {
		
		if(input.matches("[0-9]{3}-{1}[0-9]{3}-{1}[0-9]{4}")) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter input");
		String input=sc.next();
		
		validateID(input);
		
		sc.close();

	}

}
