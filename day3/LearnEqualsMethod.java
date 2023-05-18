package week2.day3;

public class LearnEqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name1 = new String("Testleaf");
     String name2= new String("Testleaf");
     
    Boolean  equal = name1.equals(name2) ;
    System.out.println(equal);
    if(name1.equals(name2)) {
    	 System.out.println("Both are equal");
     }else {
    	 System.out.println("Both are not equal");
     }
     
     if(name1 == name2) {
    	 System.out.println("Both are equal");
     }else {
    	 System.out.println("Both are not equal");
     }
     
     
	}

}
