// Longest Substring Without Repeating Characters

// Given a string s, find the length of the longest substring without duplicate characters.

// Example 1:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

// Example 2:
// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.

// Example 3:
// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

// Edge cases: "aa", "a", "au"


// Constraints:
// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.



class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }
        if(s.length() == 1) {
            return 1;
        }

        int left = 1, maxLen = 1;
        StringBuilder sb = new StringBuilder(String.valueOf(s.charAt(0)));

        while(left <= s.length() - 1) {
            while(sb.indexOf(String.valueOf(s.charAt(left))) >= 0) {
                sb.deleteCharAt(0);
            }
            sb.append(s.charAt(left));
            left++;
            maxLen = Math.max(sb.length(), maxLen);
        }

        return maxLen;
    }
}