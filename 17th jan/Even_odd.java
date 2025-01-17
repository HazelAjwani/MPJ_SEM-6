import java.util.Scanner;
public class Check {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number to be checked: ");
		n=sc.nextInt();
		if (n%2==0)
		{
			System.out.println(n +" is even");
		}
		else if(n==0)
		{
			System.out.println(n +" is neither odd or even");
		}
		else
		{
			System.out.println(n +" is odd");
		}
	}

}
