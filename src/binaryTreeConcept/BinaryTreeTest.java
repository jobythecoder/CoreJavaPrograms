package binaryTreeConcept;

public class BinaryTreeTest {

	public static void main(String[] args) {

		BinaryTree theTree = new BinaryTree();
		theTree.addNode(50, "Boss");
		theTree.addNode(25, "VP");
		theTree.addNode(15, "Office Manager");
		theTree.addNode(30, "Secretary");
		System.out.println(theTree.findNode(50));
		
	}

}
