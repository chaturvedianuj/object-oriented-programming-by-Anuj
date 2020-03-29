package composition;

public class Motherboard {
	private String model;
	private String manufacturerString;
	private int  ramSlots;
	private  int cardSlots;
	private String bios;
	public Motherboard(String model, String manufacturerString, int ramSlots, int cardSlots, String bios) {
		super();
		this.model = model;
		this.manufacturerString = manufacturerString;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	public void loadProgram(String programName) {
		System.out.println("Program "+ programName + "is now loading......");
	}
	
	
	
	public String getModel() {
		return model;
	}
	public String getManufacturerString() {
		return manufacturerString;
	}
	public int getRamSlots() {
		return ramSlots;
	}
	public int getCardSlots() {
		return cardSlots;
	}
	public String getBios() {
		return bios;
	}
	
	
}
