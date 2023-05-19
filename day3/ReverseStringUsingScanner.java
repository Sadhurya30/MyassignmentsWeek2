package week2.day3;

import java.util.Scanner;

public class ReverseStringUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		char[] arr1 = input.toCharArray();
		for(int i=arr1.length-1;i>=0;i--) {
			System.out.println(arr1[i]);
			
		}

	}

}
