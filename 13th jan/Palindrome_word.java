package check_palindrome;
import java.util.Scanner;

public class check {
	public static boolean isPalindrome(String str) 
	{
        int left = 0;
        int right = str.length() - 1;

        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right)) 
            {
                return false; //not palindrome
            }
            left++;
            right--;
        }
        return true; //palindrome
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        input=input.toLowerCase();

        if (isPalindrome(input)) {
            System.out.println("string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("string \"" + input + "\" is not a palindrome.");
        }
	}

}
