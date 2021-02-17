
public class Zadacha_6 
{

	public static boolean isExists(int[] arr, int number, int min, int max)
	{
		int i = (min + max)/2;
		if(arr[i] == number)
		{
			return true;
		}
		if( (max - min) <= 0)
		{
			return false;
		}
		if(arr[i] > number)
		{
			return isExists(arr, number, min, i);
		}
		return isExists(arr, number, i, max);
	}
	public static void main(String[] args) 
	{
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println(isExists(arr, 8, 0, arr.length - 1));
		System.out.println(arr.length);
	}

}
