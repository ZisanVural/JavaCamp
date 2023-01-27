package javaCamp;

public class KalinVeInceSesliHarfler {

	public static void main(String[] args) {
		
		char harf='G';
		
		switch(harf)
		{
		 case 'A':
		 case 'O':
		 case 'I':
		 case 'U':
		 case 'a':
		 case 'o':
		 case 'ı':
		 case 'u':
		
			 System.out.println("Harf, kalın seslidir.");
			 break;
		
		 case 'E':   //case sensitive olduğu için ayrı ayrı yazıldı.
		 case 'Ü':
		 case 'İ':
		 case 'Ö':
		 case 'e':
		 case 'i':
		 case 'ü':
		 case 'ö':
			 System.out.println("Harf, ince seslidir.");
			 break;
			 
			 default:
				 System.out.println("Sessiz harf girdiniz."); 
		 	
		
		}
		

}
}