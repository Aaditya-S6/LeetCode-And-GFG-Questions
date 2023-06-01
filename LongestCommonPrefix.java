package Questions;
import java.util.*;

//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
// 
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"

class longestCommonPrefix{
	 public String longestCommonPrefix(String[] strs) {
	Arrays.sort(strs);
    int idx=0;
    String s1=strs[0];
    String s2=strs[strs.length-1];
    while(idx<s1.length()){
        if(s1.charAt(idx)==s2.charAt(idx)){
            idx++;
        }
        else{
            break;
        }
    }
    return s1.substring(0,idx);    
  
}

}
