import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		a=sc.nextInt();
		System.out.println("enter the second number:");
		b=sc.nextInt();
		
		System.out.println("before swapping: a=" + a +" b=" + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping: a=" + a +" b=" + b);		
	}
}
