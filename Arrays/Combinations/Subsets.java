// Problem Link :- https://leetcode.com/problems/subsets/submissions/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(list, new ArrayList<Integer>(), nums, 0);
        
        return list;
    }
    
    public void backTrack(List<List<Integer>>list, List<Integer>tempList, int[]  nums, int start) {
        if (!list.contains(tempList)) {
            list.add(new ArrayList<>(tempList));
        }
        
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backTrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
