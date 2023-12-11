import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            double ln1 = 0.0;
            System.out.print("Liczba " + i);

            for (int j = 0; j <= i; j++) {
                double ln = (1.0 / (2 * j + 1)) * (1.0 / Math.pow(9, j));
                ln1 = ln1 + ln;
            }
            ln1 = (2.0 / 3) * ln1;
            System.out.print(" - " + ln1 + "\n");
        }
    }
}
