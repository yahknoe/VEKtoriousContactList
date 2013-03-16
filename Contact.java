import java.util.Scanner; //for user input

/*
 * One object of this class represents a single contact, including first name,
 * last name, street address, city, state, zip code, email address, phone
 * number, and notes.
 */
public class Contact implements Comparable<Contact> { // EM, KZ

	// ---------- VARIABLES ----------
	private String lastName;
	private String firstName;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String email;
	private String phone;
	private String notes;
	private String key; // key for sorting Contacts EM

	// Constructor with no params
	public Contact() {
	}

	// Constructor with params for TESTING!
	public Contact(String last, String first, String st, String thisCity,
			String thisState, String thisZip, String thisEmail,
			String phoneNum, String theNotes) {
		lastName = last;
		firstName = first;
		street = st;
		city = thisCity;
		state = thisState;
		zip = thisZip;
		email = thisEmail;
		phone = phoneNum;
		notes = theNotes;
	}

	/*
	 * Method to create a single contact and set values
	 */
	public Contact readContact() { // KZ. VM
		Contact thisContact = new Contact();
		thisContact.setLastName(getLastName());
		thisContact.setFirstName(getFirstName());
		thisContact.setStreet(getStreet());
		thisContact.setCity(getCity());
		thisContact.setState(getState());
		thisContact.setZip(getZip());
		thisContact.setEmail(getEmail());
		thisContact.setPhone(getPhone());
		thisContact.setNotes(getNotes());
		return thisContact;
	}

	/*
	 * Method to return all information for a single contact
	 */
	public String returnSingleContact() { // KZ, EM
		System.out
				.println(" - @ - Class Contact: METHOD printSingleContact: Print out complete contact");
			return "Contact: " + lastName + ", " + firstName + "\n         "
			+ street + "\n         " + city + ", " + state + " " + zip
			+ "\n         " + email + "\n         " + phone + "\n         "
			+ notes;
	}

	/*
	 * Method to set last name
	 */
	public void setLastName(String lN) { // KZ, EM
		lastName = lN;
	}

	/*
	 * Method to get last name. Method does not allow for no last name.
	 */
	public String getLastName() { // EM, KZ
		lastName = "";
		while (lastName.equals("")) { // KZ - Added loop not allowing empty last
										// name
			Scanner reader = new Scanner(System.in);
			System.out.print("Last Name: ");
			lastName = reader.nextLine();
			if (lastName.equals("")) {
				System.out
						.println("--- You did not enter a last name. \n"
								+ "--- Please enter a valid last name to start a new contact.");
			}
		}
		return lastName;

	}

	/*
	 * Method to set first name
	 */
	public void setFirstName(String fN) { // KZ, EM
		firstName = fN;
	}

	/*
	 * Method to get first name
	 */
	public String getFirstName() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("First Name: ");
		firstName = reader.nextLine();
		return firstName;
	}

	/*
	 * Method to set street address
	 */
	public void setStreet(String s) { // KZ, EM
		street = s;
	}

	/*
	 * Method to get street address
	 */
	public String getStreet() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("Street Address: ");
		street = reader.nextLine();
		return street;
	}

	/*
	 * Method to set city address
	 */
	public void setCity(String c) { // KZ, EM
		city = c;
	}

	/*
	 * Method to get city address
	 */
	public String getCity() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("City: ");
		city = reader.nextLine();
		return city;
	}

	/*
	 * Method to set state
	 */
	public void setState(String s) { // KZ, EM
		state = s;
	}

	/*
	 * Method to get state
	 */
	public String getState() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("State: ");
		state = reader.nextLine();
		return state;
	}

	/*
	 * Method to set zip code
	 */
	public void setZip(String z) { // KZ, EM
		zip = z;
	}

	/*
	 * Method to get zip code
	 */
	public String getZip() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("Zip: ");
		zip = reader.nextLine();
		return zip;
	}

	/*
	 * Method to set phone number
	 */
	public void setPhone(String p) { // KZ, EM
		phone = p;
	}

	/*
	 * Method to get phone number. Method includes phone number validation. //
	 * KZ
	 */
	public String getPhone() { // KZ, EM, KZ
		final String VALID_PHONE_NUMBER_PATTERN = "[0-9]{3}-[0-9]{3}-[0-9]{4}"; // KZ
		while (true) {
			Scanner reader = new Scanner(System.in);
			System.out.print("Phone Number: ");
			phone = reader.nextLine();
			if (phone.matches(VALID_PHONE_NUMBER_PATTERN)) {
				break;
			} else {
				System.out
						.println("--- You did not enter a valid US phone number. \n"
								+ "--- Please enter a phone number in the following format: XXX-XXX-XXXX.");
			}
		}
		return phone;
	}

	/*
	 * Method to set email address
	 */
	public void setEmail(String e) { // KZ, EM
		email = e;
	}

	/*
	 * Method to get email address. Method includes email validation. // KZ
	 */
	public String getEmail() { // EM, KZ
		final String VALID_EMAIL_PATTERN = ("[a-zA-Z0-9._-]+@[a-zA-Z0-9_-]+.[a-zA-Z]{3}"); // KZ
		while (true) {
			Scanner reader = new Scanner(System.in);
			System.out.print("Email Address: ");
			email = reader.nextLine();
			if (email.matches(VALID_EMAIL_PATTERN)) {
				break;
			} else {
				System.out
						.println("--- You did not enter a valid email address. \n"
								+ "--- Please enter a email address in the following format: \n"
								+ "         yoururl_01@somplace.xxx \n"
								+ "    or   your.url_02@somplace.xxx \n");
			}
		}
		return email;
	}

	/*
	 * Method to set notes
	 */
	public void setNotes(String n) { // KZ, EM
		notes = n;
	}

	/*
	 * Method to get notes
	 */
	public String getNotes() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("Notes: ");
		notes = reader.nextLine();
		return notes;
	}

	/*
	 * Getter method for key by which to sort Contact objects. -EM
	 */
	public String getKey() { // EM
		key = lastName + ", " + firstName;
		return key;
	}

	/*
	 * Class Contact implements Comparable. Method uses compareTo() to sort
	 * entire ContactList in alphabetical order (natural order for Strings). -EM
	 * " -- Contact: METHOD sortContact: Sort contact list in alphabetical order."
	 */
	public int compareTo(Contact compareContactKey) { // EM
		String contactKey1 = ((Contact) this).getKey();
		String contactKey2 = ((Contact) compareContactKey).getKey();
		return contactKey1.compareTo(contactKey2);
	}

}
