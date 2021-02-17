
public class Zadacha_7 
{
	public static int getNod(int a, int b)
	{
		if(a%b == 0)
		{
			return b;
		}
		int smth = a%b;
		a = b;
		b = smth;
		return getNod(a, b);
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(getNod(122,60));
	}

}
