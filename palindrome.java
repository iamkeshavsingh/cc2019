import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }

    public static boolean isPalindrome(int num) {

        int m = num;
        int rev = 0;

        while (num != 0) {

            rev = (rev * 10) + (num % 10);
            num /= 10;
        }

        if (m == rev)
            return true;
        else
            return false;
    }
}