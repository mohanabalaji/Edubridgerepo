package collections;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Setinterface 
{

	public static void main(String[] args)
	{
		Set<Double> set = new HashSet<Double>();
		set.add(9.5);
		set.add(2.4);
		set.add(1.6);
		set.add(6.9);
		set.add(7.2);
		
		Iterator itr= set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(double d : set)
		{
			System.out.println(d);
		}
	
	}

}
