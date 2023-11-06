import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> listaZadan = new ArrayList<>();
        File file = new File("zad1.txt");
        if (file.exists()) {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String task = fileScanner.nextLine();
                listaZadan.add(task);
            }
            fileScanner.close();
        }

        String noweZadanie;
        while (true)
		{
            noweZadanie = JOptionPane.showInputDialog("Wprowadz dane\n(wpisz 'exit' aby wyjsc)\n(wpisz 'list' aby zobaczyc list): ");

            if (noweZadanie.equalsIgnoreCase("exit"))
			{
                break;
            }
			
			if (noweZadanie.equalsIgnoreCase("list"))
			{
				StringBuilder taskList = new StringBuilder("Lista:\n");
                for (String task : listaZadan)
				{
					taskList.append(task).append("\n");
				}
				JOptionPane.showMessageDialog(null, taskList.toString());
				continue;
            }

            if (listaZadan.contains(noweZadanie))
			{
                JOptionPane.showMessageDialog(null, "Już jest na liście.");
                listaZadan.remove(noweZadanie);
                JOptionPane.showMessageDialog(null, "Zostalo usuniete");
            }
			else
			{
                listaZadan.add(noweZadanie);
                JOptionPane.showMessageDialog(null, "Dodano zadanie do listy.");
            }
        }

        PrintWriter outputFile = new PrintWriter("zad1.txt");
        for (String task : listaZadan)
		{
            outputFile.println(task);
        }
        outputFile.close();

        StringBuilder taskList = new StringBuilder("Lista:\n");
        for (String task : listaZadan)
		{
            taskList.append(task).append("\n");
        }
        JOptionPane.showMessageDialog(null, taskList.toString());
    }
}
