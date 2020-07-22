package sample;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class IntegerCompareTest {

	@Test
	public void testCompareIntegers() {
		Integer one = new Integer(9);
		Integer two = new Integer(9);
		assertFalse(one == two);
		System.out.println(Integer.valueOf(null));
		//Autoboxing
		Integer three = 9;
		Integer four = 9;
		assertTrue(three == four);
		
		
		assertTrue(one.equals(two));
		assertTrue(one.compareTo(two) == 0);
	}
	
	//@Test
	public void testCasting() {
		int cast10 = 10;
		float castFloat10 = cast10; //Implicit Casting
		System.out.println(castFloat10); //10
		
		castFloat10 = 10.10f;
		cast10 = (int) castFloat10; //Explicit Casting
		System.out.println(cast10); // 10
		
		long number = 1234567891234564564l;
		int castNum = (int) number;
		System.out.println(castNum);
	}
	
}
