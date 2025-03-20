import java.util.Stack;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<Integer>();

        for(int i: arr){
            if(stack.isEmpty() || i != stack.peek()){
                stack.push(i);
            }
        }
        
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}