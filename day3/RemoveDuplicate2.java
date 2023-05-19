package week2.day3;

public class RemoveDuplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    String name ="We learn java basics as part of java sessions in java week1";
    int count;
    String[] arr1 = name.split(" ");
    for(int i=0;i< arr1.length;i++) {
    	count =1;
    	for(int j=i+1;j<arr1.length;j++) {
    		if((arr1[i]).equals(arr1[j])) {
    			count++;
    			arr1[j]="ss";
    		}
    	}
    	if(count>=1 && (arr1[i]!="ss")) {
    		System.out.print(arr1[i]+ " ");
    	}
    }
    
	}

}
