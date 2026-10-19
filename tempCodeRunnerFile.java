import java.util.Scanner;
public class Exercise5 {
public static void main (String[] args) {
Scanner input = new Scanner (System.in);
System.out.print("Input n: ");
int n = input.nextInt();
System. out.print("All prime numbers from 2 to " + n + ": ");
for (int number = 2; number <= n; number++) {
boolean prime = true;
for (int i = 2; i < number; i++) {
if (number % i == 0) {
prime = false;
break;
}
}
if (prime) {
System.out.print(number + " ");
}
}
System.out.println();
input.close();
}
}