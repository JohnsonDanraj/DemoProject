package Moduleone;

public class ReverseString
{
	public static void main(String [] args)
	{
	String name="Hello world";
	//System.out.println(name.split("World"));
	char [] ch = name.toCharArray(); //{h,e,l,l,o}{w,o,r,l,d}
	for(int i=name.length()-1;i>=0;i--)
	{
		System.out.println(ch[i]);
	}
	StringBuilder hw = new StringBuilder(name);
	String rhw = hw.reverse().toString();
	System.out.println(rhw);
	String reverse="";
	for(int i=name.length()-1;i>=0;i--)
	{
		reverse += name.charAt(i);
		System.out.println(reverse);
	} 
	
	}
}
