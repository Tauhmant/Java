/**
123
*/
public class zadanie7
{
	public static void main(String[] args)
	{
		double v, r, e, s;
		r = 5;
		e = 2;
		s = 1.5;
		v = (r - 2*e) / s;
		System.out.println("V to liczba sadzonekm jakie można umieścic w rzędzie");
		System.out.println("R to długość rzędu w metrach = " + r);
		System.out.println("E to ilość meijsca zajmowanego przez okratowanie = " + e);
		System.out.println("S to obległość między sadzonkami w metrach = " + s);
		System.out.println("V = (R - 2E) / S");
		System.out.println(v + " = (" + r + " - " + 2*e + ") / " + s);
	}
}