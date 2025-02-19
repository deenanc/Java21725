package marks10;

import java.util.Scanner;

public class CheckCharacters {
	
	public static void checkChar(String input) {
		
		if(input.charAt(0)==input.charAt(input.length()-1)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Input");
		String input=sc.nextLine();
		
		checkChar(input);
		
		sc.close();

	}

}
