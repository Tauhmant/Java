import javax.swing.JOptionPane;


public class zadanie4
{
	public static void main(String[] args)
	{
		int sproba, wartosc;
		int life  = 0, win = 0;
		String input = JOptionPane.showInputDialog("Podaj wartosc: ");
		wartosc = Integer.parseInt(input);
		while (life < 7)
		{
			String input1 = JOptionPane.showInputDialog("Sproba: ");
			sproba = Integer.parseInt(input1);
			if (sproba == wartosc)
			{
				win++;
				break;
			}
			else {
				life++;
			}
		}
		

		if (win == 1)
		{
			JOptionPane.showMessageDialog(null,"Wygraleś, zrobiles to za = " + life + " prob");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "To byla liczba "+ wartosc);
		}
	}
}