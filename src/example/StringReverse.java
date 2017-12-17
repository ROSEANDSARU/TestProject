package example;

import java.util.Scanner;

public class StringReverse {

public static void main(String args[]){
	
	String original,reversed="";
	int length;
	
	Scanner sc = new Scanner(System.in);
	
System.out.println("enter your string");	
	original = sc.nextLine();
	length=original.length();
	for(int i=length-1;i>=0;i-- )
	{
		
		reversed = reversed+original.charAt(i);
		
	}
	System.out.println(reversed);
	sc.close();
	
}



}
