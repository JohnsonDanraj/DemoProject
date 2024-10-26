package Moduleone;

import java.util.Scanner;

public class scan
{
public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2=sc.nextInt();
		System.out.println("---------------------------");
		System.out.println("Addition of input: "+(num1+num2));
		System.out.println("Subtraction of input: "+(num1-num2));
	}
}
