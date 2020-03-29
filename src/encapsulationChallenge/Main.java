package encapsulationChallenge;

public class Main {

	public static void main(String[] args) {
		Printer printer = new Printer(50, true);
		System.out.println("initial page count = + "+printer.getNumberOfPages());
		int pagestoprint= printer.numberOfPagesToBePrinted(4);
		System.out.println("pages printed was "+ pagestoprint+" new total count for printer "+ printer.getNumberOfPages());

	}

}
