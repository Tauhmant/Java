import javax.swing.JOptionPane;

public class zadanie1
{
	public static void main(String[] args)
	{
		String polno = "nie polnoletnij";
		String name = JOptionPane.showInputDialog("Podaj imię: ");
		String input1 = JOptionPane.showInputDialog("Podaj wiek: ");
		int age = Integer.parseInt(input1);
		if (age >= 18)
			polno = "polnoletnij";
		JOptionPane.showMessageDialog(null, "Ty masz na imię " + name + " i jestes " + polno);
	}
}