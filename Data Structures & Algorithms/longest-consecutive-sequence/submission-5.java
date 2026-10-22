class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        int i, maxLength = 0, size, curr;
        Set<Integer> numSet = new HashSet<>();

        for(i=0; i<nums.length; i++) {
            numSet.add(nums[i]);
        }

        for(i=0; i<nums.length; i++) {
            if(!numSet.contains(nums[i] - 1)) {
                size = 1;
                curr = nums[i];

                while(numSet.contains(curr + 1)) {
                    size++;
                    curr++;
                }

                maxLength = Math.max(maxLength, size);
            }
        }

        return maxLength;
    }
}