import javax.swing.JOptionPane;

public class zadanie_dodatkowe
{
	public static void main(String[] args)
	{
	int odp = 0;
	String[] option1 = {"9,86", "6,28", "9.42", "9,00"};
	String[] option2 = {"10", "12", "15", "18"};
	String[] option3 = {"0", "0,5", "1", "2"};
	String[] option4 = {"48 cm2", "32 cm2", "40 cm2", "24 cm2"};
	String[] option5 = {"2", "4", "5", "7"};
	
	String name = JOptionPane.showInputDialog("Podaj imię: ");
	
	String selectedOption1 = (String) JOptionPane.showInputDialog(null, "Jaka jest wartość Pi podniesiona do kwadratu? ", "wybór opcji", JOptionPane.QUESTION_MESSAGE, null, option1, option1[0]);
	String selectedOption2 = (String) JOptionPane.showInputDialog(null, "Jakie jest pierwiastek kwadratowy  liczby 144? ", "wybór opcji", JOptionPane.QUESTION_MESSAGE, null, option2, option2[0]);
	String selectedOption3 = (String) JOptionPane.showInputDialog(null, "Ile wynosi cos 60 stopni? ", "wybór opcji", JOptionPane.QUESTION_MESSAGE, null, option3, option3[0]);
	String selectedOption4 = (String) JOptionPane.showInputDialog(null, "Poke trojkata o podstawie 8 cm i wysokosci 6 cm? ", "wybór opcji", JOptionPane.QUESTION_MESSAGE, null, option4, option4[0]);
	String selectedOption5 = (String) JOptionPane.showInputDialog(null, "Ile wynosi pierwiastek kwadratowy z 25? ", "wybór opcji", JOptionPane.QUESTION_MESSAGE, null, option5, option5[0]);
	if (selectedOption1 == option1[0]) {
		odp = odp + 20;
	}
	if (selectedOption2 == option2[1]) {
		odp = odp + 20;
	}
	if (selectedOption3 == option3[1]) {
		odp = odp + 20;
	}
	if (selectedOption4 == option4[3]) {
		odp = odp + 20;
	}
	if (selectedOption5 == option5[2]) {
		odp = odp + 20;
	}
	JOptionPane.showMessageDialog(null, name + ", masz " + odp + " poprawnych odpowidziej");
	}
}
