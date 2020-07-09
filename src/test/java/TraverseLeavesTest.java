import org.junit.Before;
import org.junit.Test;

import TraverseLeaves.Node;

public class TraverseLeavesTest {
	
	TraverseLeaves traverseLeaves;
	TraverseLeaves.Node root;
	
	@Before
	public void setup() {
		traverseLeaves = new TraverseLeaves();
		root = new TraverseLeaves.Node(8);
		root.left = new TraverseLeaves.Node(3);
		root.right = new TraverseLeaves.Node(10);
		root.left.left = new TraverseLeaves.Node(1);
		root.left.right = new TraverseLeaves.Node(6);
		root.right.right = new TraverseLeaves.Node(14);
		root.left.right.left = new TraverseLeaves.Node(4);
		root.left.right.right = new TraverseLeaves.Node(7);
		root.right.right.left = new TraverseLeaves.Node(13);

	}
	
	@Test
	public void traverseLeaves() {

	}

//	private TraverseLeaves.;
//    private Integer nodeValue;
//
//    @Before
//    public void setUp() {
//        nodeValue = 1;
//        node = new Node<>(nodeValue);
//    }
//
//    @Test
//    public void traverseLeaves() {
//        assertEquals("13 7 4 1", traverseLeaves.traverseLeaves(root));
//    }
//
//    @Test
//    public void testNodeHasNoChildren() {
//        assertNull(node.left);
//        assertNull(node.right);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testNodeNullConstructorThrowsException() {
//        Node<Integer> node = new Node<>(null);
//    }
}
