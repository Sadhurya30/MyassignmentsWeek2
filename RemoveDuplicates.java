package week2.day3;


public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] splitArr =text.split(" ");
		
		for(int i=0;i<splitArr.length;i++) 
		{
			int count = 0;
			for(int j = i+1; j< splitArr.length; j++)
			{
				if(splitArr[i].equals(splitArr[j]))
				{
					count+= 1;
					if(count > 0)
					{
						splitArr[j] = "";
					}
				}
					
			}
		}
		
		String result = "";
		for(int i=0;i<splitArr.length;i++)
		{
			String s = splitArr[i];
//			System.out.print(s);
//			System.out.print(s.length());
//			System.out.println();
			if(s.length() > 0)
			{ result += splitArr[i] + " ";
			}
		}
		//System.out.println();
		System.out.print(result);
	}
}
          