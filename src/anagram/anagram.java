package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class anagram 
{

	public static void main(String[] args) 
	{
	

				Scanner s=new Scanner(System.in);
				
				System.out.print("Enter String 1 : ");
				String str1=s.nextLine();
				System.out.print("Enter String 2 : ");
				String str2=s.nextLine();
				
				char[] ch1=str1.toCharArray();
				char[] ch2=str2.toCharArray();
				
				Arrays.sort(ch1);
				Arrays.sort(ch2);
				
				System.out.println(ch1);
				System.out.println(ch2);
				
				if(Arrays.equals(ch1,ch2))
				{
					System.out.printf("Anagram");
				}
				else 
				{
				System.out.println("Not anagram");
				}

		
	}

}
