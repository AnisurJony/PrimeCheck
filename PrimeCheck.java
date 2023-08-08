package PrimeCheck;
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 1) {
            System.out.print(0);
            return;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.print(0);
                return;
            }
        }

        System.out.print(1);
    }
}
