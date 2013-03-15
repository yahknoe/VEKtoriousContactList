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
		
		System.out.println(" •• 01 - TestContactList: print demoContact");
		System.out.println("    demoContact: " + demoContact);

		// read all contacts from disk
		System.out.println(" •• 02 - TestContactList: demoContactList.readFile()");
		demoContactList.readFile(); // KZ. read file from disk

		// loop to be implemented to repeat menu until user quits
		System.out.println(" •• 03 - TestContactList: demoContactList.menu()");
		demoContactList.menu(); // KZ. call main menu, displays menu options

		// MENU OPTIONS -- For demonstration purposes only
			System.out.println(" •• 04 - TestContactList: REMOVED •• demoContact.readContact()");
			// demoContact.readContact(); // EM (REMOVED AS THIS CAUSES A NEW CONTACT AFTER MENU QUIT
			System.out.println(" •• 05 - TestContactList: demoContact.printSingleContact()");
			System.out.println(demoContact.printSingleContact()); // EM

		System.out.println(" •• 06 - TestContactList: demoContactList.printList()");
		demoContactList.printList(); // KZ.
		System.out.println(" •• 07 - TestContactList: demoContactList.retrieveLastName()");
		demoContactList.retrieveLastName(); // KZ.
		System.out.println(" •• 08 -TestContactList: demoContactList.retrieveEmail()");
		demoContactList.retrieveEmail(); // KZ.
		System.out.println(" •• 09 -TestContactList: demoContactList.retrieveZip()");
		demoContactList.retrieveZip(); // KZ.

		// end of loop means user quit; save to disk
		System.out.println(" •• 10 -TestContactList: demoContactList.writeFile()");
		demoContactList.writeFile(); // KZ. write changes to disk


		//USE THIS TO TEST ADDING CONTACTS TO LIST AND PRINTING:
		/*
		demoContactList.add(demoContact.readContact()); // EM
		demoContactList.printList(); // EM
		
		demoContactList.add(demoContact.readContact()); // EM
		demoContactList.printList(); // EM

		demoContactList.add(demoContact.readContact()); // EM
		demoContactList.printList(); // EM
		*/



	}
}

/*
OUR OUTPUT:

 •• 01 - TestContactList: print demoContact
    demoContact: Contact@4b71bbc9
 •• 02 - TestContactList: demoContactList.readFile()
 -- ContactList: METHOD readFile: Read Contact objects from saved file 
    and add to contactArrayList()
 •• 03 - TestContactList: demoContactList.menu()
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
  What would you like to do? (Enter option from above):
1
switch menuChoice: new
Last Name: 
--- You did not enter a last name. 
--- Please enter a valid last name to start a new contact.
Last Name: Johnson
First Name: Kim
Street Address: 345 Main St
City: Somplace
State: NO
Zip: 03030
Email Address: kasjdu@wherever.com
Phone Number: 555-555-5555
Notes: what ever will be will be
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
  What would you like to do? (Enter option from above):
2
switch menuChoice: print
 - @ - Class Conact: METHOD printSingleContact: Print out complete contact
Contact: Johnson, Kim
         345 Main St
         Somplace, NO 03030
         kasjdu@wherever.com
         555-555-5555
         what ever will be will be
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
  What would you like to do? (Enter option from above):
3
switch menuChoice: last
 -- ContactList: METHOD retrieveLastName: Retrieve contact(s) with 
    matching last name & print to console or return error if none match
 -- ContactList: METHOD sortContact: Sort contact list in alphabetical order.
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
  What would you like to do? (Enter option from above):
4
switch menuChoice: email
 -- ContactList: METHOD retrieveEmail: Retrieve contact(s) with 
    matching email & print to console or return error if none match
 -- ContactList: METHOD sortContact: Sort contact list in alphabetical order.
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
  What would you like to do? (Enter option from above):
5
switch menuChoice: zip
 -- ContactList: METHOD retrieveZip: Retrieve contact(s) with 
    matching zip & print to console or return error if none match
 -- ContactList: METHOD sortContact: Sort contact list in alphabetical order.
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
  What would you like to do? (Enter option from above):
6
switch menuChoice: quit
Thank you for using the contact list!
 -- ContactList: METHOD writeFile: Write Contact object data from 
    ArrayList to file
 •• 04 - TestContactList: REMOVED •• demoContact.readContact()
 •• 05 - TestContactList: demoContact.printSingleContact()
 - @ - Class Conact: METHOD printSingleContact: Print out complete contact
Contact: null, null
         null
         null, null null
         null
         null
         null
 •• 06 - TestContactList: demoContactList.printList()
 - @ - Class Conact: METHOD printSingleContact: Print out complete contact
Contact: Johnson, Kim
         345 Main St
         Somplace, NO 03030
         kasjdu@wherever.com
         555-555-5555
         what ever will be will be
 •• 07 - TestContactList: demoContactList.retrieveLastName()
 -- ContactList: METHOD retrieveLastName: Retrieve contact(s) with 
    matching last name & print to console or return error if none match
 •• 08 -TestContactList: demoContactList.retrieveEmail()
 -- ContactList: METHOD retrieveEmail: Retrieve contact(s) with 
    matching email & print to console or return error if none match
 •• 09 -TestContactList: demoContactList.retrieveZip()
 -- ContactList: METHOD retrieveZip: Retrieve contact(s) with 
    matching zip & print to console or return error if none match
 •• 10 -TestContactList: demoContactList.writeFile()
 -- ContactList: METHOD writeFile: Write Contact object data from 
    ArrayList to file

*/
