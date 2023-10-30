import javax.swing.JOptionPane;
import java.util.Random;

public class zadanie1
{
	public static void main(String[] args)
	{
		int sproba, wartosc;
		int life  = 1, win = 0;
		Random rand = new Random();
		String input = JOptionPane.showInputDialog("Podaj maksymalna wartosc: ");
		wartosc = Integer.parseInt(input);
		int wartosc1 = rand.nextInt(wartosc);
		while (win < 1)
		{
			String input1 = JOptionPane.showInputDialog("Sproba: ");
			sproba = Integer.parseInt(input1);
			if (sproba == wartosc1)
			{
				win++;
				break;
			}
			else {
				if (sproba > wartosc1)
				{
					JOptionPane.showMessageDialog(null, "Liczba jest mniejsza");
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Liczba jest większa");
				}
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