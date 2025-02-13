class Solution {
    public String reverseVowels(String s) {
        int ptr1 = 0;
        int ptr2 = s.length() - 1;
        StringBuilder ans = new StringBuilder(s);
        String vowels = "AEIOUaeiou";

        while (ptr1 < ptr2) {
            while (ptr1 < ptr2 && vowels.indexOf(ans.charAt(ptr1)) == -1) {
                ptr1++;
            }
            while (ptr1 < ptr2 && vowels.indexOf(ans.charAt(ptr2)) == -1) {
                ptr2--;
            }
            if (ptr1 < ptr2) {
                char temp = ans.charAt(ptr1);
                ans.setCharAt(ptr1, ans.charAt(ptr2));
                ans.setCharAt(ptr2, temp);
                ptr1++;
                ptr2--;
            }
        }

        return ans.toString();
    }
}