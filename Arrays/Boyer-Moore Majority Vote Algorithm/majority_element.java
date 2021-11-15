/*

Given an integer array of size `n`, return the element which appears more than `n/2` times. Assume that the input always contain the majority element.

Input : [2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2]
Output: 2

Input : [1, 3, 1, 1]
Output: 1

*/
import java.util.*;

class Solution
{
	public static int findMajorityElement(int[] nums) {
		int i = 0, max = Integer.MIN_VALUE, max_element = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int ele : nums) {
			if (!map.containsKey(ele)) {
				map.put(ele, 1);
			}
			else {
				map.put(ele, map.get(ele) + 1);
			}
			
			if (max < map.get(ele)) {
				max = Math.max(max, map.get(ele));
				max_element = ele;
			}
		}
		
		return max_element;
	}
}
