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
	private String key;         //key for sorting Contacts (maybe put in static block?) -EM
	
	/*
	 * Method to read input info from user to set private variable info for a single Contact object
	 * readContact does not create a Contact object. It lets the program user enter the object's values.
	 * "METHOD readContact scans/reads input from user to set private variable info for a single Contact object"
	 * "uses printSingleContact to output to console"
	 * "   ~METHOD sets all private variable info at once"
	 */
	public void readContact () {	 // KZ. 
		System.out.println("METHOD readContact scans/reads input from user to set private variable info for a single Contact object");
		setLastName("last");
		setFirstName("first");
		setStreet("street");
		setCity("city");
		setState("state");
		setZip("zip");
		setEmail("email");
		setPhone("phone");
		setNotes("notes");
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
		System.out.println("      ~ Method setLastName: Set lastName");
		lastName = lN;
	}
	
	/*
	 * Method to get last name
	 * "      ~ Method getLastName: Get lastName"
	 */
	public String getLastName() { // EM, KZ
		System.out.println("      ~ Method getLastName: Get lastName");
		return lastName;
	}

	/*
	 * Method to set first name
	 * "      ~ Method setFirstName: Set firstName"
	 */
	public void setFirstName(String fN) { // KZ, EM
		System.out.println("      ~ Method setFirstName: Set firstName");
		firstName = fN;
	}
	
	/*
	 * Method to get first name
	 * "      ~ Method getFirstName: Get firstName"
	 */
	public String getFirstName() { // EM, KZ
		System.out.println("      ~ Method getFirstName: Get firstName");
		return firstName;
	}
	
	/*
	 * Method to set street address
	 * "      ~ Method setStreet: Set street"
	 */
	public void setStreet(String s) { // KZ, EM
		System.out.println("      ~ Method setStreet: Set street");
		street = s;
	}
	
	/*
	 * Method to get street address
	 * "      ~ Method getStreet: Get street"
	 */
	public String getStreet() { // EM, KZ
		System.out.println("      ~ Method getStreet: Get street");
		return street;
	}
	
	/*
	 * Method to set city address
	 * "      ~ Method setCity: Set city"
	 */
	public void setCity(String c) { // KZ, EM
		System.out.println("      ~ Method setCity: Set city");
		city = c;
	}
	
	/*
	 * Method to get city address
	 * "      ~ Method getCity: Get city"
	 */
	public String getCity() { // EM, KZ
		System.out.println("      ~ Method getCity: Get city");
		return city;
	}
	
	/*
	 * Method to set state
	 * "      ~ Method setState: Set state"
	 */
	public void setState(String s) { // KZ, EM
		System.out.println("      ~ Method setState: Set state");
		state = s;
	}
	
	/*
	 * Method to get state
	 * "      ~ Method getState: Get state"
	 */
	public String getState() { // EM, KZ
		System.out.println("      ~ Method getState: Get state");
		return state;
	}
	
	/*
	 * Method to set zip code
	 * "      ~ Method setZip: Set zip"
	 */
	public void setZip(String z) { // KZ, EM
		System.out.println("      ~ Method setZip: Set zip");
		zip = z;
	}
	
	/*
	 * Method to get zip code
	 * "      ~ Method getZip: Get zip"
	 */
	public String getZip() { // EM, KZ
		System.out.println("      ~ Method getZip: Get zip");
		return zip;
	}
	
	/*
	 * Method to set email address
	 * "      ~ Method setEmail: Set email"
	 */
	public void setEmail(String e) { // KZ, EM
		System.out.println("      ~ Method setEmail: Set email");
		email = e;
	}
	
	/*
	 * Method to get email address
	 * "      ~ Method getEmail: Get email"
	 */
	public String getEmail() { // EM, KZ
		System.out.println("      ~ Method getEmail: Get email");
		return email;
	}

	/*
	 * Method to set phone number
	 * "      ~ Method setPhone: Set phone"
	 */
	public void setPhone(String p) { // KZ, EM
		System.out.println("      ~ Method setPhone: Set phone");
		phone = p;
	}
	
	/*
	 * Method to get phone number
	 * "      ~ Method getPhone: Get phone"
	 */
	public String getPhone() { // EM, KZ
		System.out.println("      ~ Method getPhone: Get phone");
		return phone;
	}
	/*
	 * Method to set notes
	 * "      ~ Method setNotes: Set notes"
	 */
	public void setNotes(String n) { // KZ, EM
		System.out.println("      ~ Method setNotes: Set notes");
		notes = n;
	}
	
	/*
	 * Method to set notes
	 * "      ~ Method getNotes: Get notes"
	 */
	public String getNotes() { // EM, KZ
		System.out.println("      ~ Method getNotes: Get notes");
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


