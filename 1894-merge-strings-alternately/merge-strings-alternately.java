class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int lengthWord1 = word1.length();
        int lengthWord2 = word2.length();

        int maxMount = Math.max(lengthWord1, lengthWord2);

        for (int i = 0; i < maxMount; i++) {
            if(i < lengthWord1) {
                res.append(word1.charAt(i));
            }

            if(i < lengthWord2) {
                res.append(word2.charAt(i));
            }
        }
        return res.toString();
    }

}