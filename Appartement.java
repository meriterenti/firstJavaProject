public class Appartement extends RealEstate{
	String title;
	boolean hasElevator;
	int floor;
	Appartement[] listings;
	
	public Appartement(int rooms, int price, String type, int floor, boolean hasElevator ) {
		super(rooms, price, type);
		this.hasElevator = hasElevator;
		this.floor = floor;
		this.listings = new Appartement[500];
	}
	
	public void createListing(Appartement listing) {
		for(int i = 0; i< this.listings.length; i++) {
			if(this.listings[i] == null) {
				this.listings[i] = listing;
				return;
			}
		}
	}
	
	public void deleteListing(Appartement listing) {
		for(int i = 0; i< this.listings.length; i++) {
			if(this.listings[i] == listing) {
				this.listings[i] = null;
				return;
			}
		}
	}
}
