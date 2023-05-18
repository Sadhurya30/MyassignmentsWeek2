package week2.day3;

public class LearnStringMet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	String text ="test";
		String upperCase = text.toUpperCase();
		System.out.println(upperCase);
		*/
		
		String test = "changeme";
		//String a= "";
		
		char[] arr1 = test.toCharArray();
		
		for(int i=0;i< arr1.length;i++) {
			if(i%2!=0) {
				 System.out.print(Character.toUpperCase(arr1[i]));
				 
			}
			else {
				System.out.print(arr1[i]);
			
			
		}
		
		
		
		
	}

}
}
