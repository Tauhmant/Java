/**
123
*/

import java.util.Scanner;

public class zadanie7
{
	public static void main(String[] args)
	{
		double v, r, e, s;
		Scanner input = new Scanner(System.in);
		System.out.println("V to liczba sadzonekm jakie można umieścic w rzędzie");
		System.out.print("R to długość rzędu w metrach = ");
		r = input.nextDouble();
		System.out.print("E to ilość meijsca zajmowanego przez okratowanie = " );
		e = input.nextDouble();
		System.out.print("S to obległość między sadzonkami w metrach = " );
		s = input.nextDouble();
		System.out.println("V = (R - 2E) / S");
		v = (r - 2*e) / s;
		System.out.println(v + " = (" + r + " - " + 2*e + ") / " + s);
	}
}