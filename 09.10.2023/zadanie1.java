import javax.swing.JOptionPane;

public class zadanie1
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
	switch(selectedOption)
	{
		case "+":
			odp = wartosc1 + wartosc2;
			JOptionPane.showMessageDialog(null, "Odp = " + odp);
			break;
		case "-":
			odp = wartosc1 - wartosc2;
			JOptionPane.showMessageDialog(null, "Odp = " + odp);
			break;
		case "*":
			odp = wartosc1 * wartosc2;
			JOptionPane.showMessageDialog(null, "Odp = " + odp);
			break;
		case "/":
			odp = wartosc1 / wartosc2;
			JOptionPane.showMessageDialog(null, "Odp = " + odp);
			break;
	}
	}
}