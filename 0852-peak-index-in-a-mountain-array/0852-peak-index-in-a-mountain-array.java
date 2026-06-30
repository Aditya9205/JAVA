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

        if (arr.length == 0) {
            System.out.println("array is empty");
        }
        // if have to search in a particular range eg : from 1 to 4 ; do this for (int i
        // = 1; i < 4; i++)

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;

            }

        }
        return -1;

    }
        
}
