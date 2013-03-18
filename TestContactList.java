import java.io.IOException; //IOException for reading/writing
/*
 * Create, manipulate, and access contacts in contact list
 */
public class TestContactList { // KZ.

	/*
	 * ---------- MAIN ----------
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException { // KZ.

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
		demoContactList = demoContactList.readFile(); // KZ. read file from disk

		// loop to be implemented to repeat menu until user quits
		System.out.println(" ** 03 - TestContactList: demoContactList.menu()");
		demoContactList.menu(); // KZ. call main menu, displays menu options

		// MENU OPTIONS -- For demonstration purposes only
		System.out.println(" ** 04 - TestContactList: REMOVED ‚Ä¢‚Ä¢¬†demoContact.readContact()");
		// demoContact.readContact(); // EM (REMOVED AS THIS CAUSES A NEW CONTACT AFTER MENU QUIT)
		System.out.println(" ** 05 - TestContactList: demoContact.returnSingleContact()");
		System.out.println(demoContact.returnSingleContact()); // EM
		System.out.println(" ** 06 - TestContactList: demoContactList.printList()");
		demoContactList.printList(); // KZ.
		System.out.println(" ** 07 - TestContactList: demoContactList.retrieveLastName()");
		// demoContactList.retrieveLastName(); // KZ. (REMOVED AS THIS CAUSES A NEW CONTACT AFTER MENU QUIT)
		System.out.println(" ** 08 -TestContactList: demoContactList.retrieveEmail()");
		// demoContactList.retrieveEmail(); // KZ. (REMOVED AS THIS CAUSES A NEW CONTACT AFTER MENU QUIT)
		System.out.println(" ** 09 -TestContactList: demoContactList.retrieveZip()");
		// demoContactList.retrieveZip(); // KZ. (REMOVED AS THIS CAUSES A NEW CONTACT AFTER MENU QUIT)

		// end of loop means user quit; save to disk
		System.out.println(" ** 10 -TestContactList: demoContactList.writeFile()");
		demoContactList.writeFile(demoContactList); // KZ. write changes to disk
	}
}

/*
--------------------------------------------------------
----------------   OUTPUT TO CONSOLE:   ----------------
--------------------------------------------------------
 ** 01 - TestContactList: print demoContact
    demoContact: Contact@f7e6a96
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
Phone Number: yay
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
Street Address: 456 Zoo Ln.
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
  What would you like to do? (Enter option from above): 1
switch menuChoice: new
Last Name: Sort
First Name: Yourself
Street Address: 654 Aquarium Ave.
City: Tuscany
State: :)
Zip: 98765
Email Address: list@sorted.yup
Phone Number: 246-801-3579
Notes: Parents decided not to name "AlphabetInTheRoom Jr."
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
         456 Zoo Ln.
         Tuscany, :) 98765
         list@sorted.yup
         987-654-3210
         Notable, but only just.
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Sort, Yourself
         654 Aquarium Ave.
         Tuscany, :) 98765
         list@sorted.yup
         246-801-3579
         Parents decided not to name "AlphabetInTheRoom Jr."
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
***In method retrieveLastName()***
Last name to search for: Llo
Searching for last name Llo...

Match found for Llo at index 0!
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Llo, He
         123 Yay Dr.
         Yippee, HA 12345
         VEK@win.usa
         123-456-7890
         Lookin' good, feelin' fine.
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
***In method retrieveLastName()***
Last name to search for: Sort
Searching for last name Sort...

Match found for Sort at index 1!
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Sort, AlphabetInTheRoom
         456 Zoo Ln.
         Tuscany, :) 98765
         list@sorted.yup
         987-654-3210
         Notable, but only just.

Match found for Sort at index 2!
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Sort, Yourself
         654 Aquarium Ave.
         Tuscany, :) 98765
         list@sorted.yup
         246-801-3579
         Parents decided not to name "AlphabetInTheRoom Jr."
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
***In method retrieveLastName()***
Last name to search for: NotHere
Searching for last name NotHere...
Sorry, there are no contacts with last name NotHere in the Contact List.
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
***In method retrieveEmail()***
Email to search for: VEK@win.usa
Searching for email VEK@win.usa...

Match found for VEK@win.usa at index 0!
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Llo, He
         123 Yay Dr.
         Yippee, HA 12345
         VEK@win.usa
         123-456-7890
         Lookin' good, feelin' fine.
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
***In method retrieveEmail()***
Email to search for: list@sorted.yup
Searching for email list@sorted.yup...

Match found for list@sorted.yup at index 1!
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Sort, AlphabetInTheRoom
         456 Zoo Ln.
         Tuscany, :) 98765
         list@sorted.yup
         987-654-3210
         Notable, but only just.

Match found for list@sorted.yup at index 2!
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Sort, Yourself
         654 Aquarium Ave.
         Tuscany, :) 98765
         list@sorted.yup
         246-801-3579
         Parents decided not to name "AlphabetInTheRoom Jr."
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
***In method retrieveEmail()***
Email to search for: nothere@here.not
Searching for email nothere@here.not...
Sorry, there are no contacts with email nothere@here.not in the Contact List.
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
***In method retrieveZip()***
Zip code to search for: 12345
Searching for zip code 12345...

Match found for 12345 at index 0!
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Llo, He
         123 Yay Dr.
         Yippee, HA 12345
         VEK@win.usa
         123-456-7890
         Lookin' good, feelin' fine.
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
  What would you like to do? (Enter option from above): 98765
You have entered an invalid choice. Please re-enter your menu choice
5
switch menuChoice: zip
***In method retrieveZip()***
Zip code to search for: 98765
Searching for zip code 98765...

Match found for 98765 at index 1!
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Sort, AlphabetInTheRoom
         456 Zoo Ln.
         Tuscany, :) 98765
         list@sorted.yup
         987-654-3210
         Notable, but only just.

Match found for 98765 at index 2!
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Sort, Yourself
         654 Aquarium Ave.
         Tuscany, :) 98765
         list@sorted.yup
         246-801-3579
         Parents decided not to name "AlphabetInTheRoom Jr."
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
***In method retrieveZip()***
Zip code to search for: 99999
Searching for zip code 99999...
Sorry, there are no contacts with zip code 99999 in the Contact List.
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
 ** 04 - TestContactList: REMOVED ‚Ä¢‚Ä¢¬†demoContact.readContact()
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
Contact: Llo, He
         123 Yay Dr.
         Yippee, HA 12345
         VEK@win.usa
         123-456-7890
         Lookin' good, feelin' fine.
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Sort, AlphabetInTheRoom
         456 Zoo Ln.
         Tuscany, :) 98765
         list@sorted.yup
         987-654-3210
         Notable, but only just.
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Sort, Yourself
         654 Aquarium Ave.
         Tuscany, :) 98765
         list@sorted.yup
         246-801-3579
         Parents decided not to name "AlphabetInTheRoom Jr."
 ** 07 - TestContactList: demoContactList.retrieveLastName()
 ** 08 -TestContactList: demoContactList.retrieveEmail()
 ** 09 -TestContactList: demoContactList.retrieveZip()
 ** 10 -TestContactList: demoContactList.writeFile()
 -- ContactList: METHOD writeFile: Write Contact object data from 
    ArrayList to file
*/
