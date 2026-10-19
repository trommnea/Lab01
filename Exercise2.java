import java.util.Scanner;

public class Exercise2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    // Display the program title
    System.out.println("===========================================");
    System.out.println("      Welcome to our program              ");
    System.out.println(" 'Quadratic Equation Solver ax^2+bx+c=0'  ");
    System.out.println("===========================================");
    // Input coefficients
    System.out.print("Enter a: ");
    double a = input.nextDouble();
    System.out.print("Enter b: ");
    double b = input.nextDouble();
    System.out.print("Enter c: ");
    double c = input.nextDouble();
    // Check whether the equation is quadratic
    if (a == 0) {
        System.out.println("Invalid equation! a must not be zero.");
    } else {
        System.out.println("-------------------------------------------");
        System.out.println("Roots of this equation: "
                + a + "x^2 + " + b + "x + " + c + " = 0");
        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;
        // Find the roots
        if (discriminant > 0) {
            double firstRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
            double secondRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("X1 = " + firstRoot);
            System.out.println("X2 = " + secondRoot);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("One repeated root = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("X1 = " + realPart + " + "
                    + Math.abs(imaginaryPart) + "i");
            System.out.println("X2 = " + realPart + " - "
                    + Math.abs(imaginaryPart) + "i");
        }
        System.out.println("-------------------------------------------");
    }
    input.close();
}

}