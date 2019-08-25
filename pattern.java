import java.util.Scanner;

public class pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        patt(n);

        sc.close();
    }

    public static void patt(int n) {

        int tstar = 1;
        int tspaces = n;

        int m = (2 * n) - 1;

        while (m != 0) {

            int cspaces = 1;
            while (cspaces <= tspaces) {

                System.out.print(" ");
                cspaces++;
            }

            int cstar = 1;
            while (cstar <= tstar) {

                System.out.print("*");
                cstar++;
            }

            if (m > n) {
                tstar += 2;
                tspaces--;
            } else {
                tspaces++;
                tstar -= 2;
            }

            m--;
            System.out.println();
        }
    }
}
