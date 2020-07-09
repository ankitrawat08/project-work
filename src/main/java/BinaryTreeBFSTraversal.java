import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBFSTraversal {

	static Node root;

	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	
	static void printTree(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp=q.poll();
			System.out.println(temp.data + " ");
			
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
		
	}

	public static void main(String[] args) {
		root = new Node(8);
		root.left = new Node(3);
		root.right = new Node(10);
		root.left.left = new Node(1);
		root.left.right = new Node(6);
		root.right.right = new Node(14);
		root.left.right.left = new Node(4);
		root.left.right.right = new Node(7);
		root.right.right.left = new Node(13);
		printTree(root);
	}

}
