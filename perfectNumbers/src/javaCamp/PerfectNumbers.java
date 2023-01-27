package javaCamp;

public class PerfectNumbers {

	public static void main(String[] args)
	{
		int number=28;
		int total=0;
		double number2=number;
		
	
		for(int i=1; i<number; i++)
		{

			if(number/i==number2/i)
			
				total=total+i;
			
		}
			
			if(total==number)
			
				System.out.println("The number is a perfect number.");
				
			
			else
				System.out.println("The number is not a perfect number.");
		}
	}


