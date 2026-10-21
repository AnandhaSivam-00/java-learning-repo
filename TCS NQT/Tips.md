## **TCS NQT advanced coding usually focuses less on hardcore competitive programming and more on:**

1. Arrays / Strings
2. Hashing
3. Sorting + Searching
4. Recursion / Backtracking (sometimes)
5. Basic Dynamic Programming
6. Greedy / Simulation
7. Pattern-based coding questions

### Basic Patterns
1. Sliding Window
2. Two Pointers
3. Prefix Sum
4. HashMap / Frequency counting
5. Binary Search
6. Sorting-based logic
7. Greedy




#### ChatGPT Response
With only **2 days**, the goal is not to master all advanced DSA. The goal is to maximize your score on the kinds of problems TCS NQT commonly asks.

TCS NQT advanced coding usually focuses less on hardcore competitive programming and more on:

* Arrays / Strings
* Hashing
* Sorting + Searching
* Recursion / Backtracking (sometimes)
* Basic Dynamic Programming
* Greedy / Simulation
* Pattern-based coding questions

You already know basic-to-intermediate DSA, which is a good base. You do **not** need deep graph algorithms or advanced CP tricks for most NQT questions.

## What to do in 2 days

## Day 1 — Cover high-frequency topics (8–10 hrs)

### 1) Master these patterns first

Spend most time here.

* Sliding Window
* Two Pointers
* Prefix Sum
* HashMap / Frequency counting
* Binary Search
* Sorting-based logic
* Greedy

Practice problems like:

* Longest substring without repeating chars
* Pair sum
* Majority element
* Merge intervals
* Kth largest
* Missing number
* Rotate array
* Stock buy/sell

---

### 2) Learn Backtracking basics (3–4 hrs only)

Don’t try to master all of backtracking. Learn the **template**.

Backtracking =

1. Choose
2. Explore
3. Undo

Basic template:

```python
def backtrack(path, choices):
    if goal_reached:
        result.append(path[:])
        return

    for choice in choices:
        make_choice(choice)
        backtrack(path, choices)
        undo_choice(choice)
```

Practice these 4 problems only:

* Subsets
* Permutations
* Combination Sum
* N-Queens (understand only)

These teach 80% of backtracking.

Key idea:

* Recursive tree
* Base case
* Backtrack (undo changes)

Once this clicks, most backtracking questions feel similar.

---

### 3) Basic DP (2 hrs)

Learn only:

* Fibonacci DP
* Climbing stairs
* Knapsack pattern
* Longest Increasing Subsequence (concept)

Focus on:

* Recursion + Memoization
* Tabulation

---

# Day 2 — Mock + problem pattern recognition

### Solve 8–12 timed problems

Time yourself:

* Easy → 15 mins
* Medium → 30 mins

Use platforms:

* [LeetCode](https://leetcode.com?utm_source=chatgpt.com)
* [GeeksforGeeks](https://www.geeksforgeeks.org?utm_source=chatgpt.com)
* [HackerRank](https://www.hackerrank.com?utm_source=chatgpt.com)

Search:

* “TCS NQT coding questions”
* “TCS advanced coding questions”

Useful practice pages:

* [PrepInsta TCS Coding Questions](https://prepinsta.com/tcs-nqt/coding-questions-and-answers/?utm_source=chatgpt.com)
* [FacePrep TCS NQT](https://www.faceprep.in/tcs-nqt/?utm_source=chatgpt.com)

---

## During exam: problem-solving strategy

When you see a coding question:

### Step 1

Ask:

* Is it array/string?
* Can hashing help?
* Is it sorting?
* Is it recursion?

### Step 2

Check constraints:

* Small input (n ≤ 20) → backtracking possible
* Large input (n ≥ 10^5) → need O(n) / O(n log n)

This shortcut saves huge time.

Example:

* n = 16 → subsets/backtracking possible
* n = 100000 → brute force impossible

---

# If a backtracking question appears and you panic

Use this checklist:

* What choices do I have?
* What is one decision at each step?
* When do I stop?
* Do I need to undo?

That’s literally backtracking.

Example:
For permutations:

* Choices = unused numbers
* Decision = pick one
* Stop = permutation length == n
* Undo = remove chosen number

---

## Biggest mistake to avoid

Do **not** jump across 50 topics in 2 days.

Better:

* 6 important patterns deeply
  than
* 20 topics shallowly.

---

## Priority order (most important)

1. Arrays + Strings
2. Hashing
3. Sorting
4. Binary Search
5. Backtracking basics
6. DP basics

If you cover these properly in 2 days, you’ll be in a much stronger position for TCS NQT.
