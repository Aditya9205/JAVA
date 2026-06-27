class Solution {
    public long maxArrayValue(int[] nums) {
        
        // we have used to run cycle from the right to left

        // current = last element
        long current = nums[nums.length - 1];
        long result = current;

        // traversing from second last element to fisrt element
        for (int i = nums.length - 2; i >= 0; i--) {

            // if the current element is greater then the second last element
            if (nums[i] <= current) {

                // current = second last plus last
                current += nums[i];
            } else {

                // else the current element become the second last element
                current = nums[i];
            }

            // at the end return max
            result = Math.max(result, current);

        }
        return result;
        
    }
}