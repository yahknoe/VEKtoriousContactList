import java.io.FileOutputStream; //output stream to write data to a file
import java.io.FileInputStream; //input stream to read data from a file 
import java.io.ObjectOutputStream; //to serialize objects to an output stream
import java.io.ObjectInputStream; //to read serialized objects from a input stream
import java.util.ArrayList; //to manage the ArrayList
import java.util.Comparator; // to manage sorting
import java.util.Collections; // to manage sorting
// import java.util.InputMismatchException; // to catch errors when eliciting menu choice from user
// only use this if I put the exception catch back in.
import java.util.Scanner; // to get text from user


/*
 * Class to manage and manipulate ContactList objects
 */
public class ContactList { // KZ.

	// ---------- VARIABLES ----------
	//ArrayList to store Contact objects -EM
	public ArrayList<Contact> contactArrayList = new ArrayList<Contact>();

	/*
	 * Method menuText: Menu text for contact list
	 */
	private void menuText() {	//KZ
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------   MAIN MENU:   --------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println("        (1) New contact");
		System.out.println("        (2) Print contact list");
		System.out.println("        (3) Retrieve contact(s) by last name");
		System.out.println("        (4) Retrieve contact(s) by email address");
		System.out.println("        (5) Retrieve contact(s) by zip code");
		System.out.println("        (6) Quit Contact List Program");
		System.out.println("--------------------------------------------------------");
		System.out.print("  What would you like to do? (Enter option from above): ");
	}

	/*
	 * " -- ContactList: METHOD menu: Scan for menu options choice from user and execute options"
	 */
	public void menu() {	//KZ
		System.out.println("--------------------------------------------------------");
		System.out.println("--- Welcome to the Quality Soft Contact List Program ---");
		
		menuText();

		int menuChoice = 0;
		Scanner scanner = new Scanner (System.in);
		menuChoice = scanner.nextInt();

		while (menuChoice != 6) {

			while (menuChoice < 1 || menuChoice > 6 )	{
				System.out.println ("You have entered an invalid choice. Please re-enter your menu choice");
				menuChoice = scanner.nextInt();
			}
			switch (menuChoice)	{
			case 1: 
				System.out.println ("switch menuChoice: new");	//CHANGE
				addContact();
				break;
			case 2: 
				System.out.println ("switch menuChoice: print");
				printList();
				break;
			case 3: 
				System.out.println ("switch menuChoice: last");
				retrieveLastName();
				sortContact();
				break;
			case 4: 
				System.out.println ("switch menuChoice: email");
				retrieveEmail();
				sortContact();
				break;
			case 5: 
				System.out.println ("switch menuChoice: zip");
				retrieveZip();
				sortContact();
				break;
			default: System.out.println  ("switch menuChoice: WHAT IS / DO WE NEED DEFAULT??");
			break;
			}

			menuText();
			menuChoice = scanner.nextInt();
		}

		System.out.println ("switch menuChoice: quit");
		System.out.println("Thank you for using the contact list!");
		writeFile();

	}

	/*
	 * Method to read Contact objects from saved file and add to
	 * contactArrayList() -VP, EM
	 * " -- ContactList: METHOD readFile: Read Contact objects from saved file and add to contactArrayList()"
	 * "Read data from file into ArrayList"
	 */
	public void readFile() { // KZ. VINCENT
		System.out.println(" -- ContactList: METHOD readFile: Read Contact objects from saved file \n    and add to contactArrayList()");
	}

	/*
	 * Method to save Contact objects to file from contactArrayList[] -VP
	 * " -- ContactList: METHOD writeFile: Write Contact object data from ArrayList to file"
	 */
	public void writeFile() { // KZ. VINCENT
		System.out.println(" -- ContactList: METHOD writeFile: Write Contact object data from \n    ArrayList to file");
	}

	/*
	 * Adds Contact object to contactArrayList
	 */
	public void addContact () {
		Contact d = new Contact();
		d.readContact();
		contactArrayList.add(d);
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
	 * " -- ContactList: METHOD sortContact: Sort contact list in alphabetical order."
	 * "1. Implement Comparator."
	 * "a. Create Comparator for sorting contacts by name in natural order (alphabetically)"
	 * "2. STANDARD METHOD Collections.sort sorts ArrayList in alphabetical order"
	 * "3. Return sorted list"
	 */
	private void sortContact() { // KZ, EM
		System.out.println(" -- ContactList: METHOD sortContact: Sort contact list in alphabetical order.");
		//class NameComparable implements Comparator<Contact>
	}

	/*
	 * Method to print entire ContactList in alphabetical order -EM
	 * " -- ContactList: METHOD printList: Print sorted list to console."
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
	 * " -- ContactList: METHOD retrieveLastName: Retrieve contact(s) with matching last name & print to console or return error if none match"
	 * "1. Search for matching last name"
	 * "2. Return matching contact(s) OR return error"
	 * "3. Call System.out.println(retrieveLastName()) or similar from main to print to console"
	 */
	public void retrieveLastName() { // KZ, EM
		System.out.println(" -- ContactList: METHOD retrieveLastName: Retrieve contact(s) with \n" +
						   "    matching last name & print to console or return error if none match");
	}

	/*
	 * [GOAL] Method to retrieve contact by email and print to console or return
	 * error if none match -EM
	 * " -- ContactList: METHOD retrieveEmail: Retrieve contact(s) with matching email & print to console or return error if none match"
	 * "1. Search for matching email"
	 * "2. Return matching contact(s) OR return error"
	 * "3. Call System.out.println(retrieveEmail()) or similar from main to print to console"
	 */
	public void retrieveEmail() { // KZ, EM
		System.out.println(" -- ContactList: METHOD retrieveEmail: Retrieve contact(s) with \n" +
						   "    matching email & print to console or return error if none match");
	}

	/*
	 * [GOAL] Method to retrieve contact by zip and print to console or return
	 * error if none match -EM
	 * " -- ContactList: METHOD retrieveEmail: Retrieve contact(s) with matching zip & print to console or return error if none match"
	 * "1. Search for matching zip"
	 * "2. Return matching contact(s) OR return error"
	 * "3. Call System.out.println(retrieveZip()) or similar from main to print to console"
	 */
	public void retrieveZip() { // KZ, EM
		System.out.println(" -- ContactList: METHOD retrieveZip: Retrieve contact(s) with \n" +
						   "    matching zip & print to console or return error if none match");
	}
}
