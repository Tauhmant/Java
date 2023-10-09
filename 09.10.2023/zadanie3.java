import java.util.Scanner;

public class zadanie3
{
	public static void main(String[] args)
	{
		String name = "Ivan";
		String sproba;
		int life  = 5, win = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Gra 'Zgadnij kto'");
		while (life > 0)
		{
			System.out.println("Sproba: ");
			sproba = input.nextLine();
			if (name.equals(sproba))
			{
				win++;
				break;
			}
			else {
				life--;
			}
		}
		

		if (win == 1)
		{
			System.out.println("Wygraleś");
		}
		else
		{
			System.out.println("To było imię "+ name);
		}
	}
}