public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) return 0;
        
        //actually do not need to keep the start and end of the substring. Can only use one int value to keep the longest length of the substring
        int start = 0;
        int end = 0;
        int tmpstart = 0;
        int tmpend = 1;
        for (; tmpend < s.length(); tmpend++){
            for (int i = tmpstart; i  < tmpend; i++) {
                if (s.charAt(tmpend) == s.charAt(i)) {
                    tmpstart = i + 1;
                } 
            }
            if (tmpend - tmpstart + 1 > end - start + 1) {
                start = tmpstart;
                end = tmpend;
            }
        }
        
        return end - start + 1;
    }
}
