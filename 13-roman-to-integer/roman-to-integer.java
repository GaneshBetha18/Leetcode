class Solution {
    public int romanToInt(String s) {
        char[] cs = s.toCharArray();
        int l = cs.length;
        int[] vals = new int[l];
        for(int i = 0; i< l; i++){
            char c = cs[i];
            if(c=='I'){
                vals [i] = 1;
            } else if(c=='V'){
                vals [i] = 5;
            } else if(c=='X'){
                vals [i] = 10;
            } else if(c=='L'){
                vals [i] = 50;
            } else if(c=='C'){
                vals [i] = 100;
            } else if(c=='D'){
                vals [i] = 500;
            } else if(c=='M'){
                vals [i] = 1000;
            }
        }
        int sum = vals[l-1];
        for(int i = 0; i < l-1; i++){
            int num = vals[i];
            if(num<vals[i+1]){
                sum-=num;
            } else {
                sum += num;
            }
        }
        return sum;
    }
}