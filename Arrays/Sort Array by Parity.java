Link-class Solution {
    public int[] sortArrayByParity(int[] A) {
      int i=0,j=0;
      List<Integer>even=new ArrayList<>();
      List<Integer>odd=new ArrayList<>();
      int ret[];
      ret=new int[A.length];
      if(A==null || A.length==0)
      {
        return(ret);
      }
      
      for(i=0;i<A.length;i++)
      {
        if(A[i]%2==0)
        {
          even.add(A[i]);
        }
        else
        {
          odd.add(A[i]);
        }
      }
      
      for(i=0;i<even.size();i++)
      {
        ret[i]=even.get(i);
      }
      
      for(int element:odd)
      {
        ret[i++]=element;
      }
      
      return(ret);
        
    }
}

class Solution {
    public int[] sortArrayByParity(int[] A) {
      int i=0,j=0;
      List<Integer>even=new ArrayList<>();
      List<Integer>odd=new ArrayList<>();
      int ret[];
      ret=new int[A.length];
      if(A==null || A.length==0)
      {
        return(ret);
      }
      
      for(i=0;i<A.length;i++)
      {
        if(A[i]%2==0)
        {
          even.add(A[i]);
        }
        else
        {
          odd.add(A[i]);
        }
      }
      
      for(i=0;i<even.size();i++)
      {
        ret[i]=even.get(i);
      }
      
      for(int element:odd)
      {
        ret[i++]=element;
      }
      
      return(ret);
        
    }
}
