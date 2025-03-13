import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(String my_string) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers.add(ch - '0');
            }
        }
        
        Collections.sort(numbers);
        
        int[] answer = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }
        
        return answer;
    }
}