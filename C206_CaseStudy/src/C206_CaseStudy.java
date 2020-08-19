import java.util.ArrayList;

public class C206_CaseStudy  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<bid> bidList = new ArrayList<bid>();
		bidList.add(new bid(0001,"Apple Watch","John34@gmail.com",null, 0.0 ));
		bidList.add(new bid(0035,"Off-brand Speaker ","Johnson314@gmail.com",null, 0.0 ));
		bidList.add(new bid(1256,"6 can cokes ","Harry13@gmail.com",null, 0.0 ));
		bidList.add(new bid(4622,"Deck of cards ","Joe3333@gmail.com",null, 0.0 ));
		int option = 0;

		while (option != 5) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// 
				

			} else if (option == 2) {
				// 
				

			} else if (option == 3) {
				System.out.println("Option 1: Add bid");
				System.out.println("Option 2: View bids");
				System.out.println("Option 3: Delete bid");
				int id = Helper.readInt("Enter an option > ");
				if (id == 1) {
					C206_CaseStudy.addbidlist(bidList);
				}
				else if (id == 2) {
					C206_CaseStudy.viewbidList(bidList);
				}
				else if (id == 3) {
					C206_CaseStudy.deletebidlist(bidList);
				}
				else {
					System.out.println("Option not recognized ");
				}
					
				

			} else if (option == 4) {
				// 
				
			} else if (option == 5) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}
		}

		}
	
		public static void menu() {
			System.out.println("Application");
			System.out.println("1. User Account");
			System.out.println("2. item");
			System.out.println("3. Bid");
			System.out.println("4. Deal");
			System.out.println("5. Quit");
			Helper.line(80, "-");

		}
		public static void viewbidList(ArrayList<bid> bidlist) {
			int i = 0;
			String output = String.format("%-10s %-30s %-10s %-10s %-20s\n", "Bid Id", "Item Name",
					"Seller Email", "Buyer Email","Bid Price");
			System.out.println(output);
			while (i != bidlist.size()){
				System.out.println(bidlist.get(i));
				i++;
			}
		}
		public static void addbidlist (ArrayList<bid> bidlist) {
			//
		}
		public static void deletebidlist (ArrayList<bid> bidlist) {
			//
		}

	




	}


