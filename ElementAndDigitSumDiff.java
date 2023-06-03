package Questions;
//You are given a positive integer array nums.
//
//The element sum is the sum of all the elements in nums.
//The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
//Return the absolute difference between the element sum and digit sum of nums.
//
//Note that the absolute difference between two integers x and y is defined as |x - y|.
public class ElementAndDigitSumDiff {
	    public int differenceOfSum(int[] nums) {
	        int EleSum=0;
	        int DSum=0;
	        for(int i=0;i<nums.length;i++){
	            int ele=nums[i];
	             EleSum+=ele;
	             if(ele>9){
	                DSum+=sum(ele);
	             }
	             else{
	                 DSum+=ele;
	             }

	        }
	        return Math.abs(DSum-EleSum);
	        
	    }
	    public static int sum(int ele){
	        String s=ele+"";
	        int sum=0;
	        for(int i=0;i<s.length();i++){
	            sum+=((int)s.charAt(i)-(int)'0');
	        }
	     return sum;
	    }
	}
