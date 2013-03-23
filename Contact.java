import java.util.Scanner; //for user input
import java.io.Serializable; //to write objects to file

/**
 * One object of this class represents a single contact, including first name,
 * last name, street address, city, state, zip code, email address, phone
 * number, and notes.
 */
public class Contact implements Serializable, Comparable<Contact> { // EM, KZ

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
	private String sortKey; // key for sorting Contacts EM

	// Constructor with no parameters
	public Contact() {
	}

	// Constructor with params for TESTING!
	// ??????? DO WE REMOVE THIS ??????????????????????????????????????????????????
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

	/**
	 * METHOD: to create a single contact and set values
	 */
	public Contact readContact() { // KZ. VP
		Contact thisContact = new Contact();
		Scanner reader = new Scanner(System.in);
		String confirm;
		do {
			thisContact.setLastName(getFromUserLastName());
			thisContact.setFirstName(getFromUserFirstName());
			thisContact.setStreet(getFromUserStreet());
			thisContact.setCity(getFromUserCity());
			thisContact.setState(getFromUserState());
			thisContact.setZip(getFromUserZip());
			thisContact.setEmail(getFromUserEmail());
			thisContact.setPhone(getFromUserPhone());
			thisContact.setNotes(getFromUserNotes());
			System.out.println("Is this infomation correct?");
			System.out.println(thisContact.toString());
			System.out.print("Please confirm (y/n): ");
			confirm = reader.nextLine();
		}
		while (!confirm.equals("y"));
		System.out.println("Added to Contact List...");
		return thisContact;
	}

	/**
	 * METHOD: to return all information for a single contact
	 */
	public String toString() { // KZ, EM
		return "Contact: " + lastName + ", " + firstName + "\n         "
				+ street + "\n         " + city + ", " + state + " " + zip
				+ "\n         " + email + "\n         " + phone + "\n         "
				+ notes;
	}

	/**
	 * METHOD: to get last name from user. User must enter last name 
	 * to continue name. // KZ
	 */
	public String getFromUserLastName() { // EM, KZ
		lastName = "";
		while (lastName.equals("")) { // KZ - Added loop not allowing empty last name
			Scanner reader = new Scanner(System.in);
			System.out.print("Last Name: ");
			lastName = reader.nextLine();
			if (lastName.equals("")) {
				System.out.println("--- You did not enter a last name. \n"
								+ "--- Please enter a valid last name to start a new contact.");
			}
		}
		return lastName;
	}

	/**
	 * METHOD: to set last name
	 */
	public void setLastName(String lN) { // KZ, EM
		lastName = lN;
	}

	/**
	 * METHOD: to get previously-set last name --VP
	 * used for retrieve/sort.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * METHOD: to get first name from user
	 */
	public String getFromUserFirstName() { // EM, KZ, VP
		Scanner reader = new Scanner(System.in);
		System.out.print("First Name: ");
		firstName = reader.nextLine();
		return firstName;
	}

	/**
	 * METHOD: to set first name
	 */
	public void setFirstName(String fN) { // KZ, EM
		firstName = fN;
	}

