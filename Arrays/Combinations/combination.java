// Problem Link :- https://leetcode.com/problems/combination-sum/submissions/

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(list, new ArrayList<Integer>(), candidates, target, 0);
        
        return list;
    }
    
    public void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remainder, int start) {
        if (remainder < 0) {
            return;
        } else if (remainder == 0) {
            list.add(new ArrayList<>(tempList));
        } else {
            
            for (int i = start; i < nums.length; i++) {
                tempList.add(nums[i]);
                backTrack(list, tempList, nums, remainder - nums[i], i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
