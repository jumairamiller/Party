
/**
 * <h>BSTNode.java</h>
 * 
 * @version 2.0.0
 * @author Jumaira Miller, 983101
 * @since 30/04/2019
 *        <p>
 *        Last Modified: 1/04/2019
 *        </p>
 */

public class BSTNode {

	private BSTNode l; // reference to the left child
	private BSTNode r; // reference to the right child
	private Profile data; // reference to a profile

	/**
	 * Constructs a
	 * 
	 * @param data reference to a profile
	 */
	public BSTNode(Profile data) {
		this.data = data;
		r = null;
		l = null;
	}

	/**
	 * Method to get the profile associated with the node.
	 */
	public Profile getProfile() {
		return data;

	}

	/**
	 * Method to set the left child.
	 * 
	 * @param left reference to the left child
	 *             <p>
	 *             does not return anything
	 *             </p>
	 */
	public void setL(BSTNode left) {
		this.l = left;
	}

	/**
	 * Method to get the left child.
	 * <p>
	 * no parameters
	 * </p>
	 * 
	 * @return the value of the left child
	 */
	public BSTNode getL() {
		return this.l;
	}

	/**
	 * Method to set the right child.
	 * 
	 * @param right reference to the right child
	 *              <p>
	 *              does not return anything
	 *              </p>
	 */
	public void setR(BSTNode right) {
		this.r = right;
	}

	/**
	 * Method to get the right child.
	 * <p>
	 * no parameters
	 * </p>
	 * 
	 * @return the value of the right child
	 */
	public BSTNode getR() {
		return this.r;
	}

}
