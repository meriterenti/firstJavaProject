public class Apartment extends RealEstate{
	boolean hasElevator;
	int floor;
	Apartment[] listings;
	
	public Apartment(String title, int rooms, int price, String type, int floor, boolean hasElevator ) {
		super(title, rooms, price, type);
		this.hasElevator = hasElevator;
		this.floor = floor;
		this.listings = new Apartment[500];
	}
	
	public void createOrDeleteListing(Apartment listing, boolean isCreate) {
		for(int i = 0; i < this.listings.length; i++) {
			if(isCreate && this.listings[i] == null) {
				this.listings[i] = listing;
				return;
			}
			if(!isCreate && this.listings[i] == listing) {
				this.listings[i] = null;
				return;
			}
		}
	}
	
	public int priceWithoutElevator() {
		if(!this.hasElevator) {
			this.price = this.price*85/100;
		}
		return this.price;
	}

}
