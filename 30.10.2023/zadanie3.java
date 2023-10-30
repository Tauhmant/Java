import javax.swing.JOptionPane;
import java.util.Random;

public class zadanie3
{
	public static void main(String[] args)
	{
		int sproba, wartosc;
		int p1 = 0, p2 = 0;
		Random rand = new Random();
		int wartosc1 = rand.nextInt(6)+1;
		String input1 = JOptionPane.showInputDialog("Ilosc sprob: ");
		sproba = Integer.parseInt(input1);
		for (int i = 1; i < sproba +1; i++)
		{
			wartosc1 = rand.nextInt(6)+1;
			p1 += wartosc1;
			if (wartosc1 == 1 || wartosc1 == 6) {
				JOptionPane.showMessageDialog(null, "Wypadlo " + wartosc1 + "\nMasz dodatkowy rzut");
				wartosc1 = rand.nextInt(6)+1;
				p1 += wartosc1;
				JOptionPane.showMessageDialog(null, "Wypadlo " + wartosc1);
			}
			wartosc1 = rand.nextInt(6)+1;
			p2 += wartosc1;
			if (wartosc1 == 1 || wartosc1 == 6) {
				JOptionPane.showMessageDialog(null, "Wypadlo " + wartosc1 + "\nPC ma dodatkowy rzut");
				wartosc1 = rand.nextInt(6)+1;
				p2 += wartosc1;
				JOptionPane.showMessageDialog(null, "Wypadlo " + wartosc1);
			}
			JOptionPane.showMessageDialog(null, "Ty masz " + p1 + "\nPC ma " + p2 + "\nKoniec " + i + " rzutu");
		}
		
		if (p1 > p2)
			{
				JOptionPane.showMessageDialog(null, "Wygrales\nTy masz " + p1);
			}
		else 
			{
				JOptionPane.showMessageDialog(null, "Przegrales\nTy miales "+ p1 + "\nPC mial " + p2);
			}
	}
}