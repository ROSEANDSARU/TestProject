package example;

import java.util.Scanner;

public class DiamondPatterntriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value");
		int n = sc.nextInt();
		System.out.println(n);
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			/*for(int j=n-i;j>0;j--)
			{
				System.out.print(" ");
			}*/
			
			System.out.println("");
		}
	}

}
