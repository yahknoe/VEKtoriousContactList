/**
 * 03/15/2013
 * Prototype for sorting objects in ArrayList of contacts.
 * Sorts objects alphabetically by String (key = lastName + ", " + firstName) fields.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TestSort0315 implements Comparable<Object>{
	/**
	 * Private variables for TestSort0315 object contact info
	 */
	private String lastName;
	private String firstName;
	private String zip;

	/**
	 * Private variable for sorting TestSort0315 objects based on contact info
	 */
	private String key;

	/**
	 * Setter methods for TestSort0315 info variables
	 */
	public void setLastName(String lN) {
		lastName = lN;
	}

	public void setFirstName(String fN) {
		firstName = fN;
	}

	public void setZip(String zC) {
		zip = zC;
	}

	/**
	 * Getter methods for info variables
	 */
	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getZip() {
		return zip;
	}

	/**
	 * Getter method for key to sort TestSort0315 objects
	 */
	public String getKey() {
		key = lastName + ", " + firstName;
		return key;
	}

	/**
	 * For testing purposes: Print contact info
	 */
	public void printContact() {
		System.out.println(lastName + ", "
				+ firstName + "\n" + zip + "\n");
	}

	public int compareTo(Object compareContactKey) {	//must compare 2 objs, not strings -- don't pass string. also, PCL represents 1 contact should be called ProtoContact
		//return this.compareTo(key1);
		String contactKey1 = this.getKey();
		String contactKey2 = ((TestSort0315) compareContactKey).getKey();
		//compare this.getName() to compareContactKey.getName()
		return contactKey1.compareTo(contactKey2);
	}

	public static void main(String[] args) {
		//create ArrayList sortList
		List<TestSort0315> sortList = new ArrayList<TestSort0315>();
			
		//instantiate TestSort0315 w/ new object testContact
		TestSort0315 testContact1 = new TestSort0315();
		testContact1.setFirstName("Bill");
		testContact1.setLastName("Mills");
		testContact1.setZip("12345");
		System.out.println("New object testContact1: ");
		testContact1.printContact(); // print 1 at a time -- does not appear
									// overwritten b/c printed before next
									// values input?
		
		//add person to sortList
		sortList.add(testContact1);

		//create another person
		TestSort0315 testContact2 = new TestSort0315();
		testContact2.setFirstName("Mill");
		testContact2.setLastName("Bills");
		testContact2.setZip("54321");
		System.out.println("New object testContact2: ");;
		testContact2.printContact();
		
		//add another person to sortList
		sortList.add(testContact2);
		
		//make sure key is working
		System.out.println("getKey() for testContact1: " + testContact1.getKey() + "\n");
		System.out.println("getKey() for testContact2: " + testContact2.getKey() + "\n");
		
		//now we sort
		Collections.sort(sortList);
		System.out.println("Just sorted sortList!" + "\n");
		
		//now print sorted sortList objects!
		for (int i = 0; i < sortList.size(); i++) {
			System.out.println("In for loop to print object in sortList at index " + i + ":");
			sortList.get(i).printContact();
		}
	}

}

/*
--------------------------------------------------------
----------------   OUTPUT TO CONSOLE:   ----------------
--------------------------------------------------------
New object testContact1: 
Mills, Bill
12345

New object testContact2: 
Bills, Mill
54321

getKey() for testContact1: Mills, Bill

getKey() for testContact2: Bills, Mill

Just sorted sortList!

In for loop to print object in sortList at index 0:
Bills, Mill
54321

In for loop to print object in sortList at index 1:
Mills, Bill
12345

 */

