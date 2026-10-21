// Move Zeroes

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

// Example 1:
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 1;

        while(i < j && j <= nums.length - 1) {
            if(nums[i] == 0 && nums[j] == 0){
                j++;
            }
            else if(nums[i] == 0) {
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
                j++;
            }
            else if(nums[j] == 0) {
                i++;
                j++;
            }
            else {
                i = j + 1;
                j += 2;
            }
        }
    }
}