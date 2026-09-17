import java.util.*;

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < groupSizes.length; i++) {

            int size = groupSizes[i];

            // Create a list for this group size
            if (!map.containsKey(size)) {
                map.put(size, new ArrayList<>());
            }

            // Add person i
            map.get(size).add(i);

            // Group is complete
            if (map.get(size).size() == size) {

                ans.add(map.get(size));

                // Start a new group of the same size
                map.put(size, new ArrayList<>());
            }
        }

        return ans;
    }
}