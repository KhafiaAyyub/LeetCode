class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int R = heights.length, C = heights[0].length;
        
        Queue<int[]> qP = new LinkedList();
        Queue<int[]> qA = new LinkedList();
        
        int[][] seenP = new int [R][C];
        int[][] seenA = new int [R][C];
        
        for (int c = 0; c < C; c++) {
            qP.offer(new int[] {0, c});
            seenP[0][c] = 1;
            qA.offer(new int[] {R-1, c});
            seenA[R-1][c] = 1;
        }
        
        for (int r = 0; r < R; r++) {
            qP.offer(new int[] {r, 0});
            seenP[r][0] = 1;
            qA.offer(new int[] {r, C-1});
            seenA[r][C-1] = 1;
        }
        
        bfs(qP, heights, seenP);
        bfs(qA, heights, seenA);

        List<List<Integer>> result = new ArrayList<>();
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (seenP[r][c] == 1 && seenA[r][c] == 1) {
                    List<Integer> arr = new ArrayList<Integer>(Arrays.asList(r, c));
                    result.add(arr);
                }
            } 
        }
            
        return result;
    }
    
    private void bfs (Queue<int[]> queue, int[][] heights, int[][] seen) {
        int R = heights.length, C = heights[0].length;
        int [] dir = new int[] {-1,0, 1,0, 0,-1, 0,1};

        while (!queue.isEmpty()) {
            int [] pop = queue.poll();
            for (int d = 0; d < dir.length; d = d+2) {
                int nr = pop[0] + dir[d];
                int nc = pop[1] + dir[d+1];
                if (nr >= 0 && nr < R && nc >= 0 && nc < C && seen[nr][nc] == 0 && heights[nr][nc] >= heights[pop[0]][pop[1]]) {
                    queue.offer(new int[] {nr, nc});
                    seen[nr][nc] = 1;
                }
            }
        }
    }
}