import java.util.Scanner;

public class Exercise4 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    String date;
    System.out.print("Input: ");
    date = input.nextLine();
    String[] parts = date.split("-");
    boolean valid = true;
    if (parts.length != 3) {
        valid = false;
    } else {
        try {
            int year = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int day = Integer.parseInt(parts[2]);
            if (month < 1 || month > 12) {
                valid = false;
            } else {
                int daysInMonth = 0;
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        daysInMonth = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        daysInMonth = 30;
                        break;
                    case 2:
                        if (year % 400 == 0 ||
                            (year % 4 == 0 && year % 100 != 0)) {
                            daysInMonth = 29;
                        } else {
                            daysInMonth = 28;
                        }
                        break;
                }
                if (day < 1 || day > daysInMonth) {
                    valid = false;
                }
            }
        } catch (NumberFormatException e) {
            valid = false;
        }
    }
    if (valid) {
        System.out.println("Output: valid");
    } else {
        System.out.println("Output: invalid");
    }
    input.close();
}

}