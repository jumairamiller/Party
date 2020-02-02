
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h>FileReader.java</h>
 * 
 * @version 2.0.0
 * @author Jumaira Miller, 983101
 * @since 30/04/2019
 *        <p>
 *        Last Modified: 1/04/2019
 *        </p>
 */

public class FileReader {

	/**
	 * 
	 * @param filename name of the file to be opened
	 * @return
	 */
	public static BST readProfileSet(String filename) {
		File inputFile = new File(filename);
		Scanner in = null;
		try {
			in = new Scanner(inputFile);
		} /* output an error message if filename is not found, instead of crashing */
		catch (FileNotFoundException e) {
			System.out.println("Cannot open " + filename);
			System.exit(0);
		}
		return FileReader.readProfileSet(in);
	}

	/**
	 * 
	 * @param in Scanner
	 * @return the Binary Search Tree
	 */
	public static BST readProfileSet(Scanner in) {
		BST tree = new BST();
		while (in.hasNextLine()) {
			Scanner line = new Scanner(in.nextLine());
			tree.insertProfile(constructProfile(line));
		}
		return tree;
	}

	/**
	 * 
	 * @param line each line of the text file
	 * @return the instance of the class
	 */
	public static Profile constructProfile(Scanner line) {
		String lName = line.useDelimiter(",").next();
		String fName = line.useDelimiter(",").next();
		int d = line.useDelimiter(",").nextInt();
		int m = line.useDelimiter(",").nextInt();
		int y = line.useDelimiter(",").nextInt();
		String ToR = line.useDelimiter(",").next();
		String CoR = line.useDelimiter(",").next();
		String nationality = line.useDelimiter(",").next();
		String email = line.useDelimiter(",").next();

		// ArrayList of interests:
		ArrayList<String> interest = new ArrayList<>();
		while (line.hasNext()) {
			String curInterest = line.useDelimiter(";").next();
			interest.add(curInterest);
		}

		// initialises an array or interests which is the same size of the arrayList
		String[] arrInterest = new String[interest.size()];

		/**
		 * Maps the interests in the arrayList to the array that we have defined to be
		 * the size of the arrayList
		 */
		for (int i = 0; i < arrInterest.length; i++) {
			arrInterest[i] = interest.get(i);
		}

		Profile p = new Profile(lName, fName, d, m, y, ToR, CoR, nationality, email, arrInterest);
		return p;
	}

}
