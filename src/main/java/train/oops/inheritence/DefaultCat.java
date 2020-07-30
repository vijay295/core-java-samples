package train.oops.inheritence;

public class DefaultCat extends train.oops.inheritence.polymorphism.Animal {
	
	 public void setName() {
		 name = "cat";
	 }
	public static void main(String args[]) {
		Animal animal = new Animal();
		System.out.println(animal.bark());
	}
	

}
