// =============================================
// Task #1. Two Sum
// =============================================

public void main(String[] args) {
    int[] nums = {3, 2, 1, 4};
    int target = 6;

    System.out.println(Arrays.toString(twoSum(nums, target)));
}

// Time Complexity: O(n)
// Space Complexity: O(n)
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    // We look for the difference between target and nums[i] in the map,
    // if we find it, return the indices of the numbers
    for (int i = 0; i < nums.length; i++) {
        int temp = target - nums[i];

        if (map.containsKey(temp)) return new int[] {map.get(temp), i};
        else map.put(nums[i], i);
    }

    // If we don't find it, return {0, 0}
    return new int[] {0, 0};
}