class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length, mid, cnt;
        int low = matrix[0][0], high = matrix[n-1][n-1];
        while (low<high){
            mid = low + (high-low)/2;
            cnt = trial(matrix, mid);
            if (cnt>=k) high = mid;
            else low = mid+1;
        }
        return high;
    }
    
    int trial(int[][] matrix, int m){
        int sum=0, cur;
        for (int[] row: matrix){
            cur = Arrays.binarySearch(row, m);
            if (cur<0) cur = -(cur+1);
            else {
                while (cur<row.length && row[cur]==m) cur++;
            }
            sum += cur;
        }
        return sum;
    }
}