import java.util.Random;
import java.util.Scanner;

public class tictactoeLarin {

    static char[] pole = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    static char gracz;
    static char komputer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz swój symbol: 0 lub 1");
        int wybor = scanner.nextInt();
        if (wybor == 0) {
            gracz = '0';
            komputer = '1';
        } else {
            gracz = '1';
            komputer = '0';
        }

        while (true) {
            rysujPlansze();
            ruchGracza(scanner);
            if (czyWygrana(gracz)) {
                rysujPlansze();
                System.out.println("Gratulacje! Wygrałeś!");
                break;
            }
            if (czyRemis()) {
                rysujPlansze();
                System.out.println("Remis!");
                break;
            }
            ruchKomputera();
            if (czyWygrana(komputer)) {
                rysujPlansze();
                System.out.println("Komputer wygrał!");
                break;
            }
            if (czyRemis()) {
                rysujPlansze();
                System.out.println("Remis!");
                break;
            }
        }
        scanner.close();
    }

    static void rysujPlansze() {
        System.out.println("-------------");
        for (int i = 0; i < 9; i += 3) {
            System.out.println("| " + pole[i] + " | " + pole[i + 1] + " | " + pole[i + 2] + " |");
            System.out.println("-------------");
        }
    }

    static void ruchGracza(Scanner scanner) {
        int wyborPola;
        do {
            System.out.println("Twój ruch. Wybierz pole (1-9):");
            wyborPola = scanner.nextInt() - 1;
        } while (wyborPola < 0 || wyborPola > 8 || pole[wyborPola] != ' ');
        pole[wyborPola] = gracz;
    }

    static void ruchKomputera() {
        Random rand = new Random();
        int wyborPola;
        do {
            wyborPola = rand.nextInt(9);
        } while (pole[wyborPola] != ' ');
        pole[wyborPola] = komputer;
    }

    static boolean czyWygrana(char symbol) {
        return (pole[0] == symbol && pole[1] == symbol && pole[2] == symbol) ||
                (pole[3] == symbol && pole[4] == symbol && pole[5] == symbol) ||
                (pole[6] == symbol && pole[7] == symbol && pole[8] == symbol) ||
                (pole[0] == symbol && pole[3] == symbol && pole[6] == symbol) ||
                (pole[1] == symbol && pole[4] == symbol && pole[7] == symbol) ||
                (pole[2] == symbol && pole[5] == symbol && pole[8] == symbol) ||
                (pole[0] == symbol && pole[4] == symbol && pole[8] == symbol) ||
                (pole[2] == symbol && pole[4] == symbol && pole[6] == symbol);
    }

    static boolean czyRemis() {
        for (char c : pole) {
            if (c == ' ') {
                return false;
            }
        }
        return true;
    }
}