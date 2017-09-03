/*
	Q: 			Print a Tree Inorder without using Recursion.
	Approach: 	Use a Stack to temporary hold elements and iterate using a while loop.
*/
public class TreeInorder{
	
	static class Stack{
		Node top;
		class Node{
			Tree.Node data;
			Node next;

			public Node(Tree.Node i){
				this.data = i;
			}
		}

		public void push(Tree.Node i){
			if(top == null){
				top = new Node(i);
			}
			else{
				Node node = new Node(i);
				node.next = top;
				top = node;
			}
		}

		public Tree.Node pop(){
			if(top == null){
				return null;
			}
			Node node = top;
			top = top.next;
			return node.data;
		}
	}

	static class Tree{
		Node root;
		class Node{
			int data;
			Node left;
			Node right;
			public Node(int i){
				this.data = i;
			}
		}

	}

	static void printTreeInOrder(Tree.Node root){
		
		if(root == null){
			return;
		}

		Tree.Node node = root;

		while(node != null){
			if(node.left != null){
				stack.push(node);
				node = node.left;
			}
			else{
				
				System.out.println(node.data);
				Tree.Node n = stack.pop();
				if(n == null){
					return;
				}
				System.out.println(n.data);
				node = n.right;

			}
			
		}

		Stack.Node n = stack.top;

		while(n != null){
			System.out.println(n.data);
		}		
	}

	static Stack stack;
	static Tree tree;

	public static void main(String[] args){
		stack = new Stack();
		tree = new Tree();

		tree.root = tree.new Node(1);
		
		tree.root.left = tree.new Node(2);
		tree.root.right = tree.new Node(3);

		tree.root.left.left = tree.new Node(4);
		tree.root.left.right = tree.new Node(5);

		tree.root.right.left = tree.new Node(6);
		tree.root.right.right = tree.new Node(7);
		
		tree.root.right.left.right = tree.new Node(8);
		
		printTreeInOrder(tree.root);
	}
}