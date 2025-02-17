package marks10;

import java.util.Scanner;

public class SumOfEvenSquares {
	
	public static int sumEvenSQ(int input) {
		int sum=0,last;
		
		while(input>0) {
			last=input%10;
			
			if((last%2)==0) {
				last=last*last;
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
		
		System.out.println("Sum of squares of even digits is "+sumEvenSQ(input));
		
		sc.close();

	}

}
