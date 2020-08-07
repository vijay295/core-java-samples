package exception.handling;

class Color {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


	
}

public class InitializationExample {
	
	public static void main(String[] args) {
		Color color = new Color();
		
		color.setName("blue");
		
	}
}
