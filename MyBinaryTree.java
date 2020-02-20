class Node{
	int key;
	Node left,right;
	public Node(int key){
		data = key;
		left = null;
		right = null;
	}
}

class MyBinaryTree {
	Node root;

	MyBinaryTree(){
		root = null;
	}

	void Preoder(Node node){
		if (node == null)
			return;

		

	}

	void Postorder(){

	}

	void Inorder(){

	}



	public static void main(String []args){
		MyBinaryTree tree = new MyBinaryTree();
		tree.root= new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
	}
}
