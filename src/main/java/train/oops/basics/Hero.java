package train.oops.basics;

class Actor {
	
	private String name;
	
	private String action;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
		

	public String getAction() {
		return action;
	}

	@Override
	public String toString() {
		return "Actor [name=" + name + ", action=" + action + "]";
	}
	
}

class Comedian extends Actor {

	@Override
	public String toString() {
		return "Comedian [name=" + getName() + ", action=" + getAction() + "]";
	}
	
	
	
}

public class Hero extends Actor{
	
	@Override
	public String toString() {
		return "Hero [name=" + getName() + ", action=" + getAction() + "]";
	}

	public static void main(String[] args) {
		
		Actor hero = new Hero();
		hero.setName("power star");
		hero.setAction("Fight");
		System.out.println(hero);//power star
		
		Actor comedian = new Comedian();
		comedian.setName("Comedian");
		comedian.setAction("Laugh");
		System.out.println(comedian); // Comedian
	}
}
