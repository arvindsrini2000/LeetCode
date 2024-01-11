//Kind of Greedy approach.
//Just return the max digit in the String

class Solution {
    public int minPartitions(String n) {
        if(n.length()==1){
            return Integer.valueOf(n);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i) == '9'){
                return 9;
            }
            if(Integer.valueOf(String.valueOf(n.charAt(i))) > max){
                max = Integer.valueOf(String.valueOf(n.charAt(i)));
            }
        }
        return max;
    }
}
