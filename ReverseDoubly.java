public class ReverseDoubly{
	
	static class LinkedList{
		
		Node head;

		class Node{
			int data;
			Node next;
			Node prev;

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
				newNode.prev = node;
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

		public void reverse_doubly(){
			
			Node n1 = head;
			Node n2 = head.next;

			while(n2.next != null){
				
				Node temp = n2;
				n1.next = n1.prev;
				n1.prev = n2;
				n2 = n2.next;
				n1 = temp;

			}

			n1.next = n1.prev;
			n2.next = n1;
			head = n2;
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
		ll.reverse_doubly();
		ll.printList();

	}
}