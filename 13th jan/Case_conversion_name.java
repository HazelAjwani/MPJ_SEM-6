import java.util.*;
public class convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name in lowercase: ");
		String name = sc.nextLine();
		String new_name = name.toUpperCase();
		System.out.println("Your name in uppercase:\n" + new_name);
	}

}
