package train.oops.basics;

public class Actor {

	// name is a Member Variable
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// This is called shadowing
		// Local variable or parameter with
		// same name as a member variable
		// this.name refers to member variable
		// name refers to local variable
		this.name = name;
	}

	public static void main(String[] args) {
		// create two objects are objects or instances
		// of Class Actor
		// Each instance has separate value for the
		// member variable name

	}
}
