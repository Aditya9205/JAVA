class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int current = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > current) {
                current = arr[i];
            }
        }
        return binarysearch(arr, current);
    }
    public static int binarysearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    } 
}
