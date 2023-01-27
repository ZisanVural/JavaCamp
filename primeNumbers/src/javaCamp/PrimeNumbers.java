package javaCamp;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int number=7;
		int remainder;
		remainder=number%2; 
		boolean isPrime=true;
		
		if(number==1) //Since the smallest prime number is 2, we wrote a separate if block
		
		{
			System.out.println("The number is not prime.");
			
			return; //ends the function block
			
		}
		
		
		if(number<1)
		{
			System.out.println("Invalid number."); //0'dan küçük sayılar asal olamaz belirtmezsek bug oluyor
			
			return;
		}
		
	
		for(int i=2; i<number; i++) {
		
			if(number % i==0) 
			
				isPrime=false;
		 
			}
		 
			if(isPrime)
		
			 System.out.println("It's a prime number.");
			
			else
				
				System.out.println("It is not a prime number.");
	
	}
 
  }