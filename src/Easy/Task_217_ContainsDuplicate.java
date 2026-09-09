// =============================================
// Task #217. Contains Duplicate
// =============================================

public void main(String[] args) {
    int[] nums = {1,2,3,4};
    System.out.println(containsDuplicate(nums));
}

public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();

    for(int i : nums) {
        if (!set.add(i)) return true;
    }
    return false;
}

// To solve this task, it is better to use HashSet and its .add() method,
// which not only adds an element, but also checks whether it already exists in the collection.