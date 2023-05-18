package week2.day3;

import java.util.Scanner;


public class LearnScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the input");
      
      String nextLine =  scan.nextLine();
      
      char[] arr1 = nextLine.toCharArray();
      
      for(int i=0;i< arr1.length;i++) {
    	  System.out.println(arr1[i]);
      }
      
      
	}

}
