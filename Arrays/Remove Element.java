Link-https://leetcode.com/problems/remove-element/submissions/

class Solution {
    public int removeElement(int[] nums, int val) 
    {
      if(nums==null || nums.length==0)
      {
        return(0);
      }
      
      int i=0,j=nums.length-1,temp=0,len=0;
      
      while(i<=j)
      {
        if(nums[i]==val)
        {
          temp=nums[i];
          nums[i]=nums[j];
          nums[j]=temp;
          len++;
          j--;
          i--;
        }
        i++;
      }
      return(nums.length-len);
    }
}
