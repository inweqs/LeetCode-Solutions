// =============================================
// Task #1920. Build Array from Permutation
// =============================================

public void main(String[] args) {
    int[] nums = {5,0,1,2,3,4};

    System.out.println(Arrays.toString(buildArray(nums)));
}

public int[] buildArray(int[] nums) {
    int[] ans = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
        ans[i] = nums[nums[i]];
    }
    return ans;
}

// *Follow-up:
// Can you solve it without using an extra space (i.e., O(1) memory)?