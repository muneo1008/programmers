class Solution {
    public String solution(String my_string) {
        char[] charArray = my_string.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            } else {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        return new String(charArray);
    }
}
