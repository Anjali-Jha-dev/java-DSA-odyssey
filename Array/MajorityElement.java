import java.util.HashMap;

class  MajorityElement{
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        int max = 0;
        int majorityElement = nums[0];

        // Find element with max frequency
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (map.get(n) > max) {
                max = map.get(n);
                majorityElement = n;
            }
        }

        return majorityElement;
    }
}
