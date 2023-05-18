package week2.day3;

public class LearnSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String text = "I like chicken biriyani";
     String[] split = text.split(" ");
     
    /* int len =split.length;
     System.out.println(len);*/
     
    
     int count =0;
     
     
     
     for(int i =0;i<split.length;i++) {
    	 System.out.println(split[i]);
    	 count++;
     }
     System.out.println(count);
     
     
	}

}
