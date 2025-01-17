import java.util.Scanner;
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers to display: ");
        int n = sc.nextInt();

        if (n <= 0) 
        {
            System.out.println("Invalid..Please enter a positive integer");
        } 
        else if (n == 1) 
        {
            System.out.println("Fibonacci sequence: 0");
        } 
        else 
        {
            System.out.print("Fibonacci sequence: 0, 1");
            int a=0, b=1, temp; 
            for (int i=3; i <= n; i++) 
            { 
                temp = a + b;
                System.out.print(", " + temp);
                a = b;
                b = temp;
            }
            System.out.println();
        }
	}

}
