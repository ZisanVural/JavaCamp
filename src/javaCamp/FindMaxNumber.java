package javaCamp;

public class FindMaxNumber {

	public static void main(String[] args) {
		
		int number1=20;
		int number2=25;
		int number3=12;
		int maxNumber=number1;
		
		if(maxNumber<number2)
		{
			maxNumber=number2;
		}
		
	 if(maxNumber<number3)
		{
			maxNumber=number3;
		}
		
	   System.out.println("The maximum number is: "+ maxNumber);
	}
}


