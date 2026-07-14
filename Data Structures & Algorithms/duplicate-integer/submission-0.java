class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}