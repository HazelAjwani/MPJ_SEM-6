import java.util.Scanner;
public class display {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        
	        int reversed = 0;
	        int d;
	        while (n != 0) 
	        {
	            d = n % 10; 
	            reversed = reversed * 10 + d;
	            n /= 10; 
	        }
	        
	        System.out.println("Reversed Number: " + reversed);
	}
}
