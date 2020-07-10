import java.util.LinkedList;
import java.util.Queue;

public class TraverseLeaves {

	Node root;

// traverseLeaves nodes from right to left 
	void traverseLeaves(Node root) {
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

//	public static void main(String args[]) {
//		TraverseLeaves traverseLeaves = new TraverseLeaves();
//		traverseLeaves.root = new Node(8);
//		traverseLeaves.root.left = new Node(3);
//		traverseLeaves.root.right = new Node(10);
//		traverseLeaves.root.left.left = new Node(1);
//		traverseLeaves.root.left.right = new Node(6);
//		traverseLeaves.root.right.right = new Node(14);
//		traverseLeaves.root.left.right.left = new Node(4);
//		traverseLeaves.root.left.right.right = new Node(7);
//		traverseLeaves.root.right.right.left = new Node(13);
//
//		traverseLeaves.traverseLeaves(traverseLeaves.root);
//	}

}
