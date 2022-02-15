package Revision1;

import java.util.Arrays;

public class Program2
{

	public static void main(String[] args)
	{
		 int f=1;  
	        int arr[] = {2, 3, 4, 6, 5 };
	        int max = Arrays.stream(arr).max().getAsInt();
	        System.out.println("Largest number is: " +max);

	        for(int i=1;i<=max;i++)
	           {    
	             f=f*i;    
	           }    
	               System.out.println("Factorial of "+max+" is: "+f);    

	}

}
