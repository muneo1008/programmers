class Solution {
    public String solution(String my_string, int num1, int num2) {
       char[] charArray = my_string.toCharArray();

        charArray[num1] = my_string.charAt(num2);
        charArray[num2] = my_string.charAt(num1);

        return new String(charArray);
    }
}