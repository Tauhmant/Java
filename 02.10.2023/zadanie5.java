import java.util.Scanner;

public class zadanie5
{
	public static void main(String[] args)
	{
	double odp, wartosc1, wartosc2;
	int selectedOption;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Podaj wartosc: ");
	wartosc1 = input.nextDouble();
	System.out.print("Co chciesz zrobić:\n1 -> +\n2 -> -\n3 -> *\n4 -> /\n");
	selectedOption = input.nextInt();
	System.out.print("Podaj wartosc: ");
	wartosc2 = input.nextDouble();
	if (selectedOption == 1) {
		odp = wartosc1 + wartosc2;
		System.out.println("Odp = " + odp);
	}
	else if (selectedOption == 2) {
		odp = wartosc1 - wartosc2;
		System.out.println("Odp = " + odp);
	}
	else if (selectedOption == 3) {
		odp = wartosc1 * wartosc2;
		System.out.println("Odp = " + odp);
	}
	else if (selectedOption == 4) {
		odp = wartosc1 / wartosc2;
		System.out.println("Odp = " + odp);
	}
	}
}