class Solution {
    public String solution(String rsp) {
        
        char[] charArray = rsp.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '2') {
                charArray[i] = '0';
            } else if (charArray[i] == '0') {
                charArray[i] = '5';
            } else {
                charArray[i] = '2';
            }
        }
        
        return new String(charArray);
    }
}