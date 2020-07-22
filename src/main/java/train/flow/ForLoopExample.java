package train.flow;

import java.util.ArrayList;
import java.util.List;

public class ForLoopExample {
	
	public static void main(String[] args) {
		
		// Example of a For Loop
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		// Output is 0123456789

		// For loop statement has 3 parts
		// Initialization => int i=0
		// Condition => i<10
		// Operation (Increment or Decrement usually) => i++

		// There can be multiple statements in Initialization
		// or Operation seperated by commas
		for (int i = 0, j = 0; i < 10; i++, j--) {
			
			System.out.print(j);
		}
		// Output is 0-1-2-3-4-5-6-7-8-9

		// Enhanced For Loop
		Integer[] numbers = { 1, 2, 3, 4, 5 };

		for (int number : numbers) {
			System.out.print(number);
		}
		// Output is 12345

		// Any of 3 parts in a for can be empty
		/*
		 * for (;;) { System.out.print("I will be looping for ever.."); }
		 */
		// Result : Infinite loop
		//you can loop a List with forEach + lambda expression or method reference.
		
		List<String> items = new ArrayList<String>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		List<Integer> intItems = new ArrayList<Integer>(); 
		//lambda
		//Output : A,B,C,D,E
		items.forEach(item->System.out.println(item));
		//Output : C
		items.forEach(item->{
			if("C".equals(item)){
				System.out.println(item);
			}
		});

		//method reference
		//Output : A,B,C,D,E
		items.forEach(System.out::println);

		//Stream and filter
		//Output : B
		items.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);		
		
	}
}
