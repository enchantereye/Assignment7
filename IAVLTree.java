import javax.swing.JTree;

public interface IAVLTree {
	/**
	 * get the node by index
	 * @param id, the node id to get
	 * @return
	 */
	Node get(int id);
	/**
	 * insert the node by id
	 */
	void insert(Node newNode);
	/**
	 * the node id to delete
	 * @param id
	 */
	void delete(int id);
	/**
	 * print the whole tree
	 * @return a java swing Object JTree
	 */
	JTree printTree();

}
