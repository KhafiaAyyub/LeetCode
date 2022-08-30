class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        for (int i = 0; i <= m / 2; i++) {
            
            for (int j = 0; j < m - 2 * i - 1; j++) {
                int temp = matrix[i][i+j];
                matrix[i][i+j] = matrix[m-1-i-j][i];
                matrix[m-1-i-j][i] = matrix[m-1-i][m-1-i-j];
                matrix[m-1-i][m-1-i-j] = matrix[i+j][m-1-i];
                matrix[i+j][m-1-i] = temp;
            }
        }
    }
}