package inheritance;

public class Animal {
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
	
	
	public Animal(String name, int brain, int body, int size, int weight) {
		
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}
	public void eat() {
		System.out.println("Animal.eat() is called;");
	}

	public void move(int speed) {
		System.out.println("Animal.move() is called Animal is moving with "+ speed);
		
	}

	private String getName() {
		return name;
	}



	private int getBrain() {
		return brain;
	}



	private int getBody() {
		return body;
	}



	private int getSize() {
		return size;
	}



	private int getWeight() {
		return weight;
	}
	
	
	
}
