public class RotateLinkedList{
	
	static class LinkedList{
		Node head;
		class Node{
			int data;
			Node next;
			public Node(int data){
				this.data = data;
			}
		}
		public void push(int i){
			if(head == null){
				head = new Node(i);
			}
			else{
				
				Node node = head;
				Node newNode = new Node(i);

				while(node.next != null){
					node = node.next;
				}

				node.next = newNode;
			}
		}

		public void printList(){
			Node node = head;
			while(node != null){
				System.out.print(node.data+",");
				node = node.next;
			}
			System.out.println();
		}

		public void rotate_list(int i){
			Node node = head;

			//get list size
			int size = 0;
			while(node != null){
				size++;
				node = node.next;
			}

			i = size%i;
			node = head;
			int c = 0;
			while(c<=i-1){
				node = node.next;
				c++;
			}

			//get tail
			Node tail = head;
			while(tail.next != null){
				tail = tail.next;
			}

			tail.next = head;
			head = node.next;
			node.next = null;

		}
	}

	public static void main(String[] args){
		LinkedList ll = new LinkedList();

		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);

		ll.printList();
		ll.rotate_list(3);
		ll.printList();


	}
}