
import java.util.ArrayList;
import java.util.Arrays;

/**
 * <h>Profile.java</h>
 * 
 * @version 2.0.0
 * @author Jumaira Miller, 983101
 * @since 30/04/2019
 *        <p>
 *        Last Modified: 1/04/2019
 *        </p>
 */

public class Profile {

	// Attributes of a Profile:
	private String lName; // Last Name
	private String fName; // First Name
	private int d; // Day of birth
	private int m; // Month of birth
	private int y; // Year of birth
	private String ToR; // Town of Residence
	private String CoR; // Country of Residence
	private String nationality;
	private String email;
	private String interests[];
	private ArrayList<Profile> friends = new ArrayList<Profile>(); // An arrayList of friends represented as references
																	// to profile

	/**
	 * Constructs a Profile
	 * 
	 * @param lastName
	 * @param firstName
	 * @param day
	 * @param month
	 * @param year
	 * @param TownOfResidence
	 * @param CountryOfResidence
	 * @param nationality
	 * @param email
	 * @param interests
	 */
	public Profile(String lastName, String firstName, int day, int month, int year, String TownOfResidence,
			String CountryOfResidence, String nationality, String email, String[] interests) {
		this.lName = lastName;
		this.fName = firstName;
		this.d = day;
		this.m = month;
		this.y = year;
		this.ToR = TownOfResidence;
		this.CoR = CountryOfResidence;
		this.nationality = nationality;
		this.email = email;
		this.interests = interests;
	}

	/**
	 * <p>
	 * no parameters
	 * </p>
	 * 
	 * @return the Town of Residence of instances of Profiles
	 */
	public String getTown() {
		return this.ToR;
	}

	/**
	 * <p>
	 * no parameters
	 * </p>
	 * 
	 * @return the Country of Residence of instances of Profiles
	 */
	public String getCountry() {
		return this.CoR;
	}

	/**
	 * <p>
	 * no parameters
	 * </p>
	 * 
	 * @return the nationality of instances of Profiles
	 */
	public String getNationality() {
		return this.nationality;
	}

	/**
	 * <p>
	 * no parameters
	 * </p>
	 * 
	 * @return an array of interests for each instance of a Profile
	 */
	public String[] getInterests() {
		return this.interests;
	}

	/**
	 * @param ToR Town of Residence
	 *            <p>
	 *            does not return anything
	 *            </p>
	 */
	public void setTown(String ToR) {
		this.ToR = ToR;
	}

	/**
	 * @param CoR Country of Residence
	 *            <p>
	 *            does not return anything
	 *            </p>
	 */
	public void setCountry(String CoR) {
		this.CoR = CoR;
	}

	/**
	 * @param nationality nationality of each instance of a Profile
	 *                    <p>
	 *                    does not return anything
	 *                    </p>
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * @param interests interests of each instance of a Profile
	 *                  <p>
	 *                  does not return anything
	 *                  </p>
	 */
	public void setInterests(String[] interests) {
		this.interests = interests;
	}

	/**
	 * getName() formats the full name from the first and last name
	 * <p>
	 * no parameters
	 * </p>
	 * 
	 * @return the formatted full name
	 */
	public String getName() {
		String fullName = this.fName + " " + this.lName;
		return fullName;
	}

	/**
	 * GetDateOfBirth() formats the DoB from the day, month, and year, converted
	 * from integer to string
	 * <p>
	 * no parameters
	 * </p>
	 * 
	 * @return the formatted Date of Birth
	 */
	public String getDateOfBirth() {

		String DoB = Integer.toString(this.d) + "/" + Integer.toString(this.m) + "/" + Integer.toString(this.y);
		return DoB;
	}

	/**
	 * Adds a friend to the friends arrayList
	 * 
	 * @param p instance of a Profile
	 *          <p>
	 *          does not return anything
	 *          </p>
	 */
	public void addFriend(Profile p) {
		friends.add(p);
	}

	/**
	 * Gets friend i from the arrayList
	 * 
	 * @param i index of the friend to be printed
	 * @return The name of friend i from the array List at the node
	 */
	public Profile getFriends(int i) {
		return friends.get(i);
	}

	/**
	 * Adds an instance of profile as 'friends
	 * <p>
	 * no parameters
	 * </p>
	 * 
	 * @return the number of friends for this profile
	 */
	public int numOfFriends() {
		return friends.size();
	}

	/**
	 * Method to convert instances of Profiles to strings
	 * <p>
	 * no parameters
	 * </p>
	 * 
	 * @return the attributes of profiles as strings
	 */
	public String toString() {
		StringBuilder str = new StringBuilder(getName() + ", Born on " + getDateOfBirth()
				+ "\nTown and country of Residence: " + getTown() + ", " + getCountry() + "\nNationality: "
				+ getNationality() + "\nE-mail :" + email + "\nInterests: " + Arrays.toString(getInterests()));

		return str.toString();
	}

}
