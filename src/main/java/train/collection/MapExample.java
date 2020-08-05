package train.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	
	public static void main(String args[]) {
		
		Map<Integer, String> emp = new HashMap<>();
		emp.put(1, "ABC");
		emp.put(2, "DEF");
		emp.put(2, "Kumar");
		emp.put(3, "Kumar");
		emp.put(null, "Vijay");
		System.out.println(emp);
		//Entry Set
		Set<Entry<Integer, String>> entrySet = emp.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		//Key Set
		Set<Integer> keySet = emp.keySet();
		for (Integer key: keySet)  {
			System.out.println(emp.get(key));
		}
		
		System.out.println(emp.get(4));
		System.out.println(emp.containsKey(4));
		
		//Tree Map - to sort the keys in the ascending order
		//Linked Hash Map this will maintain the insertion order
		
	}

}
