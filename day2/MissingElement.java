package week2.day2;
import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {1,2,3,4,7,6,8};
       Arrays.sort(arr);
       
       System.out.println(Arrays.toString(arr));
       
       int sum1 = 0;
       for(int i=1;i<=8;i++) {
    	   sum1 =sum1 + i;
       }
       
       System.out.println(sum1);
       
       int sum2 =0;
       for(int i=0;i<arr.length;i++) {
    	   sum2 =sum2+ arr[i];
       }
       
       System.out.println(sum2);
       
       int sum3 = 0;
       sum3 = sum1 -sum2;
       System.out.println(sum3);
       
	}

}
