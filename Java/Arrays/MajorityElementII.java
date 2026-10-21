// Majority Element II

// Given an integer array of size n, find all elements that appear more than ⌊n / 3⌋ times.

// Example 1:
// Input: nums = [3,2,3]
// Output: [3]
// Example 2:

// Input: nums = [1]
// Output: [1]
// Example 3:

// Input: nums = [1,2]
// Output: [1,2]


// Constraints:
// 1 <= nums.length <= 5 * 104
// -109 <= nums[i] <= 109

// Extra: [3,3,3,3,3,3,3,3]

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            if(freq.containsKey(nums[i]) && freq.get(nums[i]) == -1) {
                continue;
            }
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);

            if(freq.get(nums[i]) > nums.length/3) {
                freq.put(nums[i], -1);
                result.add(nums[i]);
            }
        }

        return result;
    }
}