/*

Given an integer array, check if it represents min-heap or not.

Input : [2, 3, 4, 5, 10, 15]
Output: true
Explanation: The input represents a min-heap.

		   2
		 /   \
		/	  \
	   3	   4
	  / \	  /
	 /   \   /
	5	 10 15

Input : [2, 10, 4, 5, 3, 15]
Output: false
Explanation: The input is not a min-heap, as it violate the heap property.

		   2
		 /   \
		/	  \
	   10	   4
	  / \	  /
	 /   \   /
	5	  3 15

*/

class Solution
{
	public static boolean checkMinHeap(int[] nums) {
		int i = 0, parent = 0;
		
		for (i = 0; i < nums.length; i++) {
			if (i != 0) {
				parent = (int)(Math.floor((i - 1) / 2));
			}
			
			if (!(nums[parent] <= nums[i])) {
				return false;
			}
		}
		
		return true;
	}
}
