import javax.swing.JOptionPane;

public class zadanie6
{
	public static void main(String[] args)
	{
		double dochod;
		do 
		{
		String input = JOptionPane.showInputDialog("Podaj dochod roczny: ");
		dochod = Double.parseDouble(input);
		}
		while (dochod < 1);
		
		if (dochod < 20000)
		{
			dochod = dochod * 10 / 100;
		}
		else if(dochod <= 40000)
		{
			dochod = dochod * 25 / 100;
		}
		else if(dochod <= 60000)
		{
			dochod = dochod * 20 / 100;
		}
		else
		{
			dochod = dochod * 25 / 100;
		}
		JOptionPane.showMessageDialog(null, "Odp = " + dochod);
	}
}