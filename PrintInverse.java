public class PrintInverse{
	
	static class Tree{
		TreeNode root;
		class TreeNode{
			int data;
			TreeNode left;
			TreeNode right;
			public TreeNode(int data){
				this.data = data;
			}
		}
	}

	static class Queue{
		QueueNode start;
		QueueNode end;
		class QueueNode{
				Tree.TreeNode data;
				QueueNode next;
				public QueueNode(Tree.TreeNode data){
					this.data = data;
				}
		}

		public void push(Tree.TreeNode t){
			if(start == null & end == null){
				start = new QueueNode(t);
				end = start;
			}
			else{
				QueueNode q = new QueueNode(t);
				end.next = q;
				end = q;
			}
		}

		public Tree.TreeNode pop(){
			QueueNode t = start;
			start = start.next;
			return t.data;
		}

		public boolean isEmpty(){
			if(start == null && end == null){
				return true;
			}
			else{
				return false;
			}
		}
	}

	public static void printLevels(Tree t){
		Queue q = new Queue();
		q.push(t.root);
		
		System.out.println();
		
		Queue.QueueNode cur = q.start;
		Queue.QueueNode breaker = cur;
		
		System.out.println(breaker.data.data);
		while(cur != null){

			Tree.TreeNode currentTree = cur.data;
			Tree.TreeNode lefter = currentTree.left;
			if(lefter != null){
				q.push(lefter);
			}
			Tree.TreeNode righter = currentTree.right;
			if(righter != null){
				q.push(righter);
			}
			
			if(cur == breaker){
				breaker = q.end;
				Queue.QueueNode temp = cur.next;
				while(temp != breaker.next){
					System.out.print(temp.data.data+",");
					temp = temp.next;
				}
				System.out.println();
			}

			cur = cur.next;
		}

	}


	public static void printTreeInorder(Tree.TreeNode t){
		if(t == null){
			return;
		}

		printTreeInorder(t.left);
		System.out.print(t.data+",");
		printTreeInorder(t.right);
			
	}
	public static void main(String[] args){
		Tree tree = new Tree();
		
		tree.root = tree.new TreeNode(8);
		
		//
		tree.root.left = tree.new TreeNode(4);
		tree.root.right = tree.new TreeNode(12);

		//
		tree.root.left.left = tree.new TreeNode(2);
		tree.root.left.right = tree.new TreeNode(6);
		tree.root.right.left = tree.new TreeNode(10);
		tree.root.right.right = tree.new TreeNode(14);

		//
		tree.root.left.left.left = tree.new TreeNode(1);
		tree.root.left.left.right = tree.new TreeNode(3);
		tree.root.left.right.left = tree.new TreeNode(5);
		tree.root.left.right.right = tree.new TreeNode(7);
		tree.root.right.left.left = tree.new TreeNode(9);
		tree.root.right.right.right = tree.new TreeNode(11);
		tree.root.right.left.left = tree.new TreeNode(13);
		tree.root.right.right.right = tree.new TreeNode(16);
		
		printTreeInorder(tree.root);

		printLevels(tree);
			
	}
}