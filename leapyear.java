import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (leap(year)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        sc.close();
    }

    public static boolean leap(int year) {

        if (year % 100 == 0 && year % 400 == 0)
            return true;

        else if (year % 100 != 0 && year % 4 == 0)
            return true;

        else
            return false;

    }
}