package train.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
	
	public static void main(String args[]) {
		//ArrayList
		List<String> list = new ArrayList<>();
		list.add("Vijay");
		list.add("Kumar");
		System.out.println("By Index");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		//Iterating through
		System.out.println("Enhanced For Loop");
		for (String str : list) {
			System.out.println(str);
		}
		//Before Enhanced For Loop
		System.out.println("By Iterator");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//Java 8
		System.out.println("By Iterator");
		list.add(0, "Kotu");
		list.forEach( str -> {	System.out.println(str);});

		List<String> list2 = new ArrayList<>();
		list2.add("Java");
		list2.add("Training");
		list.addAll(list2);
		System.out.println("After Appending");
		list.forEach( str -> {	System.out.println(str);});
		
		if(list.contains("Java121")) {
			System.out.println("Found");
		}
		
		list.containsAll(list2);
		System.out.println("After Remove");

		list.remove("Java");
		list.forEach( str -> {	System.out.println(str);});

	}

}
