package javaCamp;

public class FindNumbers {

	public static void main(String[] args) {

     int[] numbers= new int[] {1,2,5,7,9,0};
     
     int willFind=3; 
     
     boolean itHas=false;
     
     for(int number: numbers) 
     {

    	 if(number==willFind) 
    	 {
    		 itHas=true;
    	 	 
    	   break; 
    	 }
        	 
     }
    	
    	 if(itHas==true) 
    	 {
         
    		 System.out.println("Yes, it has.");
    	 }
    	 
    	 else
    		 System.out.println("No, it has not.");
     }
		}