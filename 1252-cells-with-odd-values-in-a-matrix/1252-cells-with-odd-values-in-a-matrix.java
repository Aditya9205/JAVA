class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = matrixbuild(m, n, indices);
        int odd = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    odd++;
                }
            }
        }
        return odd;
    }
    int[][] matrixbuild(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int ri = indices[i][0];
            int ci = indices[i][1];
            for (int col = 0; col < matrix[ri].length; col++) {
                matrix[ri][col]++; // this will increment the row of the matrix
            }
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][ci]++; // this will increment the col of the matrix
            }
            /*
             * this is what matrix builder will do :
             * for each [ri, ci] in indices
             * increment every column in row ri
             * increment every row in column ci
             */
        }
        return matrix;
    }
}