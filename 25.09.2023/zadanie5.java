public class zadanie5
{
	public static void main(String[] args)
	{
		int dlname, dlsurname, dlplace, total, totalT;
		String place = "Kharków", name = "Ivan", surname = "Larin";	
		dlname = name.length();
		dlsurname = surname.length();
		dlplace = place.length();
		total = dlname + dlsurname + dlplace;
		totalT = dlname * dlsurname * dlplace;
		System.out.println("Zmienna imię = " + name + "." + " Ilość znaków " + dlname + ".");
		System.out.println("Zmienna nazwisko = " + surname + "." + " Ilość znaków " + dlsurname + ".");
		System.out.println("Zmienna miasto = " + place + "." + " Ilość znaków " + dlplace + ".");
		System.out.println("Wynik dodawania = " + total + ".");
		System.out.println("Wynik mnożenia = " + totalT + ".");
	}
}