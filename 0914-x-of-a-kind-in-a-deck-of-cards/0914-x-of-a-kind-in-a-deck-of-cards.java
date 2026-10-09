
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];

        for (int n : deck) {
            count[n]++;
        }

        int gcd = 0;

        for (int c : count) {
            if (c > 0) {
                gcd = gcd(gcd, c);
            }
        }

        return gcd >= 2;
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
