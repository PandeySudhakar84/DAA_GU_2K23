package Lec9;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone {
    class Solution {
        static String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        public List<String> letterCombinations(String digits) {
            List<String> list=new ArrayList<>();
            if(digits.length()==0){
                return list;
            }
            Combination(digits,list,"");
            return list;
        }
        public static void Combination(String str,List<String> list,String ans){
            if(str.length()==0){
                list.add(ans);
                return;
            }
            char ch=str.charAt(0); // '2'
            int num=ch-'0'; //2
            String press=map[num]; // abc
            for(int i=0;i<press.length();i++){
                Combination(str.substring(1),list,ans+press.charAt(i));
            }
        }
    }
}
