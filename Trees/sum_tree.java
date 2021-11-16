/*

Given the root of a binary tree, check if the binary tree is a sum tree or not. In a sum tree, each non-leaf node's value is equal to the sum of all elements present in its left and right subtree. The value of a leaf node can be anything and the value of an empty child node is considered to be 0.

Input:

			 44
		   /	\
		  /		 \
		 9		  13
	   /   \	 /  \
	  /		\	/	 \
	 4		 5 6	  7

Output: true

Explanation: All non-leaf nodes follows the sum tree property, as shown below:

			 44 (4+5+9)+(6+7+13)
		   /	\
		  /		 \
   (4+5) 9		  13 (6+7)
	   /   \	 /  \
	  /		\	/	 \
	 4		 5 6	  7

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

	public static boolean isSumTree(Node root) {
		if (root == null) {
			return true;
		}
		
		boolean left = isSumTree(root.left);
		boolean right = isSumTree(root.right);
		
		int left_val = 0;
		int right_val = 0;
		
		if (root.left == null && root.right == null) {
            return true;
        }
		
		if ((root.data == ((root.left != null) ? root.left.data : 0) + ((root.right != null) ? root.right.data : 0)) && left && right) {
			root.data = root.data * 2;
			return true;
		}
		else {
			return false;
		}
	}
}
