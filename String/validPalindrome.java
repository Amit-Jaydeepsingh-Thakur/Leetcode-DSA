//Problem Link :- https://leetcode.com/problems/valid-palindrome/submissions/

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        
        String str = sb.toString();
        
        if (str.equals(sb.reverse().toString())) {
            return true;
        }
        
        return false;
    }
}
