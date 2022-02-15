package Array;

import java.util.Arrays;

public class DeleteElement
{

	public static void main(String[] args)
	{
		int[] arr = {25, 14, 56, 15};
	    System.out.println("Array : "+Arrays.toString(arr));     
		   
		   int removeIndex = 1;

		   for(int i = removeIndex; i < arr.length -1; i++)
		   {
		        arr[i] = arr[i + 1];
		   }
		
		    System.out.println("After removing the second element: "+Arrays.toString(arr));
	}

}
