package classesAndObjects;

public class Main {

	public static void main(String[] args) {
		Car porche = new Car();
		Car ford = new Car();
		
		porche.setModel("911");
		System.out.println("Model is "+ porche.getModel());
		ford.setModel("figo");
	}

}
