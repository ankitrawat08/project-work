import java.util.LinkedList;
import java.util.Queue;

public class BinaryOrderedTree {

	Node root;

//	public BinaryOrderedTree(int data) {
//		root = new Node(data);
//	}

	/** Adds element at position in order and returns parent **/
	/** Removes if it already exists **/
	public Node addElement(final int data) {

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
	public Node deleteElement(Node node, int data) {
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

	// printing leaf nodes in the order Right to left
	public void traverseLeaves(Node root) {
		if (root == null)
			return;

		if (root.left == null && root.right == null) {
			System.out.print(root.data + " ");
			return;
		}

		if (root.right != null)
			traverseLeaves(root.right);

		if (root.left != null)
			traverseLeaves(root.left);
	}

	// printing breadth first order traversal of the tree
	public void printBinaryTreeBFSTraversal(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node temp = q.poll();
			System.out.println(temp.data + " ");

			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}

	}

	private Node minNode(Node root) {
		if (root.left != null)
			return minNode(root.left);
		else
			return null;
	}

}