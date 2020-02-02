
/**
 * The class tests the implementation of the Binary Search Tree
 * 
 * @author Jumaira
 *
 */

public class BSTMain {

	public static void main(String[] args) {

		BST bst1 = new BST();

		Profile p1 = new Profile("Miller", "Jumaira", 29, 10, 1999, "Doha", "Qatar", "Bangladeshi",
				"983101@swansea.ac.uk", new String[] { "Oil Painting", "Fruit carving", "Reading" });

		Profile p2 = new Profile("Parwin", "Celia", 16, 04, 1972, "Uxbridge", "England", "Bangladeshi",
				"pc@computer.com", new String[] { "Gardening", "Bird watching", "Thriller Movies" });

		Profile p3 = new Profile("Svejnoha", "Tomas", 02, 06, 1998, "Prague", "Czech Republic", "Czech",
				"strawberry@fruit.com", new String[] { "Photography", "Climbing", "Coding" });

		bst1.insertProfile(p2);
		bst1.insertProfile(p3);
		bst1.insertProfile(p1);

		bst1.printAlphabetical();

	}

}
