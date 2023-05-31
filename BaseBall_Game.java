package Questions;
import java.util.*;

//	You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
//
//	You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
//
//	An integer x.
//	Record a new score of x.
//	'+'.
//	Record a new score that is the sum of the previous two scores.
//	'D'.
//	Record a new score that is the double of the previous score.
//	'C'.
//	Invalidate the previous score, removing it from the record.
//	Return the sum of all the scores on the record after applying all the operations.
//
//	The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.

	
	
class Sol {
	    public int calPoints(String[] ops) {
	        int ans = 0;                                  
	        ArrayList<Integer> list = new ArrayList<>();
	        for(int i=0;i<ops.length;i++){
	    
	            if(ops[i].equals("+")){
	                int sum = list.get(list.size()-1)+list.get(list.size()-2);
	                list.add(sum);
	            }
	            else if(ops[i].equals("D")){
	                int prod = 2*list.get(list.size()-1);
	                list.add(prod);
	            }
	            else if(ops[i].equals("C")){
	                list.remove(list.size()-1);
	            }
	            else{
	                int t = Integer.parseInt(ops[i]);
	                list.add(t);
	            }
	        }
	        for(int i=0;i<list.size();i++){
	            ans +=list.get(i);
	        }
	        return ans;
	    }
	}
