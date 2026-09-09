// =============================================
// Task #283. Move Zeroes
// =============================================

public void main(String[] args) {
    int[] nums = {0, 1, 2, 0, 3, 0, 3, 4, 5};
    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + ", ");
    }

    System.out.println();
    moveZeroes(nums);

    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + ", ");
    }
}


public void moveZeroes(int[] nums) {
    int j = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            nums[j] = nums[i];
            j++;
        }
    }

    // Using Arrays.fill for filling the rest with zeroes
    Arrays.fill(nums, j, nums.length, 0);
}
