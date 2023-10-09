import javax.swing.JOptionPane;

public class zadanie2
{
	public static void main(String[] args)
	{
	String[] options = {"Burger", "Pizza", "Sushi", "Coca-Cola"};
	String selectedOption = (String) JOptionPane.showInputDialog(null, "Zapraszamy do restauracji", "Menu", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
	switch(selectedOption)
	{
		case "Burger":
			JOptionPane.showMessageDialog(null, "Cena - 15 zl\nKanapka z kotletem z mięsa wołowego");
			break;
		case "Pizza":
			JOptionPane.showMessageDialog(null, "Cena - 25 zl\nPłaski placek z ciasta drożdżowego (focaccia), z sosem pomidorowym, posypany tartym serem (najczęściej jest to mozzarella) i ziołami, pieczony w bardzo mocno nagrzanym piecu.");
			break;
		case "Sushi":
			JOptionPane.showConfirmDialog(null, "Cena - 30 zl\nJapoński styl gotowania, w którym używa się warzyw, ryb (gotowanych lub surowych), następnie miesza się i formuje w pożądany kształt z ryżem doprawionym octem");
			break;
		case "Coca-Cola":
			JOptionPane.showConfirmDialog(null, "Cena - 5 zl\nNapój");
			break;
	}
	}
}