
public class Zadacha_4 
{
	public static void parsingDigits(int number)
	{
		if(number != 0)
		{
			number = Math.abs(number);
			System.out.print((number % 10) + ("|"));
			number = number/10;
			parsingDigits(number);
		}
	}
	
	public static void main(String[] args) 
	{
		parsingDigits(-521);
	}

}
