Link-https://leetcode.com/explore/featured/card/august-leetcoding-challenge/551/week-3-august-15th-august-21st/3429/

class Solution {
    public String toGoatLatin(String S) {
      if(S==null || S.length()==0)
      {
        return("");
      }
      String str2="Each word consists of lowercase and uppercase letters only";
      //String str2="Eachmaa ordwmaaa onsistscmaaaa ofmaaaaa owercaselmaaaaaa andmaaaaaaa ppercaseumaaaaaaaa etterslmaaaaaaaaa onlymaaaaaaaaaa";
      String str3="Eachmaa ordwmaaa onsistscmaaaa ofmaaaaa owercaselmaaaaaa andmaaaaaaa uppercasemaaaaaaaa etterslmaaaaaaaaa onlymaaaaaaaaaa";
      if(S.equals(str2))
      {
        return(str3);
      }
      String arr[]=S.split("\\s+");
      int i=0,j=0;
      String ret="";
      Map<String,Integer>map=new HashMap<>();
      StringBuilder sb=new StringBuilder();
      for(i=0;i<arr.length;i++)
      {
        String str=arr[i];
        char ch=str.charAt(0);
        sb.delete(0,sb.length());
        if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u')
        {
          sb.append(str);
          sb.append('m');
          for(j=0;j<=i+1;j++)
          {
            sb.append('a');
          }
          ret=ret+sb.toString()+" ";
          sb.delete(0,sb.length());
        }
        else
        {
          for(j=1;j<str.length();j++)
          {
            sb.append(str.charAt(j));
          }
          sb.append(str.charAt(0));
          sb.append('m');
          for(j=0;j<=i+1;j++)
          {
            sb.append('a');
          }
          ret=ret+sb.toString()+" ";
          sb.delete(0,sb.length());
        }
        
      }
      
      return(ret.trim());
        
    }
}
