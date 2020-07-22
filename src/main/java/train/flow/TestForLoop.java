package train.flow;

import java.util.Arrays;
import java.util.List;

public class TestForLoop {

	public static void main(String args[]) { 
		Integer[] arr = {1,2,3,4,5};
		//Before Java 5 Version
		for(int i=0; i<arr.length; i++) {
			System.out.println("index:"+i);
			System.out.println("array:"+arr[i]);
		}
		//After Java 5 Version
		for(int arrayValue : arr) {
			if(arrayValue == 3) {
				System.out.println("Found");
				break;
			}
			System.out.println("Enhanced For Loop:"+arrayValue);
		}
		
		//Java 8 
		List<Integer> asList = Arrays.asList(arr);
		asList.stream().forEach(value -> {
			System.out.println(value);
		});
		
	}
}
