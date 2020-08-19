import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;

		while (option != 5) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items
				

			} else if (option == 2) {
				// Add a new item
				

			} else if (option == 3) {
				// Loan item
				

			} else if (option == 4) {
				// Return item
				
			} else if (option == 5) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}
	}
		public static void menu() {
			System.out.println("Application");
			System.out.println("1. Add User Account");
			System.out.println("2. Add item");
			System.out.println("3. Add bid");
			System.out.println("4. Add deal");
			System.out.println("5. Quit");
			Helper.line(80, "-");

		}

	




	}


