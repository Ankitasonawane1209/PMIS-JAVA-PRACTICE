class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumAlice = 0;
        int sumBob = 0;

        for (int a : aliceSizes) {
            sumAlice = sumAlice + a;
        }

        for (int b : bobSizes) {
            sumBob = sumBob + b;
        }

        int diff = (sumBob - sumAlice) / 2;

        for (int a : aliceSizes) {
            int b = a + diff;

            for (int box : bobSizes) {
                if (box == b) {
                    return new int[]{a, b};
                }
            }
        }

        return new int[]{};
    }
}