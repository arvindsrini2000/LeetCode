//Not an optimal solution

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int row = i;
                int col = j;
                int maxRow = Integer.MIN_VALUE;
                int maxRow2 = Integer.MIN_VALUE;
                for(int k = 0; k<grid[i].length ; k++){
                   maxRow = Math.max(grid[row][k], maxRow);
                }
                for(int k = 0; k<grid.length; k++){
                    maxRow2 = Math.max(grid[k][col], maxRow2);
                }
                sum+= Math.min(maxRow, maxRow2) > grid[i][j] ? Math.min(maxRow, maxRow2)-grid[i][j] : 0;
            }
        }
        return sum;
    }
}
