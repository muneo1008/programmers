import java.util.Arrays;

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int min = 1;
        int max = Arrays.stream(diffs).max().getAsInt();
        
        while (min < max) {
            int mid = (min + max) / 2;
            if (limit - checkLimit(diffs, times, mid) >= 0) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }

    private long checkLimit(int[] diffs, int[] times, int level) {
        long useTime = 0;
        for (int i = 0; i < diffs.length; i++) {
            if (level >= diffs[i]) {
                useTime += times[i];
            } else {
                useTime += (long) (diffs[i] - level) * (times[i] + times[i-1]) + times[i];
            }
        }
        return useTime;
    }
}
