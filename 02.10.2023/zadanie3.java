import javax.swing.JOptionPane;

public class zadanie3
{
	public static void main(String[] args)
	{
		double odp;
		
		String input = JOptionPane.showInputDialog("Podaj długość rzedu w metrach: ");
		double r = Double.parseDouble(input);
		String input1 = JOptionPane.showInputDialog("Podaj ilość meijsca zajmowanego przez okratowanie: ");
		double e = Double.parseDouble(input1);
		String input2 = JOptionPane.showInputDialog("Podaj obległość między sadzonkami w metrach: ");
		double s = Double.parseDouble(input2);
		
		odp = (r - 2 * e) / 2;
		
		JOptionPane.showMessageDialog(null, "Odp = " + odp);
	}
}