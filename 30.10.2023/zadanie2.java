import javax.swing.JOptionPane;
import java.util.Random;

public class zadanie2
{
	public static void main(String[] args)
	{
		int sproba, wartosc;
		int life  = 1, win = 0;
		Random rand = new Random();
		int wartosc1 = rand.nextInt(1000)+1;
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
			}
			life++;
		}
		

		if (win == 1)
		{
			JOptionPane.showMessageDialog(null,"Wygraleś, zrobiles to za = " + life + " prob");
		}
	}
}