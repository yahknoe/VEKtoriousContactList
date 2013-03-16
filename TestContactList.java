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
		
		System.out.println(" ** 01 - TestContactList: print demoContact");
		System.out.println("    demoContact: " + demoContact);

		// read all contacts from disk
		System.out.println(" ** 02 - TestContactList: demoContactList.readFile()");
		demoContactList.readFile(); // KZ. read file from disk

		// loop to be implemented to repeat menu until user quits
		System.out.println(" ** 03 - TestContactList: demoContactList.menu()");
		demoContactList.menu(); // KZ. call main menu, displays menu options

		// MENU OPTIONS -- For demonstration purposes only
		System.out.println(" ** 04 - TestContactList: REMOVED •• demoContact.readContact()");
		// demoContact.readContact(); // EM (REMOVED AS THIS CAUSES A NEW CONTACT AFTER MENU QUIT
		System.out.println(" ** 05 - TestContactList: demoContact.returnSingleContact()");
		System.out.println(demoContact.returnSingleContact()); // EM
		System.out.println(" ** 06 - TestContactList: demoContactList.printList()");
		demoContactList.printList(); // KZ.
		System.out.println(" ** 07 - TestContactList: demoContactList.retrieveLastName()");
		demoContactList.retrieveLastName(); // KZ.
		System.out.println(" ** 08 -TestContactList: demoContactList.retrieveEmail()");
		demoContactList.retrieveEmail(); // KZ.
		System.out.println(" ** 09 -TestContactList: demoContactList.retrieveZip()");
		demoContactList.retrieveZip(); // KZ.

		// end of loop means user quit; save to disk
		System.out.println(" ** 10 -TestContactList: demoContactList.writeFile()");
		demoContactList.writeFile(); // KZ. write changes to disk
	}
}

