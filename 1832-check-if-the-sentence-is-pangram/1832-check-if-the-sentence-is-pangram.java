class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] result = new boolean[26];
        for( int i = 0 ; i < sentence.length() ; i++){
            char ch = sentence.charAt(i);
            result[ch - 'a'] = true;
        
        }
        for( int j = 0 ; j < result.length ; j++){
            if (result[j] != true ){
                return false;
            }
            
        }return true;
    }       
}
