
public class TraverseLeavesRightLeft extends BinaryOrderedTree {

	Node root;

	public static void main(String[] args) {

		TraverseLeavesRightLeft tlrl = new TraverseLeavesRightLeft();

		// Binary tree creation
		tlrl.root = tlrl.addElement(8);
		tlrl.addElement(3);
		tlrl.addElement(10);
		tlrl.addElement(1);
		tlrl.addElement(6);
		tlrl.addElement(14);
		tlrl.addElement(4);
		tlrl.addElement(7);
		tlrl.addElement(13);

		// traverseLeaves nodes from right to left
		tlrl.traverseLeaves(tlrl.root);
	}

}