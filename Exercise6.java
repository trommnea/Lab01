import java.util.Scanner;

public class Exercise6 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    int math, english, physics, programming;
    int max, min;
    double average;
    System.out.print("Input your scores of 4 subjects (Math, English, Physics, and Programming): ");
    math = input.nextInt();
    english = input.nextInt();
    physics = input.nextInt();
    programming = input.nextInt();
    max = Math.max(Math.max(math, english), Math.max(physics, programming));
    min = Math.min(Math.min(math, english), Math.min(physics, programming));
    average = (math + english + physics + programming) / 4.0;
    System.out.print("Max score is: " + max + " (");
    boolean first = true;
    if (math == max) {
        System.out.print("Math");
        first = false;
    }
    if (english == max) {
        if (!first) System.out.print(" and ");
        System.out.print("English");
        first = false;
    }
    if (physics == max) {
        if (!first) System.out.print(" and ");
        System.out.print("Physics");
        first = false;
    }
    if (programming == max) {
        if (!first) System.out.print(" and ");
        System.out.print("Programming");
    }
    System.out.println(" subject(s).");
    System.out.print("Min score is: " + min + " (");
    first = true;
    if (math == min) {
        System.out.print("Math");
        first = false;
    }
    if (english == min) {
        if (!first) System.out.print(" and ");
        System.out.print("English");
        first = false;
    }
    if (physics == min) {
        if (!first) System.out.print(" and ");
        System.out.print("Physics");
        first = false;
    }
    if (programming == min) {
        if (!first) System.out.print(" and ");
        System.out.print("Programming");
    }
    System.out.println(" subject(s).");
    System.out.println("Average score of this student is: " + average);
    input.close();
}

}