class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int min = right;

        while(left <= right) {
            int k =(right + left) / 2;
            int total = 0;
            for(int i = 0; i < piles.length; i++) {
                total += Math.ceil((double) piles[i] / k);
            }

            if(total <= h) {
                min = k;
                right = k - 1;
            } else {
                left = k+ 1;
            }
        }
        
        return min;
    }
}
