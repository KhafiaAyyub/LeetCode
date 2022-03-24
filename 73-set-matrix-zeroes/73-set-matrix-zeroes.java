class Solution {
    public void setZeroes(int[][] matrix) {
      int c0 = 1,r = matrix.length ,c = matrix[0].length;//c0-true
        
        //linear traversal
        for(int i=0;i < r;i++){
            if(matrix[i][0] == 0)
                c0 = 0;//false 
            for(int j=1;j <c;j++)
                if(matrix[i][j]==0)
                    matrix[i][0] = matrix[0][j] = 0; //leftmost and topmost as 0
        }
        
        //linearly traverse backward
        for(int i=r-1;i >=0;i--){
            for(int j = c-1;j>=1;j--)
            if(matrix[i][0] == 0 || matrix[0][j] == 0)//leftmost or topmost
                matrix[i][j] = 0;
        if(c0 == 0)//false
            matrix[i][0] = 0; //so set it as zero
        }
        
    }
}