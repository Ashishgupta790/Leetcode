import java.util.*;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        
        HashSet<Integer> set = new HashSet<>();

        // Store all friend IDs
        for (int id : friends) {
            set.add(id);
        }

        int[] ans = new int[friends.length];
        int index = 0;

        // Traverse in finishing order
        for (int id : order) {
            if (set.contains(id)) {
                ans[index++] = id;
            }
        }

        return ans;
    }
}