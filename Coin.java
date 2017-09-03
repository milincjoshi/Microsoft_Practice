
/*
	Q: Find all possible combinations that make kth amount form given coins.
	Approach:	implement dfs
				push to stack while raversing
				print stack when 0
				pop when traversing back

*/

public class Coin{
	
	static class Stack{
		Node top;
		class Node{
			int data;
			Node next;
			public Node(int data){
				this.data = data;
			}
		}

		public void push(int i){
			if(top == null){
				top = new Node(i);
			}
			else{
				Node node = new Node(i);
				node.next = top;
				top = node;
			}
		}

		public int pop(){
			Node node = top;
			top = top.next;
			return node.data;
		}

		public void printStack(){
			Node node = top;
			while(node != null){
				System.out.print(node.data+",");
				node = node.next;
			}
			System.out.println();
		}
	}



	public static void findCombinations(int n, int k){
		if(n<0){
			return;
		}
		if(n == 0){
			stack.printStack();
			return;
		}

		stack.push(20);
		findCombinations(n-20,20);
		stack.pop();

		stack.push(10);
		findCombinations(n-10,10);
		stack.pop();
		
		stack.push(5);
		findCombinations(n-5,5);
		stack.pop();

		stack.push(1);
		findCombinations(n-1,1);
		stack.pop();
	}

	static Stack stack;

	public static void main(String[] args){
		stack = new Stack();
		findCombinations(25, 0);
	}
}