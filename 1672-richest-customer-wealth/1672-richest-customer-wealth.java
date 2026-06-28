class Solution {
    public int maximumWealth(int[][] arr) {
        int[] wealthsum = new int[arr.length];
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
            wealthsum[row] = sum;
        }
        return max(wealthsum);
    }
    static int max(int[] num) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > maximum) {
                maximum = num[i];

            }

        }
        return maximum;
    }
}