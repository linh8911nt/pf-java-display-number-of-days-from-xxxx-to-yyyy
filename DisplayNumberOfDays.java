import java.util.Scanner;

public class DisplayNumberOfDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the begins year: ");
        int theBeginsYear = input.nextInt();
        System.out.println("Enter the final year: ");
        int theFinalYear = input.nextInt();

        System.out.println("Number of days from year " + theBeginsYear + " to " + theFinalYear + " is: " + numberOfDayInAYear(theBeginsYear, theFinalYear));
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else
                    return false;
            } else
                return true;
        } else
            return false;
    }

    public static int numberOfDayInAYear(int theBeginsYear, int theFinalYear) {
        int days = 0;
        for (int i = theBeginsYear; i < theFinalYear; i++) {
            if (isLeapYear(i)) {
                days += 366;
            } else
                days += 365;
        }
        return days;
    }
}
