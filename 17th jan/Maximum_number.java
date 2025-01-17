import java.util.Scanner;
public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of numbers: ");
        int n = sc.nextInt();

        if (n <= 0) 
        {
            System.out.println("Invalid input");
            return;
        }
        
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) 
        {
            numbers[i] = sc.nextInt();
            max=Math.max(max,numbers[i]); 
        }
       
        
        System.out.println("The maximum number is: " + max);
	}

}
