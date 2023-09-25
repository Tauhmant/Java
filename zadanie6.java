public class zadanie6
{
	public static void main(String[] args)
	{
		int dlcity;
		char oneChar;
		String city = "Kharków", upperCity, lowerCity;	
		dlcity = city.length();
		oneChar = city.charAt(0);
		upperCity = city.toUpperCase();
		lowerCity = city.toLowerCase();
		System.out.println(city + " " + dlcity + " " + oneChar + " " + upperCity + " " + lowerCity);
	}
}