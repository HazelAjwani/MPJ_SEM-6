package student_info;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Information {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // INPUT
            System.out.println("Enter student's name: ");
            String name = sc.nextLine();

            System.out.println("Enter student's roll no.: ");
            short rolln;
            while (true) {
                try 
                {
                    rolln = sc.nextShort(); 
                    break;
                } 
                catch (InputMismatchException e) 
                {
                    System.out.println("Invalid roll number!enter a valid short integer");
                    sc.next(); //to avoid infinite loop
                }
            }

            int marks[] = new int[5];
            System.out.println("Enter student's marks (0-100): ");
            int total = 0;

            for (int i = 0; i < 5; i++) 
            {
                while (true) 
                {
                    try {
                        System.out.print("For subject " + (i + 1) + ": ");
                        marks[i] = sc.nextInt(); 

                        // Validate marks range (0-100)
                        if (marks[i] < 0 || marks[i] > 100)
                        {
                            throw new IllegalArgumentException("Marks must be between 0 and 100");
                        }
                        total += marks[i]; 
                        break;
                    }
                    catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter an integer value for marks");
                        sc.next(); //to avoid infinite loop
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage()); 
                    }
                }
            }

            double average = total / 5.0; // Calculate average

            // Grade calculation
            char grade;
            if (average >= 85) {
                grade = 'A';
            } else if (average >= 70) {
                grade = 'B';
            } else {
                grade = 'C';
            }

            // DISPLAY
            System.out.println("\nStudent info entered:");
            System.out.println("Name: " + name);
            System.out.println("Roll no.: " + rolln);
            System.out.println("Marks:");
            for (int i = 0; i < 5; i++) {
                System.out.println("Subject " + (i + 1) + ": " + marks[i]);
            }
            System.out.printf("Average Marks: %.2f%n", average);
            System.out.println("Grade: " + grade);

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage()); 
            // Catches any unexpected exceptions
        } 
    }
}
