
public class Zadacha_3 
{
	public static void parsingDigits(int number)
	{
		number = Math.abs(number);
		if(number == 0)
		{
			return;
		}
		parsingDigits(number/10);
		System.out.print((number%10) + ("|"));
	}
	
	public static void main(String[] args) 
	{
		parsingDigits(-521);
	}

}