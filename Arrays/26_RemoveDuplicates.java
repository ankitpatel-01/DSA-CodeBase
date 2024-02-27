package Arrays;

public class Solution {

    // Approach:
    // Use a pointer 'k' to keep track of the position where the next non-duplicate
    // element should be placed.
    // Iterate through the array starting from the second element.
    // If the current element is different from the previous one, copy it to the
    // position pointed by 'k' and increment 'k'.
    // Finally, 'k' represents the length of the array without duplicates.

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    // TC: O(n)
    // SC: O(1)

    // Approach:
    // Use Hashset and return set size

    public int removeDuplicatesA1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int length = nums.length;
        int uniqueIndex = 0;

        for (int i = 0; i < length; i++) {
            if (!set.contains(nums[i])) {
                nums[uniqueIndex++] = nums[i];
                set.add(nums[i]);
            }
        }

        return set.size();
    }

    // TC : O(n)
    // SC : O(n)

    // Brute Force Approach:
    // Sort the array.
    // Iterate through the sorted array and remove duplicates.
    // Shift remaining elements to the left to fill the gaps.
    // Return the length of the new array.

    public static int removeDuplicatesBruteForce(int[] nums) {
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            if (nums[i] == nums[i - 1]) {
                for (int j = i; j < length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                length--;
                i--;
            }
        }
        return length;
    }

    // TC: O(n^2)
    // SC: O(1)
}
