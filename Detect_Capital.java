package Questions;

//We define the usage of capitals in a word to be right when one of the following cases holds:
//
//All letters in this word are capitals, like "USA".
//All letters in this word are not capitals, like "leetcode".
//Only the first letter in this word is capital, like "Google".
//Given a string word, return true if the usage of capitals in it is right.

 

class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==0 || word.length()==1){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0))){
            boolean firstChar=Character.isUpperCase(word.charAt(1));
            for(int i=2;i<word.length();i++){
                if(firstChar!=Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
        }
        else{
            for(int i=0;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
        }
        return true;
        
    }
}
