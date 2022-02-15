package collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface
{

	public static void main(String[] args)
	{
		Map<Integer, String> map= new HashMap<Integer, String>();
		
		map.put(5,"Hydra" );
		map.put(2, "Vignesh");
		map.put(1, "Balaji");
		map.put(3,"Aadya" );
		
		System.out.println(map.get(2));
		System.out.println("IMplementation of entry class: ");
		
		for(Map.Entry<Integer, String> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" :: "+entry.getValue());
		}

		
	}

}
