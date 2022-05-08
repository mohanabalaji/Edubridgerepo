package collections;

import java.util.HashMap;
import java.util.Map;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer , String> map = new HashMap<Integer , String>();
		
		map.put(1, "abc");
		map.put(2, "def");
		map.put(3, "ghi");
		
		System.out.println(map.get(2));
		

	}

}
