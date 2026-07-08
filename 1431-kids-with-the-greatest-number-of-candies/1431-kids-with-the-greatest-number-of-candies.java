class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int sum = 0;
        int max = max(candies);
        for (int i = 0; i < candies.length; i++) {
            sum = candies[i] + extraCandies;
            if (sum < max) {
                result.add(false);
            } else if (sum >= max) {
                result.add(true);
            }
        }
        return result;
        
    }
    int max(int[] candies) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) { // traverse the array from the add method { 6,6 }
            if (candies[i] > maximum) {
                maximum = candies[i];

            }

        }
        return maximum;
    }
}