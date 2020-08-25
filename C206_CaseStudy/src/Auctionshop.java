import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19028042, 25 Aug 2020 10:29:26 pm
 */

@SuppressWarnings("unused")
public class Auctionshop {

	private static final char[] header = null;




	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Deal> dealList = new ArrayList<Deal>();
		dealList.add(new Deal("sam", 28-9-20, 24.00,"sami"));
		dealList.add(new Deal("dani", 28-9-20,12.00,"dankin"));
		
		int option = 0;

		while (option != 5) {

			Auctionshop.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items
				Auctionshop.viewAllitems(dealList);

			} else if (option == 2) {
				// Add a new item
				Auctionshop.setHeader("ADD");			
				Auctionshop.setHeader("ITEM TYPES");
				System.out.println("1. user");
				System.out.println("2. item");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Add 
					Deal cc = inputdeal1();
					Auctionshop.adddeal(dealList, cc);

				} else {
					System.out.println("Invalid type");
				}

			
				

			} else if (option == 5) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}

	}
	
	/**
	 * @param dealList
	 */
	private static void viewAllitems(ArrayList<Deal> dealList) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param dealList
	 * @param cc
	 */
	

	public static void menu() {
		Auctionshop.setHeader("Auctionshop APP");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Quit");
		Helper.line(80, "-");

	}
	/**
	 * @param string
	 */
	private static void setHeader(String string) {
		// TODO Auto-generated method stub
			Helper.line(80, "-");
			System.out.println(header);
			Helper.line(80, "-");
		}

	/**
	 * @param dealList
	 * @param cc
	 */
	private static void adddeal(ArrayList<Deal> dealList, Deal cc) {
		// TODO Auto-generated method stub
		Deal.add(cc);
		System.out.println("item  added");
	}
		
		//================================= Option 2 Add =================================
		public static Deal inputdeal1() {
			String name = Helper.readString("Enter seller name > ");
			int date = Helper.readInt("Enter close date > ");
			int time = Helper.readInt("Enter close time > ");
			String Bname = Helper.readString("Enter buyer name > ");
		

			Deal cb= new Deal(name,date,time ,Bname );
			return cb;
			
		}	
	


	@SuppressWarnings("unused")
	private static void addDeal(ArrayList<Deal> dealList, Deal cb) {
		Deal.add(cb);
		System.out.println("deal added");
	}
		
		//================================= Option 2 Add =================================
		public static Deal inputdeal() {
			String name = Helper.readString("Enter seller name > ");
			int date = Helper.readInt("Enter close date > ");
			int time = Helper.readInt("Enter close time > ");
			String Bname = Helper.readString("Enter buyer name > ");
			

			Deal cb= new Deal(name,date,time ,Bname );
			return cb;
			
		}

			
			
		
		public static Deal inputDeal() {	
			@SuppressWarnings("unused")
			User cc =null;
			// write your code here
			String Buyername = Helper.readString("Enter Buyer name > ");
			String Sellername = Helper.readString("Enter Seller name > ");
			int time = Helper.readInt("Enter close time > ");
			int date = Helper.readInt("Enter close date > ");
			

			Deal cc1= new Deal(Buyername,Sellername,time,date);
			return cc1;
			
		}	


	
}