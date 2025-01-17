import java.util.Scanner;
public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first string :");
		String s1 = sc.nextLine();
		System.out.println("Enter the second string :");
		String s2 = sc.nextLine();
		
		System.out.println("The concatenated string is: " + s1 + s2);
	}

}
