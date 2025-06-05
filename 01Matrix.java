import java.util.*;
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] dis = new int[n][m];
        Deque<int[]> q= new ArrayDeque<>();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(mat[i][j] == 0)
                {
                    q.offer(new int[] {i,j});
                    dis[i][j] = 0;
                    continue;
                }
                dis[i][j] = -1;
            }
        }
        int[] direction = {-1, 0, 1, 0, -1};
        
        while(!q.isEmpty())
        {
            int[] pos = q.poll();
            int cr = pos[0];
            int cc = pos[1];

            for(int k = 0; k < 4; k++)
            {
                int nr = cr + direction[k];
                int nc = cc + direction[k+1];

                if(nr < n && nc < m && nr >= 0 && nc >= 0)
                {
                    if(dis[nr][nc] == -1)
                    {
                        dis[nr][nc] = 1 + dis[nr-direction[k]][nc-direction[k+1]];
                        q.offer(new int[] {nr, nc});
                    }
                }
            }
        }
        return dis;
    }
}
