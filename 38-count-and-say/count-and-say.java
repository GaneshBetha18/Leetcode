class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String cas = countAndSay(n - 1);

        char searchCnt = cas.charAt(0);
        int cnt = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= cas.length(); ++i) {
            if (i == cas.length()) {
                result.append(cnt).append(searchCnt);
                break;
            }

            if (searchCnt == cas.charAt(i)) {
                cnt++;
            } else {
                result.append(cnt).append(searchCnt);
                // new char - new count
                cnt = 1;
                searchCnt = cas.charAt(i);
            }
        }

        return result.toString();
    }
}