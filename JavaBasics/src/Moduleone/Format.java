package Moduleone;

import java.util.Scanner;

public class Format {

    public static void main(String[] args) 
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                String langFormatted = String.format("%-15s", s1);
                String scoreFormatted = String.format("%03d", x);
                System.out.println(langFormatted+scoreFormatted);    
            }
            System.out.println("================================");

    }
}
