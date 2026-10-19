import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (!input.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            input.close();
            return;
        }
        int n = input.nextInt();
        if (n >= 1000) {
            System.out.println("Invalid input! n must be < 1000.");
        }
        else {
            int count = 0;
            long sum = 0;
            for (int i = 1000; i >= n; i--) {
                System.out.println(i+ " ");
                sum += i;
                count++;
            }
            double average = (double) sum / count;
            System.out.println("\nSum= " + sum);
            System.out.println("Average = " + average);
        }
        input.close();

    }
}