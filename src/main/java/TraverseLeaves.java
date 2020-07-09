public class TraverseLeaves {
	
	static Node root;

	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	};

// traverseLeaves nodes from right to left 
	static void traverseLeaves(Node root) {
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

	public static void main(String args[]) {
		root = new Node(8);
		root.left = new Node(3);
		root.right = new Node(10);
		root.left.left = new Node(1);
		root.left.right = new Node(6);
		root.right.right = new Node(14);
		root.left.right.left = new Node(4);
		root.left.right.right = new Node(7);
		root.right.right.left = new Node(13);

		traverseLeaves(root);
	}

}
