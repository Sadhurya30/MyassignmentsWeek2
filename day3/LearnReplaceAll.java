package week2.day3;

public class LearnReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email ="testleaf001@gmail.com";
		
		//String replaceAll = email.replaceAll("[^0-9]","");
		
		//String replaceAll1 = email.replaceAll("\\D", "");
		
		
		char[]  arr1 = email.toCharArray();
		for(int i=0;i< arr1.length;i++) {
			
			// if(Character.isDigit(charArray[i])){
			//  system.out.println(charArray[i])
			
			if(arr1[i]>=48 && arr1[i]<=57) {
				System.out.println(arr1[i]);
			}
		}
		
	}

}
