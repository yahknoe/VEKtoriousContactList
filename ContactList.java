import java.io.FileOutputStream; //output stream to write data to a file
import java.io.FileInputStream; //input stream to read data from a file 
import java.io.ObjectOutputStream; //to serialize objects to an output stream
import java.io.ObjectInputStream; //to read serialized objects from a input stream
import java.util.ArrayList; //to manage the ArrayList
//import java.util.Comparator; // to manage sorting
import java.util.Collections; // to manage sorting
// import java.util.InputMismatchException; // to catch errors when eliciting menu choice from user
// only use this if I put the exception catch back in.
import java.util.Scanner; // to get text from user
import java.io.Serializable; //to write object to file
import java.io.IOException; //IOException for reading/writing

/*
 * Class to manage and manipulate ContactList objects
 */
public class ContactList implements Serializable { // KZ.

	// ---------- VARIABLES ----------
	// ArrayList to store Contact objects -EM
	public ArrayList<Contact> contactArrayList = new ArrayList<Contact>();

	/*
	 * Method menuText: Menu text for contact list
	 */
	private void menuText() { // KZ
		System.out
				.println("--------------------------------------------------------");
		System.out
				.println("--------------------   MAIN MENU:   --------------------");
		System.out
				.println("--------------------------------------------------------");
		System.out.println("        (1) New contact");
		System.out.println("        (2) Print contact list");
		System.out.println("        (3) Retrieve contact(s) by last name");
		System.out.println("        (4) Retrieve contact(s) by email address");
		System.out.println("        (5) Retrieve contact(s) by zip code");
		System.out.println("        (6) Quit Contact List Program");
		System.out
				.println("--------------------------------------------------------");
		System.out
				.print("  What would you like to do? (Enter option from above): ");
	}

	/*
	 * " -- ContactList: METHOD menu: Scan for menu options choice from user and execute options"
	 */
	public void menu() { // KZ
		System.out
				.println("--------------------------------------------------------");
		System.out
				.println("--- Welcome to the Quality Soft Contact List Program ---");

		menuText();

		int menuChoice = 0;
		Scanner scanner = new Scanner(System.in);
		menuChoice = scanner.nextInt();

		while (menuChoice != 6) {
			//uncessary to check if int entered is out of range... that is what default is for -VP
			//while (menuChoice < 1 || menuChoice > 6) {
			//	System.out
			//	.println("You have entered an invalid choice. Please re-enter your menu choice");
			//	menuChoice = scanner.nextInt();
			//}
			switch (menuChoice) {
			case 1:
				System.out.println("switch menuChoice: new");
				addContact();
				break;
			case 2:
				System.out.println("switch menuChoice: print");
				printList();
				break;
			case 3:
				System.out.println("switch menuChoice: last");
				retrieveLastName();
				break;
			case 4:
				System.out.println("switch menuChoice: email");
				retrieveEmail();
				break;
			case 5:
				System.out.println("switch menuChoice: zip");
				retrieveZip();
				break;
			default:
				System.out.println("You have entered an invalid choice. Please re-enter your menu choice.");
				break;
			}

			menuText();
			menuChoice = scanner.nextInt();
		}

		System.out.println("switch menuChoice: quit");
		System.out.println("Thank you for using the contact list!");
	}

