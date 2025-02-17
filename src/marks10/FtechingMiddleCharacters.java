package marks10;

import java.util.Scanner;

public class FtechingMiddleCharacters {
	
	public static String fetchMiddleChars(String input) {
		
		StringBuffer sb=new StringBuffer();
		
		sb.append(input.substring(input.length()/2-1, input.length()/2+1));
		
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter input");
		String input=sc.next();
		
		System.out.println("Middle characters are "+fetchMiddleChars(input));
		
		sc.close();

	}

}
