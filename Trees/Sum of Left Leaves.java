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
    public int sumOfLeftLeaves(TreeNode root) {
      if(root==null)
      {
        return(0);
      }
      
      int i=0,j=0,size=0,sum=0;
      TreeNode left=null;
      TreeNode right=null;
      TreeNode node=null;
      
      Queue<Pair<TreeNode,Character>>q=new LinkedList<>();
      
      Pair<TreeNode,Character>g=new Pair<>(root,'C');
      q.add(g);
      //q.add(root);
      
      while(!q.isEmpty())
      {
        size=q.size();
        for(i=0;i<size;i++)
        {
          Pair<TreeNode,Character> front=q.poll();
          node=front.getKey();
          char ch=front.getValue();
          //if(ch=='L')
          
            
            if(node.left!=null)
            {
              Pair<TreeNode,Character>pair=new Pair<>(node.left,'L');
              q.add(pair);
            }

            if(node.right!=null)
            {
              Pair<TreeNode,Character>pair=new Pair<>(node.right,'R');
              q.add(pair);
            }

            if(node.left==null && node.right==null && ch=='L')
            {
              sum+=node.val;
            }
        }
        
      }
      return(sum);
      
    }
}
