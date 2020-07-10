
public class BinaryTreeBFSTraversal {

	Node root;

	public static void main(String[] args) {
		BinaryTreeBFSTraversal bst = new BinaryTreeBFSTraversal();
		TraverseLeaves traverseLeaves = new TraverseLeaves();
		bst.root = new Node(8);
		bst.root.left = new Node(3);
		bst.root.right = new Node(10);
		bst.root.left.left = new Node(1);
		bst.root.left.right = new Node(6);
		bst.root.right.right = new Node(14);
		bst.root.left.right.left = new Node(4);
		bst.root.left.right.right = new Node(7);
		bst.root.right.right.left = new Node(13);
		traverseLeaves.printBinaryTreeBFSTraversal(bst.root);
	}

}
