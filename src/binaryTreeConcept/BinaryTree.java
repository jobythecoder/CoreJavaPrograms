package binaryTreeConcept;

public class BinaryTree {
	
	Node root;
	
	public void addNode(int key, String name) {
		
		//Create a new Node and initialize it
		Node newNode = new Node(key,name);
		
		//if there is no root this becomes root
		if (root==null) {
			root = newNode;
		}else {
		// Set root as the Node we will start
		// with as we traverse the tree
			
		Node focusNode = root;
		
		//Future parent for our new new Node
		
		Node parent;
		
		while (true) {
			
			//root is the top parent so we start there
			parent =focusNode;
			
			//check if the new Node should go on the left side of the parent node
			
			if( key < focusNode.key) {
				//switch focus to the left child
				
				focusNode = focusNode.leftChild;
				
				//if the left child has no children
				
				if(focusNode == null) {
					
				//then place the new node on the left of it
					
				parent.leftChild = newNode;
				return; //All done
				
				
				}
				
			} else { // if we get here, put the node on the right
				
				focusNode = focusNode.rightChild;
				
				// if the right child has no children
				
				if (focusNode ==null) {
					
				parent.rightChild = newNode;
				
				return; //All done
				
			   }
					
			} 
			
		  }
		
		}
			
	}
	
	public Node findNode(int key) {
		
		//start at the top of the tree
		
		Node focusNode = root;
		
		// while we have not find the node keep looking
		
		while (focusNode.key!=key) {
			
		// if we should search to the left
		
			if(key<focusNode.key)
			// shift the focus Node to the left child
		
				focusNode = focusNode.leftChild;
			else {
				focusNode = focusNode.rightChild;
			}
			
			if (focusNode==null) 
				return null;
						
			}
		
		return focusNode;
	}
		
}
