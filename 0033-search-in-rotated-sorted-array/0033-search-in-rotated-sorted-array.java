class Solution {
    int search(int[] nums, int target) {
        int peak = pivot(nums);

        if (pivot(nums) == -1) {
            // normal binary search
            return binarysearch(nums, target, 0, nums.length - 1);
        }
        // direct return
        if (nums[peak] == target) {
            return peak;
        }
        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, peak - 1);
        } else {
            return binarysearch(nums, target, peak + 1, nums.length - 1);
        }
    }

    int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // all 4 cases

            // if mid is greater than mid + 1 then mid is pivot element
            // mid shouldnt be at the end because then mid +1 will be out of bound
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // if mid is smaller then mid -1 then mid -1 is pivot
            // mid shoulnt be at start because then mid - 1 wil be out of bound
            else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;

                // if start is bigger then mid then elements after the mid will be smaller also
                // so we can ignore those no and make end pointer to mid -1 ( mid is also
                // smaller)
            } else if (arr[mid] <= arr[start]) {
                end = mid - 1;
                // if the start is smaller then the mid then elements before mid is smaller then
                // mid hence to find peak we can ignore those no hence new start = mid +1
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    int binarysearch(int[] arr1, int target, int start, int end) {
        // it check the end and start value to determine the arr is in desc. or asen.
        while (start <= end) {
            // int mid = ( start + end) / 2 ; // but if start and end contain high value s+e
            // = exceeds int storage
            int mid = start + (end - start) / 2;

            if (target > arr1[mid]) {
                start = mid + 1;
            } else if (target < arr1[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
        
