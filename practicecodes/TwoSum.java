package com.wipro.practicecodes;

import java.util.HashMap;
public class TwoSum {
	  public static int[] twoSum(int[] nums, int target) {
	    // Create a hash map to store seen numbers and their indices
	    HashMap<Integer, Integer> seen = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	      int complement = target - nums[i];
	      // Check if the complement (number needed to reach target) exists in the hash map
	      if (seen.containsKey(complement)) {
	        // If found, return the indices of both numbers
	        return new int[]{seen.get(complement), i};
	      }
	      // Add the current number and its index to the hash map
	      seen.put(nums[i], i);
	    }
	    // If no match found, return an empty array
	    return new int[0];
	  }

	  public static void main(String[] args) {
	    int[] nums = {2, 7, 11, 15};
	    int target = 9;
	    int[] result = twoSum(nums, target);

	    if (result.length > 0) {
	      System.out.println("The two numbers that add up to " + target + " are: " + nums[result[0]] + " and " + nums[result[1]]);
	    } else {
	      System.out.println("No two numbers in the array add up to " + target);
	    }
	  }
}
