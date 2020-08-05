package train.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String args[]) {
		
		Set<String> set = new HashSet();
		
		set.add("one");
		set.add("two");
		set.add("one");
		System.out.println(set);
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		set.remove("one");
		System.out.println(set);
		
		Set<String> treeSet = new TreeSet();
		treeSet.add("three");
		treeSet.add("two");
		treeSet.add("abc");
		System.out.println(treeSet);

		
	}

}