	/**
	 * METHOD: to get previously-set first name --VP
	 * used for retrieve/sort.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * METHOD: to get street address from user
	 */
	public String getFromUserStreet() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("Street Address: ");
		street = reader.nextLine();
		return street;
	}

	/**
	 * METHOD: to set street address
	 */
	public void setStreet(String s) { // KZ, EM
		street = s;
	}

	// ??????? DO WE REMOVE THIS ??????????????????????????????????????????????????
	/**
	 * METHOD: to get previously-set street address --VP
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * METHOD: to get city address from user
	 */
	public String getFromUserCity() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("City: ");
		city = reader.nextLine();
		return city;
	}

	/**
	 * METHOD: to set city address
	 */
	public void setCity(String c) { // KZ, EM
		city = c;
	}

	// ??????? DO WE REMOVE THIS ??????????????????????????????????????????????????
	/**
	 * METHOD: to get previously-set city address --VP
	 */
	public String getCity() {
		return city;
	}

	/**
	 * METHOD: to get state from user
	 */
	public String getFromUserState() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("State: ");
		state = reader.nextLine();
		return state;
	}

	/**
	 * METHOD: to set state
	 */
	public void setState(String s) { // KZ, EM
		state = s;
	}

	// ??????? DO WE REMOVE THIS ??????????????????????????????????????????????????
	/**
	 * METHOD: to get previously-set state --VP
	 */
	public String getState() {
		return state;
	}

	/**
	 * METHOD: to get zip code from user
	 */
	public String getFromUserZip() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("Zip: ");
		zip = reader.nextLine();
		return zip;
	}

	/**
	 * METHOD: to set zip code
	 */
	public void setZip(String z) { // KZ, EM
		zip = z;
	}

	/**
	 * METHOD: to get previously-set zip code --VP
	 * used for retrieve/sort.
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * METHOD: to get phone number from user. Method includes phone number
	 * validation. // KZ
	 */
	public String getFromUserPhone() { // KZ, EM, KZ
		boolean status = true;
		final String VALID_PHONE_NUMBER_PATTERN = "[0-9]{3}-[0-9]{3}-[0-9]{4}"; // KZ
		while (status) {
			Scanner reader = new Scanner(System.in);
			System.out.print("Phone Number: ");
			phone = reader.nextLine();
			if (email.trim().equals(""))	{
				status = false;
			} else if (phone.matches(VALID_PHONE_NUMBER_PATTERN)) {
				status = false;
			} else {
				System.out.println("--- You did not enter a valid US phone number. \n"
								+ "--- Please enter a phone number in the following format: XXX-XXX-XXXX.");
			}
		}
		return phone.trim();
	}

	/**
	 * METHOD: to set phone number
	 */
	public void setPhone(String p) { // KZ, EM
		phone = p;
	}

	/**
	 * METHOD: to get previously-set phone number --VP
	 * used for retrieve/sort.
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * METHOD: to get email address from user. Method includes email validation. --KZ
	 */
	public String getFromUserEmail() { // EM, KZ
		boolean status = true;
		final String VALID_EMAIL_PATTERN = ("[a-zA-Z0-9._-]+@[a-zA-Z0-9_-]+.[a-zA-Z]{3}"); // KZ
		while (status) {
			Scanner reader = new Scanner(System.in);
			System.out.print("Email Address: ");
			email = reader.nextLine();
			if (email.trim().equals(""))	{
				status = false;
			} else if (email.matches(VALID_EMAIL_PATTERN)) {
				status = false;
			} else {
				System.out.println("--- You did not enter a valid email address. \n"
								+ "--- Please enter a email address in the following format: \n"
								+ "         yoururl_01@somplace.xxx \n"
								+ "    or   your.url_02@somplace.xxx \n");
			}
		}
		return email.trim();
	}

	/**
	 * METHOD: to set email address
	 */
	public void setEmail(String e) { // KZ, EM
		email = e;
	}

	/**
	 * METHOD: to get previously-set email address --VP
	 * used for retrieve/sort.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * METHOD: to get notes from user
	 */
	public String getFromUserNotes() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("Notes: ");
		notes = reader.nextLine();
		return notes;
	}

	/**
	 * METHOD: to set notes
	 */
	public void setNotes(String n) { // KZ, EM
		notes = n;
	}

	// ??????? DO WE REMOVE THIS ??????????????????????????????????????????????????
	/**
	 * METHOD: to get previously-set notes --VP
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * METHOD: getter for key by which to sort Contact objects. -EM
	 */
	public String getKey() { // EM
		sortKey = lastName + ", " + firstName;
		return sortKey;
	}

	/**
	 * Class Contact implements Comparable. Method uses compareTo() to sort
	 * entire ContactList in alphabetical order (natural order for Strings). -EM
	 */
	public int compareTo(Contact compareContactKey) { // EM
		String contactKey1 = ((Contact) this).getKey();
		String contactKey2 = ((Contact) compareContactKey).getKey();
		return contactKey1.compareTo(contactKey2);
	}

}
