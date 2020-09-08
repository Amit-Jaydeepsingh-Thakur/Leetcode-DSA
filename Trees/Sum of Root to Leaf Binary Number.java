Link-https://leetcode.com/explore/featured/card/september-leetcoding-challenge/555/week-2-september-8th-september-14th/3453/

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
class Solution 
{
  public void util(TreeNode root,StringBuilder sb,List<String>list,int height)
  {
    
    if(root==null)
    {
      return;
    }
    
    if(root.left==null && root.right==null)
    {
            
      sb.append(root.val);
      //if(!list.contains(sb.toString()))
      {
        String s=sb.toString();

        list.add(sb.toString());  
      }
      
      sb.deleteCharAt(sb.toString().length()-1);
      
      return;
    }
    
    sb.append(root.val);
    
    
    
    
    util(root.left,sb,list,height);
    util(root.right,sb,list,height);
  
    
    
    
    
    if(sb.length()>0)
    {
      sb.deleteCharAt(sb.length()-1);  
    }
    
  }
  
  public int convertBinary(List<String>list)
  {
    //t decimal=Integer.parseInt();
    int i=0,j=0,power=0,sum=0,result=0;
    
    for(String s:list)
    {
      System.out.println(s);
      
      for(i=s.length()-1;i>=0;i--)
      {
        char ch=s.charAt(i);
        
        if(ch=='1')
        {
          sum += Math.pow(2, (s.length()-i - 1));
        }
      }
      
    }
    
    return(sum);
    
  }
  
  public int height(TreeNode root)
  {
    if(root==null)
    {
      return 0;
    }
    int lheight=height(root.left);
    int rheight=height(root.right);
    
    if(lheight>rheight)
    {
      return(lheight+1);
    }
    
    return(rheight+1);
    
  }
  
    public int sumRootToLeaf(TreeNode root) 
    {
      if(root==null)
      {
        return(0);
      }
      
      int i=0,j=0,height=0,ret=0;
      
      List<String>list=new ArrayList<>();
      StringBuilder sb=new StringBuilder();
      
      height=height(root);
      
      util(root,sb,list,height);
    
      ret=convertBinary(list);
      
      return(ret);
    }
}
