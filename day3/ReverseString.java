package week2.day3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name ="Sadhurya";
     
     char[] arr1 = name.toCharArray();
     
     for(int i=arr1.length-1;i>=0;i--)
     {
    	 System.out.print(arr1[i] + " ");
     }
	}

}
