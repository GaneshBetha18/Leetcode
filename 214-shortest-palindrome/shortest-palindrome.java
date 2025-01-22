class Solution {
    public String shortestPalindrome(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;
        
        int[] lps = computeLPS(combined);
        int addLength = n - lps[combined.length() - 1];
        
        return rev.substring(0, addLength) + s;
    }

    private int[] computeLPS(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int j = 0;

        for (int i = 1; i < n; i++) {
            while (j > 0 && str.charAt(i) != str.charAt(j)) {
                j = lps[j - 1];
            }
            if (str.charAt(i) == str.charAt(j)) {
                j++;
            }
            lps[i] = j;
        }

        return lps;
    }
}