	/*
	 * Method to read contactArrayList object from saved file -VP
	 */
	public ContactList readFile() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("file.sav");
        	ObjectInputStream ois = new ObjectInputStream(fis);
       		return (ContactList) ois.readObject();
	}
	/*
	 * Method to save contactArrayList object to file -VP
	 */
	public void writeFile(ContactList list) throws IOException {
		FileOutputStream fos = new FileOutputStream("file.sav");
        	ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.close();
	}

	/*
	 * Adds Contact object to contactArrayList -VP
	 */
	public void addContact() {
		Contact d = new Contact();
		d.readContact();
		contactArrayList.add(d);
	}

	// Must sortContact() exist if calling Collections.sort in printList()? -EM
	/*
	 * Method to sort entire contactArrayList in alphabetical order by last and
	 * then first name. -EM
	 */
	public void sortContact() { // EM
		Collections.sort(contactArrayList);
	}

	/*
	 * Method to print entire contactArrayList in alphabetical order by last and
	 * then first name. If contactArrayList is empty, returns a message that
	 * informs user that there are no contacts and suggests adding a new
	 * contact. -EM
	 */
	public void printList() { // EM
		Collections.sort(contactArrayList);
		int i = 0;
		if (contactArrayList.isEmpty()) {
			System.out
					.println("The Contact List is empty. Please add a new contact!");
		} else {
			for (i = 0; i < contactArrayList.size(); i++) {
				System.out.println(contactArrayList.get(i) // EM, VP
						.returnSingleContact());
			}
		}
	}

	/*
	 * Method to retrieve contact with matching last name and print to console
	 * or return error if none match. Search ArrayList for all objects with
	 * matching lastName. Print all info for matching objects to console. If no
	 * matches found, display message to console stating that no matches are in
	 * the ArrayList. -EM
	 */
	public void retrieveLastName() { // EM
		System.out.println("***In method retrieveLastName()***");
		Scanner scanLastName = new Scanner(System.in);
		String searchLastName;

		System.out.print("Last name to search for: ");
		searchLastName = scanLastName.next();

		System.out.println("Searching for last name " + searchLastName + "...");

		Collections.sort(contactArrayList); // sort the ArrayList in
											// alphabetical order by name key
		int i = 0; // index of ArrayList
		int matchCount = 0; // number of searchLastName matches found
		while (i < contactArrayList.size()) {
			Contact thisMatch = new Contact();
			thisMatch = contactArrayList.get(i);
			if (searchLastName.equals(thisMatch.getLastName())) {
				System.out.println("\n" + "Match found for " + searchLastName
						+ " at index " + i + "!");
				System.out.println(thisMatch.returnSingleContact());
				matchCount = matchCount + 1;
			}
			i++;
		}
		if (matchCount == 0) {
			System.out.println("Sorry, there are no contacts with last name "
					+ searchLastName + " in the Contact List.");
		}
	}

	/*
	 * Method to retrieve contact with matching email and print to console or
	 * return error if none match. Search ArrayList for all objects with
	 * matching email. Print all info for matching objects to console. If no
	 * matches found, display message to console stating that no matches are in
	 * the ArrayList. -EM
	 */
	public void retrieveEmail() { // EM
		System.out.println("***In method retrieveEmail()***");
		Scanner scanEmail = new Scanner(System.in);
		String searchEmail;

		System.out.print("Email to search for: ");
		searchEmail = scanEmail.next();

		System.out.println("Searching for email " + searchEmail + "...");

		Collections.sort(contactArrayList); // sort the ArrayList in
											// alphabetical order by name key
		int i = 0; // index of ArrayList
		int matchCount = 0; // number of searchEmail matches found
		while (i < contactArrayList.size()) {
			Contact thisMatch = new Contact();
			thisMatch = contactArrayList.get(i);
			if (searchEmail.equals(thisMatch.getEmail())) {
				System.out.println("\n" + "Match found for " + searchEmail
						+ " at index " + i + "!");
				System.out.println(thisMatch.returnSingleContact());
				matchCount = matchCount + 1;
			}
			i++;
		}
		if (matchCount == 0) {
			System.out.println("Sorry, there are no contacts with email "
					+ searchEmail + " in the Contact List.");
		}
	}

	/*
	 * Method to retrieve contact with matching zip code and print to console or
	 * return error if none match. Search ArrayList for all objects with
	 * matching zip. Print all info for matching objects to console. If no
	 * matches found, display message to console stating that no matches are in
	 * the ArrayList. -EM
	 */
	public void retrieveZip() { // EM
		System.out.println("***In method retrieveZip()***");
		Scanner scanZip = new Scanner(System.in);
		String searchZip;

		System.out.print("Zip code to search for: ");
		searchZip = scanZip.next();

		System.out.println("Searching for zip code " + searchZip + "...");

		Collections.sort(contactArrayList); // sort the ArrayList in
											// alphabetical order by name key
		int i = 0; // index of ArrayList
		int matchCount = 0; // number of searchZip matches found
		while (i < contactArrayList.size()) {
			Contact thisMatch = new Contact();
			thisMatch = contactArrayList.get(i);
			if (searchZip.equals(thisMatch.getZip())) {
				System.out.println("\n" + "Match found for " + searchZip
						+ " at index " + i + "!");
				System.out.println(thisMatch.returnSingleContact());
				matchCount = matchCount + 1;
			}
			i++;
		}
		if (matchCount == 0) {
			System.out.println("Sorry, there are no contacts with zip code "
					+ searchZip + " in the Contact List.");
		}
	}

}
