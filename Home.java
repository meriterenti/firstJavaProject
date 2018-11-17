public class Home extends RealEstate{
	String title;
	int landArea;
	int countOfFloors;
	Home[] listings;
	
	public Home(int rooms, int price, String type, int landArea, int countOfFloors ) {
		super(rooms, price, type);
		this.landArea = landArea;
		this.countOfFloors = countOfFloors;
		this.listings = new Home[200];
	}
	
	public void createListing(Home listing) {
		for(int i = 0; i< this.listings.length; i++) {
			if(this.listings[i] == null) {
				this.listings[i] = listing;
				return;
			}
		}
	}
	
	public void deleteListing(Home listing) {
		for(int i = 0; i< this.listings.length; i++) {
			if(this.listings[i] == listing) {
				this.listings[i] = null;
				return;
			}
		}
	}
}
