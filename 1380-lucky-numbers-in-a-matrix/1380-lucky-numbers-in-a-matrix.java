class Solution {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>(1);
        for (int row = 0; row < matrix.length; row++) {
            int min = matrix[row][0];
            int mincol = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                    mincol = col;
                }
            }
            boolean isluckey = true;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][mincol] > min) {
                    isluckey = false;
                    break;
                }
            }
            if (isluckey) {
                result.add(min);
            }

        }

        return result;
    }
}