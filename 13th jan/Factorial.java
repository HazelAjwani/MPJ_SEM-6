import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		if (n<0)
		{
			System.out.print("Invalid input");
		}
		else if (n == 0)
		{
			System.out.print("Factorial of " + n + "is:" + 1);
		}
		else
		{   int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact*=i;
			}
			System.out.print("Factorial of " + n + " is: " + fact);
		}
	}

}
