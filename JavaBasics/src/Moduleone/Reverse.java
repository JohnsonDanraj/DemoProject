package Moduleone;

public class Reverse
{
	public static void main (String [] args)
	{
		int number=1234;
		System.out.println("Number :"+number);
		int rev=0;
		while(number!=0)
		{
			int num=number%10;
			rev=rev*10+num;
			number=number/10;
		}
		System.out.println("Reverse Number: "+rev);
	}
}
