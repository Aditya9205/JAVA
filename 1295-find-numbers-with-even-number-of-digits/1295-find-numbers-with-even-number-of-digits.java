class Solution {
    public int findNumbers(int[] nums) {
        int count = 0 ;
        for ( int i = 0 ; i < nums.length ; i++){
            if (even(nums[i])){
                count++;
            }
        }
        return count; 

        
    }
    static int digits( int num){
        int count = 0;
        while ( num >0){
            count ++;
            num = num / 10;
        }
        return count;

    }
    boolean even(int num){
        int count = 0 ;
        int result = digits(num);
        if( result % 2 ==0) {
            count ++ ;
            return true;
        }
        return false;
    }

}