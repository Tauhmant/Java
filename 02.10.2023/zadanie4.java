import javax.swing.JOptionPane;

public class zadanie4
{
	public static void main(String[] args)
	{
	double odp;
	String[] options = {"+", "-", "*", "/"};
	
	String input1 = JOptionPane.showInputDialog("Podaj wartość: ");
	double wartosc1 = Double.parseDouble(input1);
	String selectedOption = (String) JOptionPane.showInputDialog(null, "Wyberz operacje: ", "wybór operacji", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
	String input2 = JOptionPane.showInputDialog("Podaj wartość: ");
	double wartosc2 = Double.parseDouble(input2);
	if (selectedOption == options[0]) {
		odp = wartosc1 + wartosc2;
		JOptionPane.showMessageDialog(null, "Odp = " + odp);
	}
	else if (selectedOption == options[1]) {
		odp = wartosc1 - wartosc2;
		JOptionPane.showMessageDialog(null, "Odp = " + odp);
	}
	else if (selectedOption == options[2]) {
		odp = wartosc1 * wartosc2;
		JOptionPane.showMessageDialog(null, "Odp = " + odp);
	}
	else if (selectedOption == options[3]) {
		odp = wartosc1 / wartosc2;
		JOptionPane.showMessageDialog(null, "Odp = " + odp);
	}
	}
}