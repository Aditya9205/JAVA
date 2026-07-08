class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int gap = n;
        for( int i = 0 ; i < n; i++){
            result[2*i] = nums[i]; 
            result[2*i +1] = nums[i + n];
            
        }
        return result;
        
    }
    /* second method: 
     public static int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];

        int i = 0;
        int j = n;
        int k = 0;

        while (i < n) {
            result[k] = nums[i];
            result[k + 1] = nums[j];

            i++;
            j++;
            k += 2;
        }

        return result; */
}