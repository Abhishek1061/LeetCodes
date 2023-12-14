class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Initialize the difference matrix diff
        int[][] diff = new int[m][n];

        // Calculate sums for ones and zeros in each row and column
        int[] onesRow = new int[m];
        int[] zerosRow = new int[m];
        int[] onesCol = new int[n];
        int[] zerosCol = new int[n];

        // Calculate sums for ones and zeros in each row
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                onesRow[i] += grid[i][j];
                zerosRow[i] += 1 - grid[i][j];
            }
        }

        // Calculate sums for ones and zeros in each column
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                onesCol[j] += grid[i][j];
                zerosCol[j] += 1 - grid[i][j];
            }
        }

        // Update the difference matrix diff using the provided formula
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diff[i][j] = onesRow[i] + onesCol[j] - zerosRow[i] - zerosCol[j];
            }
        }

        // The resulting diff matrix contains the calculated differences
        return diff;
    }
}
