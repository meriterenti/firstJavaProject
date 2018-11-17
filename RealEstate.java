public class RealEstate{
	int numberOfRooms;
	int price;
	String estateType; 
	
	public RealEstate(int rooms, int price, String type) {
		this.numberOfRooms = rooms;
		this.price = price;
		this.estateType = type;
	}
	
	private String showInfo() {
		return "The type must be 'Home' or 'Appartement'";
	}
	
	public String getType() {
		if(estateType == "Home" || estateType == "Appartement") {
			return estateType;
		}
		return this.showInfo();
	}
	
}
