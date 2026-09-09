// =============================================
// Task #1929. Concatenation of Array
// =============================================

public static void main(String[] args) {
   int[] nums = {1, 2, 3, 1};
   printArray(simpleSolution(nums));
   printArray(arraycopySolution(nums));
}

// Solution with difficult O(n)
public static int[] simpleSolution(int[] nums) {
    int[] ans = new int[nums.length*2];

    for (int i = 0; i < nums.length; i++) {
        ans[i] = nums[i];
        ans[i + nums.length] = nums[i];
    }

    return ans;
}


// Solution with System.arraycopy()

public static int[] arraycopySolution(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n * 2];

    System.arraycopy(nums, 0, ans, 0, n);
    System.arraycopy(nums, 0, ans, n, n);

    return ans;
}

public static void printArray(int[] arr) {
    System.out.println(Arrays.toString(arr));
}