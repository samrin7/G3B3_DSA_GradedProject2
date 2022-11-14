package BST_SkewedTree;

public class Driver {
	public static void main(String args[]) {
		SkewedTree tree = new SkewedTree();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		tree.BSTtoSkew(tree.node);
		System.out.println("OutPut: \n");
		tree.RightNodes(tree.headNode);

	}
}
