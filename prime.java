import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        sc.close();
    }

    public static boolean isPrime(int num) {

        if (num == 1)
            return false;

        for (int i = 2; i < num; i++) {

            if (num % i == 0)
                return false;
        }

        return true;

    }
}