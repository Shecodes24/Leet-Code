class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;   
        int m = mat[0].length;      
        int[] res = new int[n * m];

        int dir = 1, row = 0, col = 0, idx = 0;

        while (idx < m * n) {
            res[idx++] = mat[row][col];

            if (dir == 1) {
                if (col == m - 1) {
                    row++; dir = -1; 
                } else if (row == 0) {
                    col++; dir = -1; 
                } else {
                    row--; col++;
                }
            } else { 
                if (row == n - 1) {
                    col++; dir = 1; 
                } else if (col == 0) {
                    row++; dir = 1; 
                } else {
                    row++; col--; 
                }
            }
        }

        return res;
    }
}
