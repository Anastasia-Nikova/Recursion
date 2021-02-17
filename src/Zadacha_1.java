import java.util.Scanner;

public class Zadacha_1 
{

	public static int getSum(int lastNumber)
	{
		if( lastNumber == 0)
		{
			return 0;
		}
		int count = lastNumber;
		count = lastNumber + getSum(--lastNumber);
		return count;
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number - ");
		int lastNumber = scanner.nextInt();
		System.out.print(getSum(lastNumber));
		scanner.close();
	}

}
