import java.util.Scanner;

public class Exercise3 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    int[] numbers = new int[5];
    int min, max;
    System.out.println("Input: ");
    // Input five numbers
    for (int i = 0; i < 5; i++) {
        numbers[i] = input.nextInt();
    }

    min = numbers[0];
    max = numbers[0];

    for (int i = 1; i < 5; i++) {
        if (numbers[i] < min) {
            min = numbers[i];
        }
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }

    System.out.print("Among all the five input numbers (");
    for (int i = 0; i < 5; i++) {
        System.out.print(numbers[i]);
        if (i < 4) {
            System.out.print(", ");
        }
    }
    System.out.println("), ");
    System.out.println("min is " + min + " and max is " + max + ".");
    input.close();
}

}