package Arrays;

import java.util.HashMap;

public class Solution {

    // Approach: Using a HashMap to store the elements and their indices.
    // Iterate through the array, calculate the difference between the target and
    // current element.
    // Check if the difference exists in the HashMap, if so, return the indices.
    // Otherwise, store the current element and its index in the HashMap.

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numToIndexMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (numToIndexMap.containsKey(diff)) {
                return new int[] { numToIndexMap.get(diff), i };
            }
            numToIndexMap.put(nums[i], i);
        }
        return new int[] {}; // If no solution found, return an empty array.
    }

    // Time Complexity: O(n) - Where 'n' is the number of elements in the array.
    // Space Complexity: O(n) - HashMap stores at most 'n' elements.

    // Brute Force Approach:
    // Iterate through each element in the array.
    // For each element, iterate through the rest of the array to find a pair that
    // sums up to the target.
    // Return the indices of the pair when found.

    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {}; // If no solution found, return an empty array.
    }

    // Time Complexity: O(n^2) - Two nested loops iterating through the array.
    // Space Complexity: O(1) - No extra space used.
}