/*
--------------------------------------------------------
----------------   OUTPUT TO CONSOLE:   ----------------
--------------------------------------------------------

 ** 01 - TestContactList: print demoContact
    demoContact: Contact@3487a5cc
 ** 02 - TestContactList: demoContactList.readFile()
 -- ContactList: METHOD readFile: Read Contact objects from saved file 
    and add to contactArrayList()
 ** 03 - TestContactList: demoContactList.menu()
--------------------------------------------------------
--- Welcome to the Quality Soft Contact List Program ---
--------------------------------------------------------
--------------------   MAIN MENU:   --------------------
--------------------------------------------------------
        (1) New contact
        (2) Print contact list
        (3) Retrieve contact(s) by last name
        (4) Retrieve contact(s) by email address
        (5) Retrieve contact(s) by zip code
        (6) Quit Contact List Program
--------------------------------------------------------
  What would you like to do? (Enter option from above): 2
switch menuChoice: print
The Contact List is empty. Please add a new contact!
--------------------------------------------------------
--------------------   MAIN MENU:   --------------------
--------------------------------------------------------
        (1) New contact
        (2) Print contact list
        (3) Retrieve contact(s) by last name
        (4) Retrieve contact(s) by email address
        (5) Retrieve contact(s) by zip code
        (6) Quit Contact List Program
--------------------------------------------------------
  What would you like to do? (Enter option from above): 1
switch menuChoice: new
Last Name: Llo
First Name: He
Street Address: 123 Yay Dr.
City: Yippee
State: HA
Zip: 12345
Email Address: VEK@win.us
--- You did not enter a valid email address. 
--- Please enter a email address in the following format: 
         yoururl_01@somplace.xxx 
    or   your.url_02@somplace.xxx 

Email Address: VEK@win.usa
Phone Number: 1234567890
--- You did not enter a valid US phone number. 
--- Please enter a phone number in the following format: XXX-XXX-XXXX.
Phone Number: 123-456-7890
Notes: Lookin' good, feelin' fine.
--------------------------------------------------------
--------------------   MAIN MENU:   --------------------
--------------------------------------------------------
        (1) New contact
        (2) Print contact list
        (3) Retrieve contact(s) by last name
        (4) Retrieve contact(s) by email address
        (5) Retrieve contact(s) by zip code
        (6) Quit Contact List Program
--------------------------------------------------------
  What would you like to do? (Enter option from above): 1
switch menuChoice: new
Last Name: Sort
First Name: AlphabetInTheRoom
Street Address: 456 Zoo Ln
City: Tuscany
State: :)
Zip: 98765
Email Address: list@sorted.yup
Phone Number: 987-654-3210
Notes: Notable, but only just.
--------------------------------------------------------
--------------------   MAIN MENU:   --------------------
--------------------------------------------------------
        (1) New contact
        (2) Print contact list
        (3) Retrieve contact(s) by last name
        (4) Retrieve contact(s) by email address
        (5) Retrieve contact(s) by zip code
        (6) Quit Contact List Program
--------------------------------------------------------
  What would you like to do? (Enter option from above): 2
switch menuChoice: print
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Llo, He
         123 Yay Dr.
         Yippee, HA 12345
         VEK@win.usa
         123-456-7890
         Lookin' good, feelin' fine.
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Sort, AlphabetInTheRoom
         456 Zoo Ln
         Tuscany, :) 98765
         list@sorted.yup
         987-654-3210
         Notable, but only just.
--------------------------------------------------------
--------------------   MAIN MENU:   --------------------
--------------------------------------------------------
        (1) New contact
        (2) Print contact list
        (3) Retrieve contact(s) by last name
        (4) Retrieve contact(s) by email address
        (5) Retrieve contact(s) by zip code
        (6) Quit Contact List Program
--------------------------------------------------------
  What would you like to do? (Enter option from above): 1
switch menuChoice: new
Last Name: Atlas
First Name: Any
Street Address: 112 3rd Ave
City: Anytown
State: DK
Zip: 23568
Email Address: first@list.wrk
Phone Number: 111-111-1111
Notes: 'A' is for 'ahead of the rest.'
--------------------------------------------------------
--------------------   MAIN MENU:   --------------------
--------------------------------------------------------
        (1) New contact
        (2) Print contact list
        (3) Retrieve contact(s) by last name
        (4) Retrieve contact(s) by email address
        (5) Retrieve contact(s) by zip code
        (6) Quit Contact List Program
--------------------------------------------------------
  What would you like to do? (Enter option from above): 2
switch menuChoice: print
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Atlas, Any
         112 3rd Ave
         Anytown, DK 23568
         first@list.wrk
         111-111-1111
         'A' is for 'ahead of the rest.'
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Llo, He
         123 Yay Dr.
         Yippee, HA 12345
         VEK@win.usa
         123-456-7890
         Lookin' good, feelin' fine.
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Sort, AlphabetInTheRoom
         456 Zoo Ln
         Tuscany, :) 98765
         list@sorted.yup
         987-654-3210
         Notable, but only just.
--------------------------------------------------------
--------------------   MAIN MENU:   --------------------
--------------------------------------------------------
        (1) New contact
        (2) Print contact list
        (3) Retrieve contact(s) by last name
        (4) Retrieve contact(s) by email address
        (5) Retrieve contact(s) by zip code
        (6) Quit Contact List Program
--------------------------------------------------------
  What would you like to do? (Enter option from above): 3
switch menuChoice: last
 -- ContactList: METHOD retrieveLastName: Retrieve contact(s) with 
    matching last name & print to console or return error if none match
--------------------------------------------------------
--------------------   MAIN MENU:   --------------------
--------------------------------------------------------
        (1) New contact
        (2) Print contact list
        (3) Retrieve contact(s) by last name
        (4) Retrieve contact(s) by email address
        (5) Retrieve contact(s) by zip code
        (6) Quit Contact List Program
--------------------------------------------------------
  What would you like to do? (Enter option from above): 4
switch menuChoice: email
 -- ContactList: METHOD retrieveEmail: Retrieve contact(s) with 
    matching email & print to console or return error if none match
--------------------------------------------------------
--------------------   MAIN MENU:   --------------------
--------------------------------------------------------
        (1) New contact
        (2) Print contact list
        (3) Retrieve contact(s) by last name
        (4) Retrieve contact(s) by email address
        (5) Retrieve contact(s) by zip code
        (6) Quit Contact List Program
--------------------------------------------------------
  What would you like to do? (Enter option from above): 5
switch menuChoice: zip
 -- ContactList: METHOD retrieveZip: Retrieve contact(s) with 
    matching zip & print to console or return error if none match
--------------------------------------------------------
--------------------   MAIN MENU:   --------------------
--------------------------------------------------------
        (1) New contact
        (2) Print contact list
        (3) Retrieve contact(s) by last name
        (4) Retrieve contact(s) by email address
        (5) Retrieve contact(s) by zip code
        (6) Quit Contact List Program
--------------------------------------------------------
  What would you like to do? (Enter option from above): 6
switch menuChoice: quit
Thank you for using the contact list!
 -- ContactList: METHOD writeFile: Write Contact object data from 
    ArrayList to file
 ** 04 - TestContactList: REMOVED •• demoContact.readContact()
 ** 05 - TestContactList: demoContact.returnSingleContact()
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: null, null
         null
         null, null null
         null
         null
         null
 ** 06 - TestContactList: demoContactList.printList()
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Atlas, Any
         112 3rd Ave
         Anytown, DK 23568
         first@list.wrk
         111-111-1111
         'A' is for 'ahead of the rest.'
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Llo, He
         123 Yay Dr.
         Yippee, HA 12345
         VEK@win.usa
         123-456-7890
         Lookin' good, feelin' fine.
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Sort, AlphabetInTheRoom
         456 Zoo Ln
         Tuscany, :) 98765
         list@sorted.yup
         987-654-3210
         Notable, but only just.
 ** 07 - TestContactList: demoContactList.retrieveLastName()
 -- ContactList: METHOD retrieveLastName: Retrieve contact(s) with 
    matching last name & print to console or return error if none match
 ** 08 -TestContactList: demoContactList.retrieveEmail()
 -- ContactList: METHOD retrieveEmail: Retrieve contact(s) with 
    matching email & print to console or return error if none match
 ** 09 -TestContactList: demoContactList.retrieveZip()
 -- ContactList: METHOD retrieveZip: Retrieve contact(s) with 
    matching zip & print to console or return error if none match
 ** 10 -TestContactList: demoContactList.writeFile()
 -- ContactList: METHOD writeFile: Write Contact object data from 
    ArrayList to file

*/
