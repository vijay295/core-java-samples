package train.oops.inheritence.overloading;

public class OverloadingRules {
}

class Foo {
	public void doIt(int number) throws Exception {
		System.out.println("test");
	}
}

class Bar extends Foo {
	
	//Overloading
	public void doIt(String str) {
		System.out.println("test");
	}
	
	@Override
	public void doIt(int intValue) throws Exception {
		throw new Exception();
	}
}