package sample;

import org.junit.Ignore;
import org.junit.Test;

public class StringExampleTest {
	
	@Test
	@Ignore
	public void testStringImmutability() {
		String str = "value1";
		str = str.concat("value2");
		System.out.println(str);
		
		String str1 = "abcdefghijk";
		char[] charArray = str1.toCharArray();
		for (char c : charArray) {
			System.out.println(c);
		}
		System.out.println(str1.charAt(3));
		String concat = "";
		StringBuffer buffer = new StringBuffer(concat);
		for(int i=0;i<100000;i++) {
			buffer.append(i);
		}
		concat = buffer.toString();
		System.out.println(concat);
		
		
	}
	
	@Test
	public void testStringBuffer() {
		StringBuffer buffer = new StringBuffer("");
		for(int i=0;i<100000;i++) {
			buffer.append(i);
		}
		System.out.println(buffer);
		
	}

}
