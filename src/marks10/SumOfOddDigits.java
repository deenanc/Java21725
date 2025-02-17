package marks10;

import java.util.Scanner;

public class SumOfOddDigits {
	
	public static int sumOdd(int input) {
		int last, sum=0;
		
		while(input>0) {
			last=input%10;
			
			if((last%2)!=0) {
				sum=sum+last;
			}
			
			input=input/10;
		}
		
		return sum;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Input");
		int input=sc.nextInt();
		
		System.out.println("Sum of odd numbers is "+sumOdd(input));
		
		sc.close();

	}

}
