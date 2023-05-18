package week2.day3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner scan = new Scanner(System.in);
		//scan.next();
		
		String name = "madam";
		String rev = "";
		
		char[] arr1 = name.toCharArray();
		 for(int i=arr1.length-1;i>=0;i--) {
				
				rev+=arr1[i];
				
		 }
		 System.out.println(rev);
		 
		// char[] arr2 = rev.toCharArray();
		 
		 if(name.equals(rev)) {
			 System.out.println("Its a palindrome");
		 }
		else {
				 System.out.println("Not a palindrome");
			 }
		 
		 //for(int i=0;i<)
		 }
	}
	

