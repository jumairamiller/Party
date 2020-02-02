
/**
 * <h>BST.java</h>
 * 
 * @version 2.0.0
 * @author Jumaira Miller, 983101
 * @since 30/04/2019
 *        <p>
 *        Last Modified: 1/04/2019
 *        </p>
 */

public class BST {

	private BSTNode root; // top most node - with no parent calls

	/**
	 * BST does nothing; empty constructor for a binary search tree
	 */
	public BST() {
	}

	/**
	 * Inserts an instance of a profile in
	 * 
	 * @param p
	 */
	public void insertProfile(Profile p) {
		BSTNode node = new BSTNode(p); //

		if (root == null) {
			root = node;
			System.out.println("The root has been set");
		} else {
			insertProfile(root, node);
		}
		System.out.println();
	}

	private void insertProfile(BSTNode node, BSTNode newNode) {
		if (node.getProfile().getName().compareTo(newNode.getProfile().getName()) <= 0) {
			System.out.println("The new node, " + newNode.getProfile().getName()
					+ " is being set to the right side of its " + "parent node " + node.getProfile().getName());
			if (node.getR() == null) {
				node.setR(newNode);
				System.out.println(
						"The new node had been set on the right side, under the node " + node.getProfile().getName());
			} else {
				insertProfile(node.getR(), newNode);
			}
		} else {
			System.out.println("The new node, " + newNode.getProfile().getName()
					+ " is being set to the left side of its " + "parent node " + node.getProfile().getName());
			if (node.getL() == null) {
				node.setL(newNode);
				System.out.println("The node had been set on the left side, under " + node.getProfile().getName());
			} else {
				insertProfile(node.getL(), newNode);
			}
		}
	}

	public void printAlphabetical() {
		printAlphabetical(this.root);
	}

	private void printAlphabetical(BSTNode node) {

		if (node == null) {
			return;
		} else {
			printAlphabetical(node.getL());
			System.out.println(node.getProfile().getName());
			printAlphabetical(node.getR());
		}
	}
}
