public class Zadacha_5 
{
	public static void getGradation(int maxGrade, int k)
	{
		if( maxGrade == k )
		{
			System.out.println(Math.pow(10, k));
			System.out.println(Math.pow(10, k));
			return;
		}
		System.out.println(Math.pow(10, k));
		getGradation(maxGrade, k+1);
		System.out.println(Math.pow(10, k));
	}				
		
	

	public static void main(String[] args) 
	{
		getGradation(5, 1);
	}

}

