// =============================================
// Task #219. Contains Duplicate II
// =============================================

public void main(String[] args) {
    int[] nums = {1, 2, 1, 1, 3, 2};
    int k = 2;

    System.out.println(containsNearbyDuplicate_(nums, k));
}

// Solution with HashMap
public boolean containsNearbyDuplicate_(int[] nums, int k) {
    int initialCapacity = (int) Math.ceil(nums.length / 0.75);
    HashMap<Integer, Integer> map = new HashMap<>(initialCapacity);

    for (int i = 0; i < nums.length; i++) {
        if (!map.containsKey(nums[i])) {
            map.put(nums[i], i);
        }
        else {
            int oldIndex = map.get(nums[i]);
            if (i - oldIndex <= k) return true;
            else map.put(nums[i], i);
        }
    }

    return false;
}

// Solution with HashSet
public boolean containsNearbyDuplicate(int[] nums, int k) {
    int initialCapacity = (int) Math.ceil(k / 0.75); // !!
    HashSet<Integer> set = new HashSet<>(initialCapacity); // !!

    for (int i = 0; i < nums.length; i++) {
        if (!set.add(nums[i])) return true; // !!
        if (set.size() > k) set.remove(nums[i - k]); // !!
    }

    return false;
}