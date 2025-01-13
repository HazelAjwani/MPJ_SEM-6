
public class StarPattern {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  int rows = 3; // Number of rows

	        for (int i = 1; i <= rows; i++) 
	        {
	            // Printing spaces
	            for (int j = 1; j <= rows - i; j++) 
	            {
	                System.out.print(" ");
	            }
	            
	            // Printing stars
	            for (int k = 1; k <= (2 * i - 1); k++)
	            {
	                System.out.print("*");
	            }

	            // Move to the next line
	            System.out.println();
	        }
	}

}

