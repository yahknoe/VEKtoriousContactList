import java.util.Scanner; //for user input

/*
 * One object of this class represents a single contact, including first name,
 * last name, street address, city, state, zip code, email address, phone
 * number, and notes.
 */
public class Contact { // KZ.

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
	private String key;         //key for sorting Contacts EM
	
	/*
	 * Method to create a single contact and set values
	 * "METHOD createContact scans/reads input from user and create a single contact"
	 * "uses printSingleContact to output to console"
	 * "   ~METHOD sets whole contact at once"
	 */
	public Contact readContact() {	 // KZ. 
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
	 * Method to print single contact
	 * "METHOD printSingleContact: Print out single complete contact"
	 */
	public String printSingleContact () {	 // KZ, EM
		System.out.println("METHOD printSingleContact: Print out single complete contact");
		return lastName + ", " + firstName + "\n" + street + "\n" + 
		city + ", " + state + " " + zip + "\n" + email + "\n" + 
		phone + "\n" + notes;
	}

	/*
	 * Method to set last name
	 * "      ~ Method setLastName: Set lastName"
	 */
	public void setLastName(String lN) { // KZ, EM
		lastName = lN;
	}

	/*
	 * Method to get last name
	 * "      ~ Method getLastName: Get lastName"
	 */
	public String getLastName() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("Last Name: ");
		lastName = reader.nextLine();
		return lastName;
	}

	/*
	 * Method to set first name
	 * "      ~ Method setFirstName: Set firstName"
	 */
	public void setFirstName(String fN) { // KZ, EM
		firstName = fN;
	}

	/*
	 * Method to get first name
	 * "      ~ Method getFirstName: Get firstName"
	 */
	public String getFirstName() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("First Name: ");
		firstName = reader.nextLine();
		return firstName;
	}

	/*
	 * Method to set street address
	 * "      ~ Method setStreet: Set street"
	 */
	public void setStreet(String s) { // KZ, EM
		street = s;
	}

	/*
	 * Method to get street address
	 * "      ~ Method getStreet: Get street"
	 */
	public String getStreet() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("Street Address: ");
		street = reader.nextLine();
		return street;
	}

	/*
	 * Method to set city address
	 * "      ~ Method setCity: Set city"
	 */
	public void setCity(String c) { // KZ, EM
		city = c;
	}

	/*
	 * Method to get city address
	 * "      ~ Method getCity: Get city"
	 */
	public String getCity() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("City: ");
		city = reader.nextLine();
		return city;
	}

	/*
	 * Method to set state
	 * "      ~ Method setState: Set state"
	 */
	public void setState(String s) { // KZ, EM
		state = s;
	}

	/*
	 * Method to get state
	 * "      ~ Method getState: Get state"
	 */
	public String getState() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("State: ");
		state = reader.nextLine();
		return state;
	}

	/*
	 * Method to set zip code
	 * "      ~ Method setZip: Set zip"
	 */
	public void setZip(String z) { // KZ, EM
		zip = z;
	}

	/*
	 * Method to get zip code
	 * "      ~ Method getZip: Get zip"
	 */
	public String getZip() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("Zip: ");
		zip = reader.nextLine();
		return zip;
	}

	/*
	 * Method to set email address
	 * "      ~ Method setEmail: Set email"
	 */
	public void setEmail(String e) { // KZ, EM
		email = e;
	}

	/*
	 * Method to get email address
	 * "      ~ Method getEmail: Get email"
	 */
	public String getEmail() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("Email Address: ");
		email = reader.nextLine();
		return email;
	}

	/*
	 * Method to set phone number
	 * "      ~ Method setPhone: Set phone"
	 */
	public void setPhone(String p) { // KZ, EM
		phone = p;
	}

	/*
	 * Method to get phone number
	 * "      ~ Method getPhone: Get phone"
	 */
	public String getPhone() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("Phone Number: ");
		phone = reader.nextLine();
		return phone;
	}
	/*
	 * Method to set notes
	 * "      ~ Method setNotes: Set notes"
	 */
	public void setNotes(String n) { // KZ, EM
		notes = n;
	}

	/*
	 * Method to set notes
	 * "      ~ Method getNotes: Get notes"
	 */
	public String getNotes() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("Notes: ");
		notes = reader.nextLine();
		return notes;
	}

	/*
     * Getter method for key by which to sort Contact objects EM
     */
    public String getKey() {
    	key = lastName + ", " + firstName;
        return key;
   	}
   	
	// TEMP TEMP TEMP TEMP TEMP TEMP TEMP TEMP TEMP TEMP TEMP TEMP TEMP TEMP TEMP TEMP TEMP TEMP 
	public void readContact() { // KZ. TEMPORARY to FIX ERROR IN CONTACT CALL
		System.out.println("TEMP METHOD readContact");
	}

}
