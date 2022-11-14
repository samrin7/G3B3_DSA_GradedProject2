package BST_SkewedTree;

class Node {
	int val;
	Node left, right;

	Node(int item) {
		val = item;
		left = right = null;
	}
}

public class SkewedTree {

	// creation of new node
	Node node;
	Node prevNode = null;
	Node headNode = null;

	void BSTtoSkew(Node root) {
		if (root == null) {
			return;
		}

		Node leftNode = root.left;
		Node rightNode = root.right;
		BSTtoSkew(leftNode);
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;

		}
		BSTtoSkew(rightNode);

	}

	void RightNodes(Node root) {
		if (root == null)
			return;
		else {
			System.out.print(root.val + " ");
			RightNodes(root.right);
		}
	}

	
}
