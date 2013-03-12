/*
 * Create, manipulate, and access contacts in contact list
 */
public class TestContactList { // KZ.

	/*
	 * ---------- MAIN ----------
	 */
	public static void main(String[] args) { // KZ.

		// create new objects to call non-static methods from
		// ContactList & Contact classes -EM
		ContactList demoContactList; // EM
		demoContactList = new ContactList(); // EM
		Contact demoContact; // EM
		demoContact = new Contact(); // EM

		// read contacts from disk to start where we left off
		demoContactList.readFile(); // KZ. read file from disk

		// loop to be implemented to repeat menu until user quits
		demoContactList.menu(); // KZ. call main menu, displays menu options

		// MENU OPTIONS -- For demonstration purposes only
		demoContact.createContact(); // EM
		System.out.println(demoContact.printSingleContact()); // EM

		demoContactList.newContact(); // KZ.
		demoContactList.printList(); // KZ.
		demoContactList.retrieveLastName(); // KZ.
		demoContactList.retrieveEmail(); // KZ.
		demoContactList.retrieveZip(); // KZ.

		// end of loop means user quit; save to disk
		demoContactList.writeFile(); // KZ. write changes to disk
	}
}

/*
OUR OUTPUT:

METHOD readFile: Create ArrayList w/ ArrayList
METHOD menu: Output Menu and scan for Menu Options
METHOD createContact scans/reads input from user and create a single contact
      ~ Method setLastName: Set lastName
      ~ Method setFirstName: Set firstName
      ~ Method setStreet: Set street
      ~ Method setCity: Set city
      ~ Method setState: Set state
      ~ Method setZip: Set zip
      ~ Method setEmail: Set email
      ~ Method setPhone: Set phone
      ~ Method setNotes: Set notes
METHOD printSingleContact: Print out single complete contact
last, first
street
city, state zip
email
phone
notes
METHOD newContact: Call contact and create new/single contact
METHOD printList: Print sorted list to console.
METHOD retrieveLastName: Retrieve contact(s) with matching last name & print to console or return error if none match
METHOD retrieveEmail: Retrieve contact(s) with matching email & print to console or return error if none match
METHOD retrieveZip: Retrieve contact(s) with matching zip & print to console or return error if none match
METHOD writeFile: Write data from file into ArrayList

*/
