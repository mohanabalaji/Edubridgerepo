package find.smallarraynumber;

import java.util.Scanner;

public class Smallestnumber 
{

	public static void main(String[] args) 
	{
		int[] arr=new int[10];
		
		int min=arr[0];
		System.out.print("Enter array values: ");
		Scanner obj=new Scanner(System.in);
		
		for(int i=0 ; i < arr.length ; i++)
		{
			arr[i]=obj.nextInt();
			
			if(arr[i]<min) 
				min=arr[i];
			
		}
		System.out.println("Small numbers: "+min);
		
	}

}
