
public class ProfileMain {

	public static void main(String[] args) {

		Profile p1 = new Profile("Miller", "Jumaira", 29, 10, 1999, "Doha", "Qatar", "Bangladeshi",
				"983101@swansea.ac.uk", new String[] { "Oil Painting", "Fruit carving", "Reading" });

		Profile p2 = new Profile("Parwin", "Celia", 16, 04, 1972, "Uxbridge", "England", "Bangladeshi",
				"pc@computer.com", new String[] { "Gardening", "Bird watching", "Thriller Movies" });

		System.out.println(p1.toString() + "\n");

		p1.addFriend(p2);

		System.out.println(p1.getFriends(0) + "\n");

		System.out.println(p1.getName() + " has " + p1.numOfFriends() + " friend(s).");

	}

}
