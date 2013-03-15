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

	//Constructor with no params
	public Contact() {
	}

	//Constructor with params for TESTING!
	public Contact(String last, String first, String st, String thisCity, 
			       String thisState, String thisZip, String thisEmail, String phoneNum, String theNotes) {
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
	public Contact readContact() {	 // KZ. VM
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
	 */
	public String printSingleContact () {	 // KZ, EM
		System.out.println("METHOD printSingleContact: Print out single complete contact");
		return lastName + ", " + firstName + "\n" + street + "\n" + 
		city + ", " + state + " " + zip + "\n" + email + "\n" + 
		phone + "\n" + notes;
	}

	/*
	 * Method to set last name
	 */
	public void setLastName(String lN) { // KZ, EM
		lastName = lN;
	}

	/*
	 * Method to get last name
	 */
	public String getLastName() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("Last Name: ");
		lastName = reader.nextLine();
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
	 * Method to set email address
	 */
	public void setEmail(String e) { // KZ, EM
		email = e;
	}

	/*
	 * Method to get email address
	 */
	public String getEmail() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("Email Address: ");
		email = reader.nextLine();
		return email;
	}

	/*
	 * Method to set phone number
	 */
	public void setPhone(String p) { // KZ, EM
		phone = p;
	}

	/*
	 * Method to get phone number
	 */
	public String getPhone() { // EM, KZ
		Scanner reader = new Scanner(System.in);
		System.out.print("Phone Number: ");
		phone = reader.nextLine();
		return phone;
	}
	/*
	 * Method to set notes
	 */
	public void setNotes(String n) { // KZ, EM
		notes = n;
	}

	/*
	 * Method to set notes
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
   	
}
