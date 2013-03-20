import java.io.IOException; //IOException for reading/writing
/*
 * Create, manipulate, and access contacts in contact list
 */
public class TestContactList { // KZ.

	/*
	 * ---------- MAIN ----------
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException { // KZ.

		// create new ContactList object to call non-static methods from
		// ContactList & Contact classes -EM
		ContactList demoContactList;
		demoContactList = new ContactList();
		
		//Read file to start from previous session
		demoContactList = demoContactList.readFile(); //Comment out THIS line to create new file/contact list
		//menu() loops until user quits
		demoContactList.menu();                     
		//menu() quit out of means termination of program; save to disk
		demoContactList.writeFile(demoContactList); 
	}
}

/*
OUTPUT FOR TASK 3 PRESENTATION 3/19/13
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
  What would you like to do? (Enter option from above): 1
Last Name: Ayoub
First Name: Abil
Street Address: 2184 Peachtree Ln
City: San Jose
State: CA
Zip: 95128
Email Address: asmanghori@gmail.com
Phone Number: 408-836-1742
Notes: Ayoub by any other name
Is this infomation correct?
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Ayoub, Abil
         2184 Peachtree Ln
         San Jose, CA 95128
         asmanghori@gmail.com
         408-836-1742
         Ayoub by any other name
Please confirm (y/n): y
Added to Contact List...
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
Last Name: Smith
First Name: Edward 
Street Address: 1045 Hutchinson Ave.
City: Palo Alto
State: CA
Zip: 94301
Email Address: edsmith@yahoo.com
Phone Number: 650-322-2462
Notes: The most dull of fellows
Is this infomation correct?
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Smith, Edward 
         1045 Hutchinson Ave.
         Palo Alto, CA 94301
         edsmith@yahoo.com
         650-322-2462
         The most dull of fellows
Please confirm (y/n): y
Added to Contact List...
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
Contact: Ayoub, Abil
         2184 Peachtree Ln
         San Jose, CA 95128
         asmanghori@gmail.com
         408-836-1742
         Ayoub by any other name
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Smith, Edward 
         1045 Hutchinson Ave.
         Palo Alto, CA 94301
         edsmith@yahoo.com
         650-322-2462
         The most dull of fellows
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
Last Name: Smith
First Name: Tabitha
Street Address: 1045 Hutchinson Ave.
City: Palo Alto
State: CA
Zip: 94301
Email Address: tabsmith@yahoo.com
Phone Number: 650-322-2462
Notes: Well-matched to that dull fellow
Is this infomation correct?
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Smith, Tabitha
         1045 Hutchinson Ave.
         Palo Alto, CA 94301
         tabsmith@yahoo.com
         650-322-2462
         Well-matched to that dull fellow
Please confirm (y/n): y
Added to Contact List...
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
Last name to search for: Smith
Searching for last name Smith...
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Smith, Edward 
         1045 Hutchinson Ave.
         Palo Alto, CA 94301
         edsmith@yahoo.com
         650-322-2462
         The most dull of fellows
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Smith, Tabitha
         1045 Hutchinson Ave.
         Palo Alto, CA 94301
         tabsmith@yahoo.com
         650-322-2462
         Well-matched to that dull fellow

2 matches found for last name Smith!
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
Email to search for: asmanghori@gmail.com
Searching for email asmanghori@gmail.com...
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Ayoub, Abil
         2184 Peachtree Ln
         San Jose, CA 95128
         asmanghori@gmail.com
         408-836-1742
         Ayoub by any other name

1 match found for email asmanghori@gmail.com!
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
Zip code to search for: 94041
Searching for zip code 94041...

Sorry, there are no contacts with zip code 94041 in the Contact List.
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
  What would you like to do? (Enter option from above): 94301
You have entered an invalid choice. Please re-enter your menu choice.
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
Zip code to search for: 94301
Searching for zip code 94301...
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Smith, Edward 
         1045 Hutchinson Ave.
         Palo Alto, CA 94301
         edsmith@yahoo.com
         650-322-2462
         The most dull of fellows
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Smith, Tabitha
         1045 Hutchinson Ave.
         Palo Alto, CA 94301
         tabsmith@yahoo.com
         650-322-2462
         Well-matched to that dull fellow

2 matches found for zip code 94301!
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
Contact: Ayoub, Abil
         2184 Peachtree Ln
         San Jose, CA 95128
         asmanghori@gmail.com
         408-836-1742
         Ayoub by any other name
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Smith, Edward 
         1045 Hutchinson Ave.
         Palo Alto, CA 94301
         edsmith@yahoo.com
         650-322-2462
         The most dull of fellows
 - @ - Class Contact: METHOD printSingleContact: Print out complete contact
Contact: Smith, Tabitha
         1045 Hutchinson Ave.
         Palo Alto, CA 94301
         tabsmith@yahoo.com
         650-322-2462
         Well-matched to that dull fellow
 ** 07 - TestContactList: demoContactList.retrieveLastName()
 ** 08 -TestContactList: demoContactList.retrieveEmail()
 ** 09 -TestContactList: demoContactList.retrieveZip()
 ** 10 -TestContactList: demoContactList.writeFile()
 */
