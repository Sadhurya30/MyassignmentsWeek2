package week2.day2;
import java.util.Arrays;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] numbers = {11,21,31,21,8,9,11};
         
         for(int i=0; i<numbers.length; i++) {
        	 for(int j=i+1; j<numbers.length;j++) {
        		 
        		 if(numbers[i]==numbers[j])
        		 {
        			 System.out.println(numbers[i]);
        		 }
        	 }
         }
		
	}

}
