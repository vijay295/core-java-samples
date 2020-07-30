package train.oops.inheritence;

class Animal {
	protected String name;

	// cool functionality
	String bark() {
		System.out.println("bark");
		return name;
	}
}

class Dog extends Animal {
	
	public void setName(String name) {
		this.name = name;
	}
	String bark() {
		return name;		
	}
}

class Cat extends Animal {
	String bark() {
		return "Meow Meow";
	}
}

public class InheritanceExamples {
	String name;
	public static void main(String[] args) {
		Animal animal = new Dog();
		
		System.out.println(animal.bark());
	}
}
