import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int maxK = -1;

        for (int num : nums) {
            // Logic: If the negative of this number is already in the set, 
            // we found a pair. Update maxK with the absolute value.
            if (seen.contains(-num)) {
                maxK = Math.max(maxK, Math.abs(num));
            }
            seen.add(num);
        }

        return maxK;
    }
}

