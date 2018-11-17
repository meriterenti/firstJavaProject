public class RealEstate{
	String title;
	int numberOfRooms;
	int price;
	String estateType; 
	
	public RealEstate(String title, int rooms, int price, String type) {
		this.title = title;
		this.numberOfRooms = rooms;
		this.price = price;
		this.estateType = type;
	}
	
	private String showInfo() {
		return "The type must be 'Home' or 'Apartment'";
	}
	
	public String getType() {
		if(estateType == "Home" || estateType == "Apartment") {
			return estateType;
		}
		return this.showInfo();
	}
}
