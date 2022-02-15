package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

public class Arraylist
{

	public static void main(String[] args)
	{
		List<Integer> arrL=new ArrayList<Integer>();
		
		ArrayList<Integer> arrL1=new ArrayList<Integer>();
		
		arrL1.add(56);
		arrL1.add(13);
		arrL1.add(1998);
		
		arrL.add(123);
		arrL.add(23);
		arrL.add(123);
		
		arrL.addAll(arrL1);
		Collections.sort(arrL);
		
		Iterator iterator=arrL.iterator();
				System.out.println("iterator running");
		
		        while(iterator.hasNext())
		        {
		        	System.out.println(iterator.next());
		        }
		    
				
		
		System.out.println("for loop running");
		
		for(int i=0; i<arrL.size(); i++)
		{
			System.out.println(arrL.get(i));
		}
		for(int x: arrL)
		{
			System.out.println(x);
		}
		System.out.println(arrL);
	}

}
