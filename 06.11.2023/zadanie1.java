import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Zadanie1 {
    public static void main(String[] args) throws IOException
	{
		PrintWriter plik;
		plik = new PrintWriter("Zad1.txt");
		plik.println("zadanie1");
		plik.println("zadanie2");
		plik.println("zadanie3");
		plik.close();
    }
}
