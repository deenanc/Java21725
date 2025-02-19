package marks10;

import java.util.Scanner;

public class CreateNewChar {
	
	public static String newChar(String input1, int input2) {
		
		StringBuffer sb=new StringBuffer();
		
		sb.append(input1.substring(0, input2));
		sb.append(input1.substring((input1.length())-input2));
		
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter inputs");
		String input1=sc.next();
		int input2=sc.nextInt();
		
		System.out.println(newChar(input1, input2));
		
		sc.close();

	}

}
