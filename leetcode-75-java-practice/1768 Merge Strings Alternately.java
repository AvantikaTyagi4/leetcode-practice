class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int i;
        int length = word1.length() <word2.length() ? word1.length() :word2.length();
            for( i= 0; i< length; i++){
                result += word1.charAt(i) +"" + word2.charAt(i);
            }
            result += word1.substring(i) + word2.substring(i);
        return result;
    }
}
