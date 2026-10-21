// Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true

// Example 2:
// Input: s = "rat", t = "car"
// Output: false

// Constraints:
// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.
    

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> freq = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int j=0; j<t.length(); j++) {
            char ch = t.charAt(j);
            if(freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) - 1);

                if(freq.get(ch) == -1) {
                    return false;
                }
            }
            else {
                return false;
            }
        }

        return true;
    }
}