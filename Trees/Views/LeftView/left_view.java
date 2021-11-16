/*

Given the root of a binary tree, return the left view of its nodes' values. Assume the left and right child of a node makes a 45–degree angle with the parent.

Input:
		   1
		 /	 \
		/	  \
	   2	   3
	  		 /   \
	 	  	/	  \
		   5	   6
		 /   \
		/	  \
	   7	   8

Output: [1, 2, 5, 7]

Input:

	  1
	/   \
   /	 \
  2		  3
   \	 /
	\   /
	 4 5

Output: [1, 2, 4]

*/

class Solution
{
	/*
		A binary tree node is defined as:

		class Node
		{
			int data;			// data field
			Node left, right;	// pointer to the left and right child

			Node() {}
			Node(int data) { this.data = data; this.left = this.right = null; }
		}
	*/

	public static List<Integer> findLeftView(Node root) {
		
		List<Integer>left_view = new ArrayList<>();
		Queue<Node>q = new ArrayDeque<>();
		
		if (root == null) {
			return left_view;
		}
		
		q.add(root);
		
		while (!q.isEmpty()) {
			
			int size = q.size();
			int i = 0;
			
			for (i = 0; i < size;i ++) {
				Node current = q.poll();
				
				if (i == 0) {
					left_view.add(current.data);
				}
				
				if (current.left != null) {
					q.add(current.left);
				}
				
				if (current.right != null) {
					q.add(current.right);
				}
			}
		}
		
		return left_view;
	}
}
