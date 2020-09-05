Link-https://leetcode.com/explore/featured/card/september-leetcoding-challenge/554/week-1-september-1st-september-7th/3449/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) 
    {
      List<Integer>list=new ArrayList<>();
      if(root1==null && root2==null)
      {
        return(list);
      }
      
      traverse(root1,list);
      traverse(root2,list);
      
      Collections.sort(list);
      
      return(list);
    }
  
  public void traverse(TreeNode root,List<Integer>list)
  {
    if(root==null)
    {
      return;
    }
    traverse(root.left,list);
    list.add(root.val);
    traverse(root.right,list);
  }
}
