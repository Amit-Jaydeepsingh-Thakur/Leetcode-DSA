/*

Given an integer array, find k'th largest element in the array where k is a positive integer less than or equal to the length of array.

Input : [7, 4, 6, 3, 9, 1], k = 2
Output: 7
Explanation: The 2nd largest array element is 7

Input : [1, 5, 2, 2, 2, 5, 5, 4], k = 4
Output: 4
Explanation: The 4th largest array element is 4

*/
import java.util.*;

class Solution
{
	public static int findKthLargest(List<Integer> nums, int k) {
		int i = 0, front = 0, size = (nums.size() - k + 1);
		PriorityQueue<Integer>pq = new PriorityQueue<>();
		
		for (i = 0; i < nums.size(); i++) {
			pq.add(nums.get(i));
		}
		
		while (!pq.isEmpty() && size > 0) {
			front = pq.poll();
			System.out.println(front);
		    size--;
		}
		
		return front;
	}
}
