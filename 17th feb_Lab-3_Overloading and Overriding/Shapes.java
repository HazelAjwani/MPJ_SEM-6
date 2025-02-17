import java.util.*;

public class Shapes {
    double area;

    // CONSTRUCTOR OVERLOADING
    // Constructor for Circle
    Shapes(double radius) {
        area = calculate(radius);
    }

    // Constructor for Square
    Shapes(int side) {
        area = calculate(side);
    }

    // Constructor for Rectangle
    Shapes(double length, double width) {
        area = calculate(length, width);
    }

    // METHOD OVERLOADING
    // Area of Circle
    double calculate(double r) {
        area = 3.14 * r * r;
        return area;
    }

    // Area of Square
    double calculate(int s) {
        area = s * s;
        return area;
    }

    // Area of Rectangle
    double calculate(double l, double w) {
        area = l * w;
        return area;
    }

    void displayArea() {
        System.out.println("Area: " + area);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String ch;

        do {
            System.out.println("\nChoose a shape to calculate area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.print("Enter your choice (1/2/3): ");
            int choice = sc.nextInt();
            
            // Clearing the buffer
            sc.nextLine();

            switch (choice) {
                case 1: // Circle
                    System.out.print("Enter the radius of the Circle: ");
                    double radius = sc.nextDouble();
                    Shapes circle = new Shapes(radius);
                    System.out.print("Circle ");
                    circle.displayArea();
                    break;

                case 2: // Rectangle
                    System.out.print("Enter the length of the Rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter the width of the Rectangle: ");
                    double width = sc.nextDouble();
                    Shapes rectangle = new Shapes(length, width);
                    System.out.print("Rectangle ");
                    rectangle.displayArea();
                    break;

                case 3: // Square
                    System.out.print("Enter the side of the Square: ");
                    int side = sc.nextInt();
                    Shapes square = new Shapes(side);
                    System.out.print("Square ");
                    square.displayArea();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            // Clearing the buffer before taking the next input
            sc.nextLine();
            System.out.print("Do you want to continue with the execution? (yes/no): ");
            ch = sc.nextLine();

        } while (ch.equalsIgnoreCase("yes"));

        sc.close();
        System.out.println("Program Terminated.");
    }
}
