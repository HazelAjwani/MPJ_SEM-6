import java.util.Scanner;

public class Isprime {

    static boolean check(int n) {
        if (n <= 1) 
        {
            return false; //not prime
        }
        
        for (int i = 2; i < (n-1); i++) { 
            if (n % i == 0) {
                return false; //not prime
            }
        }
        
        return true; //prime
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if (check(a)) {
            System.out.println(a + " is prime");
        } else {
            System.out.println(a + " is not prime");
        }
    }
}
