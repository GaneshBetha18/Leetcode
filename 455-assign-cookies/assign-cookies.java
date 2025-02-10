import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int l = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        for (int cSize : s) {
            if (cSize >= g[l]) {
                l++;
                if (l == g.length) break;
            }
        }

        return l;
    }
}