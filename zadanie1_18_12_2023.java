import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.io.*;

public class Schedule {
    public static void main(String[] args) {
        String[][] schedule = {
            {"    Time", "Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek"},
            {"1. 7:45-8:30", "", "Matematyka", "Matematyka", "Informatyka", "Witriny i Apl."},
            {"2. 8:40-9:25", "Historia", "Historia", "Matematyka", "Informatyka", "Bazy danych"},
            {"3. 9:35-10:20", "Chemia", "Chemia", "Wychowanie", "Witriny i Apl.", "Bazy danych"},
            {"4. 10:35-11:20", "Prog. Obiekt", "Polski", "Polski", "Witriny i Apl.", "Bazy danych"},
            {"5. 11:30-12:15", "Angielski", "Polski", "Niemicki", "Geografia", "WF"},
            {"6. 12:25-13:10", "WF", "Wychowanie", "Niemicki", "", "WF"},
            {"7. 13:20-14:05", "Prog. Obiekt", "Matematyka", "Informatyka", "", "HIT"},
            {"8. 14:10-14:55", "Prog. Obiekt", "Przedsie.", "", "", "Geografia"},
            {"9. 15:00-15:45", "Prog. Obiekt", "Witriny i Apl.", "", "", "Angielski"},
        };
        
        StringBuilder scheduleString = new StringBuilder();
        for (String[] row : schedule) {
            for (String cell : row) {
                scheduleString.append(cell).append("\t");
            }
            scheduleString.append("\n");
        }

        JOptionPane.showMessageDialog(null, new JScrollPane(new JTextArea(scheduleString.toString())));

        String day = JOptionPane.showInputDialog("Dzien tygodnia(Poniedzialek, Wtorek, Sroda, Czwartek, Piatek):");
        String lessonNumberStr = JOptionPane.showInputDialog("Numer lekcji (1-9)");

        try {
            int lessonNumber = Integer.parseInt(lessonNumberStr);
            if (lessonNumber >= 1 && lessonNumber <= 9) {
                int dayIndex = -1;
                switch (day.toLowerCase()) {
                    case "poniedzialek":
                        dayIndex = 1;
                        break;
                    case "wtorek":
                        dayIndex = 2;
                        break;
                    case "sroda":
                        dayIndex = 3;
                        break;
                    case "czwartek":
                        dayIndex = 4;
                        break;
                    case "piatek":
                        dayIndex = 5;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Blad");
                }

                if (dayIndex != -1) {
                    String lesson = schedule[lessonNumber][dayIndex];
                    if (lesson == "")
                    {
                        JOptionPane.showMessageDialog(null, "W " + day + " na " + lessonNumber + " lekcji nie ma lekcji");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "W " + day + " na " + lessonNumber + " lekcji : " + lesson);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Blad");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Blad");
        }
    }
}
