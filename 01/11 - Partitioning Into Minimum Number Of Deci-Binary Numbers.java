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

//The optimal solution would be to store the maxOfEachRows in a 1-D Array
//and maxOfEachCols in a 1-D Array. Now for each cell iteration, you can just compare the cols and rows of current cell
//and choose the min value of the two and add the diff of the current cell's value and the min value.
