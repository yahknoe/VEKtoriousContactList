import java.io.FileOutputStream; //output stream to write data to a file
import java.io.FileInputStream; //input stream to read data from a file 
import java.io.ObjectOutputStream; //to serialize objects to an output stream
import java.io.ObjectInputStream; //to read serialized objects from a input stream
import java.util.ArrayList; //to manage the ArrayList
import java.util.Comparator; // to manage sorting
import java.util.Collections; // to manage sorting

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
		System.out.println("METHOD menu: Output Menu and scan for Menu Options");
	}

	/*
	 * Method to read Contact objects from saved file and add to
	 * contactArrayList() -VP, EM
	 * "METHOD readFile: Read Contact objects from saved file and add to contactArrayList()"
	 * "Read data from file into ArrayList"
	 */
	public void readFile() { // KZ. VINCENT
		System.out.println("METHOD readFile: Read Contact objects from saved file and add to contactArrayList()");
		// Class ArrayList has a method that finds the next empty spot for data
	}

	/*
	 * Method to save Contact objects to file from contactArrayList[] -VP
	 * "METHOD writeFile: Write Contact object data from ArrayList to file"
	 */
	public void writeFile() { // KZ. VINCENT
		System.out.println("METHOD writeFile: Write Contact object data from ArrayList to file");
	}

	/*
	 * Method to call createContact() from Contact class to create new contact
	 * -VP - KZ 
	 * "METHOD newContact: (1) Call createContact to create a single contact. (2) Add info to ArrayList."
	 * ******Tentatiive plausibility test: 
	 * (1) create a new Contact object (eg, testCC) in newContact() 
	 * (2) fill testCC w/ data
	 * (3) add testCC to contactArrayList()
	 * -EM
	 */
	public void newContact() { // KZ. Vincent
		System.out.println("METHOD newContact: (1) Call createContact to create a single contact. (2) Add info to ArrayList.");
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
		System.out.println("METHOD printList: Print sorted list to console.");
	}

	/*
	 * [GOAL] Method to retrieve contact with matching last name and print to
	 * console or return error if none match 
	 * [STEP 1] Sort list if not done 
	 * [STEP 2] Search for matching last name 
	 * [STEP 3] Return matching contact(s) OR return error 
	 * [STEP 4] Print selected contact(s) from main -EM
	 * 
	 * "METHOD retrieveLastName: Retrieve contact(s) with matching last name & print to console or return error if none match"
	 * "1. Call METHOD sortContact() to sort list in alphabetical order"
	 * "2. Search for matching last name"
	 * "3. Return matching contact(s) OR return error"
	 * "4. Call System.out.println(retrieveLastName()) or similar from main to print to console"
	 */
	public void retrieveLastName() { // KZ, EM
		System.out.println("METHOD retrieveLastName: Retrieve contact(s) with matching last name & print to console or return error if none match");
	}

	/*
	 * [GOAL] Method to retrieve contact by email and print to console or return
	 * error if none match -EM
	 * "METHOD retrieveEmail: Retrieve contact(s) with matching email & print to console or return error if none match"
	 * "1. Call METHOD sortContact() to sort list in alphabetical order"
	 * "2. Search for matching email"
	 * "3. Return matching contact(s) OR return error"
	 * "4. Call System.out.println(retrieveEmail()) or similar from main to print to console"
	 */
	public void retrieveEmail() { // KZ, EM
		System.out.println("METHOD retrieveEmail: Retrieve contact(s) with matching email & print to console or return error if none match");
	}

	/*
	 * [GOAL] Method to retrieve contact by zip and print to console or return
	 * error if none match -EM
	 * "METHOD retrieveEmail: Retrieve contact(s) with matching zip & print to console or return error if none match"
	 * "1. Call METHOD sortContact() to sort list in alphabetical order"
	 * "2. Search for matching zip"
	 * "3. Return matching contact(s) OR return error"
	 * "4. Call System.out.println(retrieveZip()) or similar from main to print to console"
	 */
	public void retrieveZip() { // KZ, EM
		System.out.println("METHOD retrieveZip: Retrieve contact(s) with matching zip & print to console or return error if none match");
	}
}
