package week2.day2;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {1,5,6,7,2,3,10};
		
		Arrays.sort(num);
		
		for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
		}
		 
		for(int i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
		
	}

}
