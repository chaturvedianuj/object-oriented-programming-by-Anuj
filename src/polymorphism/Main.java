package polymorphism;
class Movie{
	private String name;

	public Movie(String name) {
		this.name=name;
	}
	public String plot() {
		return "No plot here";
	}
	public String getName() {
		return name;
	}
	
	
}
class Jaws extends Movie{
	public Jaws() {
		super("Jaws");
	}
	public String plot() {
		return "A shark eats a lot of people";
	}
}

class Independenceday extends Movie{
	public Independenceday() {
		super("Independenceday");
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Aliens attempt to take over planet earth";
	}
}


class MazeRunner extends Movie{
	public MazeRunner() {
		super("MazeRunner");
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Kids try to escape a maze";
	}

}
class Starwars extends Movie{
	public Starwars() {
		super("Starwars");
	}
	@Override
	public String plot() {
		return "Imperial powers try to tske over the universe ";
	}
}

class Forgetable extends Movie{
	public Forgetable() {
		super("Forgetable");
	}
}
public class Main {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Movie movie = randomMovie();
			System.out.println("Movie # "+i+" : " + movie.getName()+"\n"+ "Plots"+ movie.plot()+"\n");

	}
	}


	public static Movie randomMovie() {
		int randomNumber = (int) (Math.random()*5)+1;
		System.out.println("Random number generated was: "+randomNumber);

		switch (randomNumber) {
		case 1:
			return new Jaws();
		case 2:
			return new Independenceday();
		case 3:
			return new MazeRunner();
		case 4:
			return new Starwars();
		case 5: 
			return new Forgetable();
		}
		return null;

	
}

}
