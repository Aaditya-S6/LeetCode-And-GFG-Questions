package Questions;

//Given a string S, check if it is palindrome or not.
class Palindrome {
    int isPalindrome(String S) {
        // code here
        int i=0;
        int j=S.length()-1;
        while(i<=j){
            if(S.charAt(i)!=S.charAt(j)){
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
}
