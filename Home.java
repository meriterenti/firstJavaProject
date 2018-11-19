public class Home extends RealEstate{
	int landArea;
	int countOfFloors;
	Home[] listings;
	String isMansion;
	
	public Home(String title, int rooms, int price, String type, int landArea, int countOfFloors ) {
		super(title, rooms, price, type);
		this.landArea = landArea;
		this.countOfFloors = countOfFloors;
		this.listings = new Home[200];
	}
	
	public void createOrDeleteListing(Home listing, boolean isCreate) {
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
	
	public String getHomeType() {
		if(this.landArea > 5000) {
			return "This home is a mansion";
		}
		return "It's a small home";
	}
}
