// =============================================
// Task #1. Two Sum
// =============================================

public static void main(String[] args) {
    int[] nums = {3, 3, 3, 3};
    int target = 6;

    HashMap<Integer, Integer> mapa = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        int temp = target - nums[i];

        if (mapa.containsKey(temp)) {
            System.out.println(mapa.get(temp) + ", " + i);
            return;
        }
        else {
            mapa.put(nums[i], i);
        }
    }
}