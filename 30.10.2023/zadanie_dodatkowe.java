import javax.swing.JOptionPane;
import java.util.Random;

public class zadanie_dodatkowe {
    public static void main(String[] args) {
        String[] options = {"+", "-", "*", "/"};
        int sproba, wartosc;
        int p1 = 0, x = 0, y = 0, op = 0, odp = 0;
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            x = rand.nextInt(10);
            y = rand.nextInt(10);
            op = rand.nextInt(4);
            String input1 = JOptionPane.showInputDialog(null, "Ile bedzie " + x + options[op] + y + "?");

            int userAnswer = 0;
			userAnswer = Integer.parseInt(input1);

            switch (op) {
                case 0:
                    odp = x + y;
                    break;
                case 1:
                    odp = x - y;
                    break;
                case 2:
                    odp = x * y;
                    break;
                case 3:
                    if (y != 0) {
                        odp = x / y;
                    } else {
                        JOptionPane.showMessageDialog(null, "Dzielenie przez zero! Przechodzimy do następnego pytania.");
                        continue;
                    }
                    break;
            }

            if (userAnswer == odp) {
                JOptionPane.showMessageDialog(null, "Poprawnie!");
                p1 += 10;
            } else {
                JOptionPane.showMessageDialog(null, "Nie, to było " + odp);
            }
        }
        JOptionPane.showMessageDialog(null, "Masz " + p1 + "%");
    }
}
