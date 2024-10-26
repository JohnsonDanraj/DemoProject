package Moduleone;

public class Leapyear
{
	public static void main (String [] args)
	{
		int year = 1948;
		if((year%4==0)&&(year%400==0)||(year%100!=0))
		{
			System.out.println("The given year is Leap year");
		}
		else
		{
			System.out.println("The given year is not a leap year");
		}
		
	}
}
