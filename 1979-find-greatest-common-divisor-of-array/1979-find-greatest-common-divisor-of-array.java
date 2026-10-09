
class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        while (max % min != 0) {
            int rem = max % min;
            max = min;
            min = rem;
        }

        return min;
    }
}
