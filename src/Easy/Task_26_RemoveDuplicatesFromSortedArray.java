// =============================================
// Task #26. Remove Duplicates from Sorted Array
// =============================================

public void main(String[] args) {
    int[] nums = {0, 0, 1, 1, 2, 2, 3, 4, 5};
    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + ", ");
    }

    System.out.println();

    int k = removeDuplicates(nums);
    for (int i = 0; i < k; i++) {
        System.out.print(nums[i] + ", ");
    }
}

// Solution with Two pointers
public int removeDuplicates(int[] nums) {
    int j = 1; // first pointer - writer (j)
    // second pointer - reader (i)

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
            nums[j] = nums[i];
            j++;
        }
    }
    return j;
}