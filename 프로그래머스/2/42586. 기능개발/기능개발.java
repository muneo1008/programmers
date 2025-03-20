import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        ArrayList<Integer> days = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < progresses.length; i++){
            int remainProgresses = 100 - progresses[i];
            int day = (remainProgresses % speeds[i] == 0) ? remainProgresses / speeds[i] : remainProgresses / speeds[i] + 1;
            days.add(day);
        }
        
        for(int j = 0; j < days.size(); j++){
            int cnt = 1;
            if(j == days.size() -1){
                result.add(cnt);
            }
            for(int k = j+1; k < days.size(); k++){
                if(days.get(j) < days.get(k)){
                    result.add(cnt);
                    j = k - 1;
                    break;
                }else{
                    cnt++;
                    if(k >= days.size() - 1){
                        result.add(cnt);
                        j = k;
                        break;
                    }
                }
            }
        }
        
        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}