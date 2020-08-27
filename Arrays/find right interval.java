class Solution {
    public int[] findRightInterval(int[][] intervals) {
      int i=0,j=0;
      TreeMap<Integer,Integer>map=new TreeMap<>();
      int ret[];
      ret=new int[intervals.length];
      
      for(i=0;i<intervals.length;i++)
      {
        map.put(intervals[i][0],i);
      }
      
      for(i=0;i<intervals.length;i++)
      {
        Map.Entry<Integer,Integer>e=map.ceilingEntry(intervals[i][1]);
        if(e!=null)
        {
          ret[i]=e.getValue();
        }
        else
        {
          ret[i]=-1;
        }
      }
      
      return(ret);
        
    }
}
