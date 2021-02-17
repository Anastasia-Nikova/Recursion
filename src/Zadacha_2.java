import java.util.Scanner;

public class Zadacha_2 
{

	public static int getDigitSum(int number)
	{
		if( number != 0 )
		{
			number = Math.abs(number);
			int digitSum = number % 10 + getDigitSum((number/10));
			return digitSum;			
		}
		return 0;
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number - ");
		int number = scanner.nextInt();
		System.out.println(getDigitSum(number));
		scanner.close();
	}

}
