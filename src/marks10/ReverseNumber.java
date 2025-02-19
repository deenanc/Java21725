package marks10;

import java.util.Scanner;

public class ReverseNumber {
	
	public static int revNo(int input) {
		int last, rev=0;
		
		while(input>0) {
			last=input%10;
			rev=rev*10+last;
			input=input/10;
		}
		
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter input");
		int input=sc.nextInt();
		
		System.out.println(revNo(input));
		
		sc.close();

	}

}
