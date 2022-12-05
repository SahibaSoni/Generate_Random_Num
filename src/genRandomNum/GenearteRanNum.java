package genRandomNum;

import java.util.Random;

//Practical 1: Generate 500 random numbers and print the nth smallest number in a programming language of your choice. 
//(Ask user for the Nth smallest number)


public class GenearteRanNum {
	
	public void generateRandomNum(int num) {
		
		int[] randomNum = new int[500];
		int smallestNum = num;
		int i;
		
		System.out.println("********"+randomNum.length);
		
		for(i=0; i<randomNum.length;i++)
		{
		   Random ran = new Random();
		   int generateRandomNum = ran.nextInt(num);
		   System.out.println("**** "+generateRandomNum);
		   
		   if(smallestNum>=generateRandomNum)           //100 >56
		   {
			   smallestNum = generateRandomNum;        // 56 = smallestNum
			   
		   }
		   randomNum[i]=generateRandomNum;
		 }
		System.out.println("Smallest Num is " + smallestNum );
		
		
		for(i=0;i<randomNum.length;i++)
		{
			if(randomNum[i]== smallestNum)
			{
				break;
			}
			
		}	System.out.println("Position is : "+ i);
	}
	public static void main(String[] args) {
		
		GenearteRanNum gn = new GenearteRanNum();
		gn.generateRandomNum(9999);

		
	}

}


//public int generateRandomNum(int num)
//{
//	Random rn = new Random();
//	int randomNum = rn.nextInt(num);
//	return randomNum;
//}