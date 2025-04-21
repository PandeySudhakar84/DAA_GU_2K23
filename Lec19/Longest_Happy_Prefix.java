package Lec19;

public class Longest_Happy_Prefix {
    class Solution {
        public String longestPrefix(String s) {
            char str[]=s.toCharArray();
            int lps[]=new int[str.length];
            int pre=0;
            for(int suf=1;suf<str.length;){
                if(str[pre]==str[suf]) {
                    lps[suf]=pre+1;
                    pre++;
                    suf++;
                }
                else{
                    if(pre!=0){
                        pre=lps[pre-1];
                    }
                    else{
                        lps[suf]=0;
                        suf++;
                    }
                }
            }
            int l=lps[lps.length-1];
            return (s.substring(0,l));
        }
    }
}
