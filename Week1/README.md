# Week1 
- Min in Sort rotated Array
#Approach
1. Brute Force — Linear Search
Traverse the entire array and return the minimum.

✅ Time: O(N)

❌ Not optimal for large N

2. Optimal — Binary Search (O(log N))
We take advantage of the rotated sorted array and use binary search.

✅ Logic:
If middle element > rightmost, minimum is in the right half.

Else, minimum is in the left half (including mid).

✅ Time: O(log N)
✅ Space: O(1)