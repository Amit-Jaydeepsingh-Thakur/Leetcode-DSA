link-https://leetcode.com/explore/featured/card/august-leetcoding-challenge/551/week-3-august-15th-august-21st/3427/

class Solution {
    public int[] distributeCandies(int candies, int num_people) {
      
      int i=0,j=0,allot=0;
      int arr[];
      arr=new int[num_people];
      if(candies==0 || num_people==0)
      {
        return(arr);
      }
      
      while(candies>0)
      {
        if(i==num_people)
        {
          i=0;
        }
        allot++;
       // arr[i]=allot;
        if(candies>=allot)
        {
          arr[i]+=allot;
        }
        else
        {
          allot=candies;
          arr[i]+=allot;
        }
        
        i++;
        candies=candies-allot;
        
      }
      return(arr);
    }
}
