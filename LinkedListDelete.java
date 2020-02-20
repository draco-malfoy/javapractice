class LinkedListDelete{
	Node head;

	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}

	void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;

	}

	public static void main(String []args){
		LinkedList llist = new LinkedList();
		llist.push(5);
		System.out.print(llist);


	}

}