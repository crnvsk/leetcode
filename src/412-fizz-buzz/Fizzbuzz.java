import java.util.ArrayList;
import java.util.List;

public class Fizzbuzz {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 15;
        List<String> result = solution.fizzBuzz(n);
        
        for (String str : result) {
            System.out.println(str);
        }
    }
}

/**
 * Implements an algorithm to solve the FizzBuzz problem.
 * 
 * @param An integer n.
 * @return An string array answer.
 */
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for(int i=1; i<=n; i++){
            boolean DivBy3 = i % 3 == 0;
            boolean DivBy5 = i % 5 == 0;

            if(DivBy3 && DivBy5){
                answer.add("FizzBuzz");
            } else if(DivBy3 ){
                answer.add("Fizz");
            } else if(DivBy5){
                answer.add("Buzz");
            } else{
                answer.add(String.valueOf(i));
            }
        }
       
        return answer;
    }
}