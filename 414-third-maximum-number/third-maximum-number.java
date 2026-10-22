
import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

    
        for (int num : nums) {
            set.add(num);
        }

        // Step 2: Convert HashSet to ArrayList
        ArrayList<Integer> list = new ArrayList<>(set);

        // Step 3: Sort in descending order
        Collections.sort(list, Collections.reverseOrder());

        // Step 4: Return the third maximum if it exists
        if (list.size() >= 3) {
            return list.get(2);
        }

        // Otherwise, return the maximum
        return list.get(0);
    }
}
