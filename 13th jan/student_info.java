package student_info;

import java.util.Scanner;

public class Information {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//INPUT
		System.out.println("Enter student's name: ");
		String name = sc.nextLine();
		System.out.println("Enter student's roll no.: ");
		short rolln = sc.nextShort();
		int marks[] = new int[5];
		System.out.println("Enter student's marks: ");
		int i, total=0;
		for(i=0;i<5;i++)
		{
			System.out.print("for subject " + (i+1) + ":");
			marks[i] = sc.nextInt();
			total+=marks[i];
		}
		
		double average = total / 5.0 ;
		
		 char grade;
	        if (average >= 85) 
	        {
	            grade = 'A';
	        } 
	        else if (average >= 70) 
	        {
	            grade = 'B';
	        } 
	        else 
	        {
	            grade = 'C';
	        }
		
		//DISPLAY
		System.out.println("\nStudent info entered:");
        System.out.println("Name: " + name);
        System.out.println("Roll no.: " + rolln);
        System.out.println("Marks:");
        for (i = 0; i < 5; i++) 
        {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.printf("Average Marks: %.2f%n", average);
        System.out.println("Grade: " + grade);
	}

}
