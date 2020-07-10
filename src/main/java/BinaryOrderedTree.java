
public class BinaryOrderedTree {

	Node root;

	public BinaryOrderedTree(int data) {
		root = new Node(data);
	}

	/** Adds element at position in order and returns parent **/
	/** Removes if it already exists **/
	Node addElement(final int data) {

		if (root == null) {
			root = new Node(data);
			return root;
		} else {
			Node current = root;
			Node parent = null;

			while (true) {
				parent = current;
				if (data < parent.data) {
					current = current.left;

					if (current == null) {
						parent.left = new Node(data);
						return root;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = new Node(data);
						return root;
					}
				}
			}
		}
	}

	/** Deletes element at position in order and returns parent or returns null **/
	Node deleteElement(Node node, int data) {
		if (node == null) {
			return null;
		} else {
			if (node.data > data)
				node.left = deleteElement(node.left, data);
			else if (node.data < data)
				node.right = deleteElement(node.right, data);
			else {
				if (node.left == null && node.right == null)
					node = null;
				else if (node.left == null)
					node = node.right;
				else if (node.right == null)
					node = node.left;
				else {
					Node temp = minNode(node.right);
					node.data = temp.data;
					node.right = deleteElement(node.right, temp.data);
				}
			}

			return node;
		}
	}

	private Node minNode(Node root) {
		if (root.left != null)
			return minNode(root.left);
		else
			return null;
	}

	public static void main(String[] args) {
		BinaryOrderedTree tree = new BinaryOrderedTree(8);
		TraverseLeaves traverseLeaves = new TraverseLeaves();
		tree.addElement(3);
		tree.addElement(10);
		tree.addElement(1);
		tree.addElement(6);
		tree.addElement(14);
		tree.addElement(4);
		tree.addElement(7);
		tree.addElement(13);

		traverseLeaves.traverseLeaves(tree.root);
		//tree.deleteElement(tree.root, 13);
		//System.out.println("\n");
		//traverseLeaves.traverseLeaves(tree.root);
	}

}
