
public class BinaryTreeBFSTraversal extends BinaryOrderedTree {

	Node root;

	public static void main(String[] args) {

		BinaryTreeBFSTraversal bft = new BinaryTreeBFSTraversal();

		// Ordered Binary tree creation
		bft.root = bft.addElement(8);
		bft.addElement(3);
		bft.addElement(10);
		bft.addElement(1);
		bft.addElement(6);
		bft.addElement(14);
		bft.addElement(4);
		bft.addElement(7);
		bft.addElement(13);

		// Breadth first order traversal
		bft.printBinaryTreeBFSTraversal(bft.root);
	}

}