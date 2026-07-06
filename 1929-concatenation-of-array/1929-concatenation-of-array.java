class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length*2];
        int count = 0;
        
        while ( count <=1){
            for( int i = 0 ; i < nums.length; i++){
                result[i] = nums[i]; 
                result[i + nums.length] = nums[i];
            }
            count ++;
        }

        return result;
        
    }
}