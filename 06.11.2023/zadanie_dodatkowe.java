import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> listaZadan = new ArrayList<>();
        File file = new File("zad1.txt");
        if (file.exists())
		{
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine())
			{
                String task = fileScanner.nextLine();
                listaZadan.add(task);
            }
            fileScanner.close();
        }

        Scanner keyboard = new Scanner(System.in);
        String noweZadanie;
        while (true)
		{
            System.out.print("Wprowadz dane (type exit zeby wyjsc) : ");
            noweZadanie = keyboard.nextLine();

            if (noweZadanie.equalsIgnoreCase("exit"))
			{
                break;
            }

            if (listaZadan.contains(noweZadanie))
			{
                System.out.println("Juz jest na liscie");
				listaZadan.remove(noweZadanie);
				System.out.println("Zostal usuniety");
            }
			else
			{
                listaZadan.add(noweZadanie);
                System.out.println("Jest dodane");
            }
        }

        PrintWriter outputFile = new PrintWriter("zad1.txt");
        for (String task : listaZadan)
		{
            outputFile.println(task);
        }
        outputFile.close();

        System.out.println("List:");
        for (String task : listaZadan)
		{
            System.out.println(task);
        }
    }
}
