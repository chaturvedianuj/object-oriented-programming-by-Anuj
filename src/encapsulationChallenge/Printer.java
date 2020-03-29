package encapsulationChallenge;

public class Printer {
	private int tonerLevel;
	private int numberOfPages;
	private boolean duplex;
	public Printer(int tonerLevel, boolean duplex) {
		if(tonerLevel>-1&&tonerLevel<=100) {
			this.tonerLevel = tonerLevel;
		}
		else {
			this.tonerLevel=-1;
		}
		this.numberOfPages = 0;
		this.duplex = duplex;
	}
	public void isDuplex(boolean duplex) {
		this.duplex = duplex;                           
	}
	public int fillToner(int tonerAmt) {
		if(tonerLevel>0&&tonerAmt<=100) {
			if(this.tonerLevel + tonerAmt > 100) {
				return -1;
			}
			this.tonerLevel+=tonerAmt;
			return this.tonerLevel;
		}
		else {
			return-1;
		}
	}

	public int numberOfPagesToBePrinted(int pages) {
		int pagestoprint = pages;
		if(this.duplex)
		{
			pagestoprint/= 2;
			System.out.println("printing in duplex mode");
		}
		this.numberOfPages+=pagestoprint;
		return pagestoprint;
	}


	public int getNumberOfPages() {
		return numberOfPages;
	}







}
