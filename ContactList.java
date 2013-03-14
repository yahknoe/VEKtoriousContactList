import java.io.FileOutputStream; //output stream to write data to a file
import java.io.FileInputStream; //input stream to read data from a file 
import java.io.ObjectOutputStream; //to serialize objects to an output stream
import java.io.ObjectInputStream; //to read serialized objects from a input stream
import java.util.ArrayList; //to manage the ArrayList
import java.util.Comparator; // to manage sorting
import java.util.Collections; // to manage sorting
import java.util.InputMismatchException; // to catch errors when eliciting menu choicw from user
import java.util.Scanner; // to get text from user


/*
 * Class to manage and manipulate ContactList objects
 */
public class ContactList { // KZ.

	// ---------- VARIABLES ----------
	//ArrayList to store Contact objects -EM
	public ArrayList<Contact> contactArrayList = new ArrayList<Contact>();

	/*
	 * Method displays menu and scans for menu choices
	 * "METHOD menu: Output Menu and scan for Menu Options"
	 * "Contains switch statement to call various menu options"
	 */
	public void menu() {
		System.out.println("Welcome to the Quality Soft Contact List Program.");
		System.out.println("------------------------------------------------");
		System.out.println("----------------   MAIN MENU:   ----------------");
		System.out.println("------------------------------------------------");
		System.out.println("(1) New contact");
		System.out.println("(2) Print contact list");
		System.out.println("(3) Retrieve contact(s) by last name");
		System.out.println("(4) Retrieve contact(s) by email address");
		System.out.println("(5) Retrieve contact(s) by zip code");
		System.out.println("(6) Quit Contact List Program");
		System.out.println("What would you like to do? (Enter option from above):");

		int menuChoice = 0;
		Scanner scanner = new Scanner (System.in);
		// menuChoice = scanner.nextInt();

		try	{
			System.out.println("inside try");
			menuChoice = scanner.nextInt();
			do	{
				System.out.println ("You have entered an invalid choice. Please re-enter your menu choice");
				menuChoice = scanner.nextInt();
			} while (menuChoice < 1 && menuChoice > 6 );
			
			switch (menuChoice)	{
			case 1: System.out.println ("Choice new");
			break;
			case 2: System.out.println ("Choice print");
			break;
			case 3: System.out.println ("Choice last");
			break;
			case 4: System.out.println ("Choice email");
			break;
			case 5: System.out.println ("Choice zip");
			break;
			case 6: System.out.println ("Choice quit");
			break;
			default: System.out.println  ("Choice WHAT IS / DO WE NEED DEFAULT??");
			break;
			}

		} catch (InputMismatchException e)	{
			System.out.println("inside catch");
			System.out.println ("You have entered an invalid choice. Please re-enter your menu choice using digits only.");
			menuChoice = scanner.nextInt();
		}

	}
	/*
	 * Method to read Contact objects from saved file and add to
	 * contactArrayList() -VP, EM
	 * "METHOD readFile: Read Contact objects from saved file and add to contactArrayList()"
	 * "Read data from file into ArrayList"
	 */
	public void readFile() { // KZ. VINCENT
		System.out.println("METHOD readFile: Read Contact objects from saved file and add to contactArrayList()");
	}

	/*
	 * Method to save Contact objects to file from contactArrayList[] -VP
	 * "METHOD writeFile: Write Contact object data from ArrayList to file"
	 */
	public void writeFile() { // KZ. VINCENT
		System.out.println("METHOD writeFile: Write Contact object data from ArrayList to file");
	}

	/*
	 * Adds Contact object to contactArrayList
	 */
	public void add(Contact c) {
		contactArrayList.add(c);
	}

	/*
	 * [GOAL] Method to sort entire ContactList in alphabetical order 
	 * To accomplish: Use a Comparator (Reference: Wu, 4th ed., p. 652) &
	 * Collections.sort for ArrayList 
	 * [STEP 1] Implement Comparator interface by implementing compare method: 
	 * a. inner class NameComparator() implements Comparator
	 * [STEP 2] Call Collections.sort in sortContact() 
	 * [STEP 3] Return sorted list -EM
	 * 
	 * "METHOD sortContact: Sort contact list in alphabetical order."
	 * "1. Implement Comparator."
	 * "a. Create Comparator for sorting contacts by name in natural order (alphabetically)"
	 * "2. STANDARD METHOD Collections.sort sorts ArrayList in alphabetical order"
	 * "3. Return sorted list"
	 */
	private void sortContact() { // KZ, EM
		System.out.println("METHOD sortContact: Sort contact list in alphabetical order.");
		//class NameComparable implements Comparator<Contact>
	}

	/*
	 * Method to print entire ContactList in alphabetical order -EM
	 * "METHOD printList: Print sorted list to console."
	 * "1. Call METHOD sortContact() to sort list" "2. Print list to console"
	 */
	public void printList() { // KZ, EM
		for (int i=0; i <contactArrayList.size(); i++) {
        		System.out.println(contactArrayList.get(i).printSingleContact());
        	}
	}

	/*
	 * [GOAL] Method to retrieve contact with matching last name and print to
	 * console or return error if none match 
	 * [STEP 1] Search for matching last name 
	 * [STEP 2] Return matching contact(s) OR return error 
	 * [STEP 3] Print selected contact(s) from main -EM
	 * 
	 * "METHOD retrieveLastName: Retrieve contact(s) with matching last name & print to console or return error if none match"
	 * "1. Search for matching last name"
	 * "2. Return matching contact(s) OR return error"
	 * "3. Call System.out.println(retrieveLastName()) or similar from main to print to console"
	 */
	public void retrieveLastName() { // KZ, EM
		System.out.println("METHOD retrieveLastName: Retrieve contact(s) with matching last name & print to console or return error if none match");
	}

	/*
	 * [GOAL] Method to retrieve contact by email and print to console or return
	 * error if none match -EM
	 * "METHOD retrieveEmail: Retrieve contact(s) with matching email & print to console or return error if none match"
	 * "1. Search for matching email"
	 * "2. Return matching contact(s) OR return error"
	 * "3. Call System.out.println(retrieveEmail()) or similar from main to print to console"
	 */
	public void retrieveEmail() { // KZ, EM
		System.out.println("METHOD retrieveEmail: Retrieve contact(s) with matching email & print to console or return error if none match");
	}

	/*
	 * [GOAL] Method to retrieve contact by zip and print to console or return
	 * error if none match -EM
	 * "METHOD retrieveEmail: Retrieve contact(s) with matching zip & print to console or return error if none match"
	 * "1. Search for matching zip"
	 * "2. Return matching contact(s) OR return error"
	 * "3. Call System.out.println(retrieveZip()) or similar from main to print to console"
	 */
	public void retrieveZip() { // KZ, EM
		System.out.println("METHOD retrieveZip: Retrieve contact(s) with matching zip & print to console or return error if none match");
	}
}
