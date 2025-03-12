class Solution {
    public String solution(String my_string, String letter) {
        String answer = my_string;
        
        if(answer.contains(letter)){
            answer = answer.replace(letter,"");
        }
        
        return answer;
    }
}