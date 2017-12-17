package example;

import java.util.Scanner;

public class PatternTriangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your value");
		int i =sc.nextInt();
		
		for(int j=1;j<=i;j++)
		{
			for(int k = i-j;k>0;k--)
			{
				System.out.print("*");
			}
			for(int l=j;l>0;l--)
			{
				System.out.print(j+" ");
				
			}
			for(int k = i-j;k>0;k--)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}
