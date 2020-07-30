package train.oops.basics;

class Movie {
	public void release() {
		
	}
}

class Actor extends Movie {
	
	private String name;
	
	private String action;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	protected void setAction(String action) {
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
	public void setAction(String action) {
		//this.getAction();
		super.setAction(action);
		System.out.println("***********Inside Comedian");
	}

	@Override
	public String getAction() {
		return super.getAction();
	}

	
	
	
}

public class Hero extends Actor {
	
	@Override
	public String toString() {
		return "Hero [name=" + getName() + ", action=" + getAction() + "]";
	}

	public static void main(String[] args) {
		
		Actor hero = new Hero();
		hero.setName("power star");
		hero.setAction("Fight");
		hero.release();
		System.out.println(hero);//power star
		
		Actor comedian = new Comedian();
		comedian.setName("asdfafasdfasdf");// its printing the sysout..
		comedian.setAction("asdfasdfasdfasd");
		System.out.println(comedian); // Comedian
	}
}
