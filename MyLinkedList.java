public class LinkedList{
	class Node {
		Node head;
		int data;
		Node next_node;

		Node(int d){
			this.data =d;
			this.next_node = null;
		}
	}

	public static push(int new_data){
		Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;
	}

	public static insertAt(Node prev_node, int data){
		if(prev_node == null){
			System.out.println("node doesnt exist!!!");
			return;
		}

		Node new_node = new Node(new_data);

		new_node.next = prev_node.next;

		prev_node.next = new_node;



	}

	public static atEnd(int data){
		if(head == null){
			head = new Node(new_data);
			return;
		}

		Node new_node = new Node(new_data);

		new_node.next = null;


		Node last = head;
		while(last.next != null){
			last = last.next;
		}

		last.next = new_node;
		return;

	}

	public static void main(String []args){
		LinkedList llist = new LinkedList();

		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.insertAt(llist.head.next, 12);
		llist.atEnd(10);



	}
}