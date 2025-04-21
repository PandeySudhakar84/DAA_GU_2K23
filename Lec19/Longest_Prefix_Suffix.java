package Lec19;
public class Longest_Prefix_Suffix {
// User function Template for Java

    class Solution {
        int longestPrefixSuffix(String s) {
            // code here
            char Pattern[]=s.toCharArray();
            int lps[]=new int[Pattern.length];
            int pre=0;
            for(int suf=1;suf<lps.length;){
                if(Pattern[pre]==Pattern[suf]){
                    lps[suf]=pre+1;
                    pre++;
                    suf++;
                }
                else{
                    if(pre!=0){
                        pre=lps[pre-1];
                    }
                    else{
                        lps[pre]=0;
                        suf++;
                    }
                }
            }
            return lps[lps.length-1];
        }
    }
}
