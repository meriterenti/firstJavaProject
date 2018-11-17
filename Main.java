public class Main{
	public static void main(String[] args){
		System.out.println(Factorial.compute(5));
		Apartment apt1 = new Apartment("For sale", 3, 15000, "Apartment", 4, false);
		Apartment apt2 = new Apartment("Luxury Apartment", 5, 100000, "Apartment", 15, true);
		Home home1 = new Home("Home for Sale", 6, 120000, "Home", 500, 1);
		Home home2 = new Home("Hot pricе", 6, 120000, "Home", 7000, 5);
		apt2.createOrDeleteListing(apt2, true);
		System.out.println(apt1.priceWithoutElevator());
		System.out.println(apt2.listings[0].title);
		System.out.println(home1.getType());
		System.out.println(home2.getHomeType());
	}
}
