import java.io.IOException; //IOException for reading/writing
import java.util.Scanner;

/**
 * Create, manipulate, and access contacts in contact list
 */
public class TestContactList { // KZ.

	/**
	 * METHOD menuText: Menu text for contact list
	 */
	private static void menuText() { // KZ
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------   MAIN MENU:   --------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println("\t(1) New contact");
		System.out.println("\t(2) Print contact list");
		System.out.println("\t(3) Retrieve contact(s) by last name");
		System.out.println("\t(4) Retrieve contact(s) by email address");
		System.out.println("\t(5) Retrieve contact(s) by zip code");
		System.out.println("\t(6) Quit Contact List Program");
		System.out.println("--------------------------------------------------------");
		System.out.print("What would you like to do? (Enter option from above): ");
	}

	/**
	 * METHOD menu: Scan for menu options choice from user and execute options
	 */
	public static void menu(ContactList l) { // KZ
		System.out.println("--------------------------------------------------------");
		System.out.println("--- Welcome to the Quality Soft Contact List Program ---");

		String stringMenuChoice;
		char charMenuChoice;
		Scanner scanner = new Scanner(System.in);

		do {
			menuText();
			stringMenuChoice = scanner.nextLine().trim();

			if (stringMenuChoice.length() == 1)                //if input length is 1
				charMenuChoice = stringMenuChoice.charAt(0);   //set menu choice to input
			else 
				charMenuChoice = '_';                          //else set to invalid char for error message

			switch (charMenuChoice) {
			case '1':
				System.out.println("\nYou have selected: (1) New contact...\n");
				l.addContact();
				break;
			case '2':
				System.out.println("\nYou have selected: (2) Print contact list...\n");
				l.printList();
				break;
			case '3':
				System.out.println("\nYou have selected: (3) Retrieve contact(s) by last name...\n");
				l.retrieveLastName();
				break;
			case '4':
				System.out.println("\nYou have selected: (4) Retrieve contact(s) by email address...\n");
				l.retrieveEmail();
				break;
			case '5':
				System.out.println("\nYou have selected: (5) Retrieve contact(s) by zip code...\n");
				l.retrieveZip();
				break;
			case '6':
				break;
			default:
				System.out.println("\nYou have entered an invalid choice. Please re-enter your menu choice.\n");
				break;
			}
		}
		while (charMenuChoice != '6');
		
		System.out.println("\nYou have selected: (6) Quit Contact List Program...");
		System.out.println("\nThank you for using the Contact List!");
	}

	/**
	 * ---------- MAIN ----------
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException { // KZ.

		// create new ContactList object to call non-static methods from
		// ContactList & Contact classes -EM
		ContactList demoContactList;
		demoContactList = new ContactList();

		// Read file to start from previous session
		demoContactList = demoContactList.readFile();
		// menu() loops until user quits
		menu(demoContactList);
		// menu() quit out of means termination of program; save to disk
		demoContactList.writeFile();
	}
}

/**
OUTPUT FOR TASK 3 PRESENTATION 3/19/13
--------------------------------------------------------
----------------   OUTPUT TO CONSOLE:   ----------------
--------------------------------------------------------
 
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
Contact: Ayoub, Abil
         2184 Peachtree Ln
         San Jose, CA 95128
         asmanghori@gmail.com
         408-836-1742
         Ayoub by any other name
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
Contact: Smith, Edward 
         1045 Hutchinson Ave.
         Palo Alto, CA 94301
         edsmith@yahoo.com
         650-322-2462
         The most dull of fellows
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
Contact: Smith, Edward 
         1045 Hutchinson Ave.
         Palo Alto, CA 94301
         edsmith@yahoo.com
         650-322-2462
         The most dull of fellows
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
Contact: Ayoub, Abil
         2184 Peachtree Ln
         San Jose, CA 95128
         asmanghori@gmail.com
         408-836-1742
         Ayoub by any other name
Contact: Smith, Edward 
         1045 Hutchinson Ave.
         Palo Alto, CA 94301
         edsmith@yahoo.com
         650-322-2462
         The most dull of fellows
Contact: Smith, Tabitha
         1045 Hutchinson Ave.
         Palo Alto, CA 94301
         tabsmith@yahoo.com
         650-322-2462
         Well-matched to that dull fellow
 */
