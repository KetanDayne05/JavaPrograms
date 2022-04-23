package amstrongNumber;

public class AmstrongNumber
{

	public static void main(String[] args)
	{
		// variable declaration .
		
		int number = 153 , tempnumber = 153 , remainder , result = 0;
		
		// condition checking .
		
		while (number >0)
		{    
			//  remainder find .
			
			remainder = number % 10 ;
			
			// result of remainder .
			
			result  = result + (remainder * remainder * remainder);
			// updating number .
			
			number = number / 10 ;
			
			
		}
		  //  condition checking .
		
		if (tempnumber == result)
		{
			System.out.println("number is amstrong number");
			
		}
		
		else 
		{
			System.out.println("number is not amstrong number");
		}
		

	}

}
