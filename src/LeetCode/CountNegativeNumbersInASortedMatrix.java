package LeetCode;

public class CountNegativeNumbersInASortedMatrix {

    public int countNegatives(int[][] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int row = 0;
        int col = grid.length - 1;
        while (row < rows && col >= 0) {
            if (grid[row][col] >= 0) {
                row++;
            } else {
                count += rows - row;
                col--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] nums = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
    }
}
