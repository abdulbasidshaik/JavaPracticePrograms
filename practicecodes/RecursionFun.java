package com.wipro.practicecodes;

import java.util.HashMap;
import java.util.Scanner;

public class RecursionFun {
	
/* 5.a) Given an array of integers, write a program that finds 
 * if there are two numbers that add up to a specific target. 
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice. 
 * Optimize the solution for time complexity.
	*/
		    public static int[] findTwoNumbers(int[] nums, int target) {
		        HashMap<Integer, Integer> numMap = new HashMap<>();
		        for (int i = 0; i < nums.length; i++) {
		            int complement = target - nums[i];
		            if (numMap.containsKey(complement)) {
		                return new int[]{numMap.get(complement), i};
		            }
		            numMap.put(nums[i], i);
		        }
		        return null;
		    }

		    public static void main(String[] args) {
		        Scanner keyboard = new Scanner(System.in);
		        int n = keyboard.nextInt();
		        int[] nums = new int[n];
		        for (int i = 0; i < n; i++) {
		            nums[i] = keyboard.nextInt();
		        }
		        int target = keyboard.nextInt();
		        keyboard.close();
		        int[] result = findTwoNumbers(nums, target);
		        if (result != null) {
		            System.out.println("The two numbers are " + nums[result[0]] + " and " + nums[result[1]]);
		        } else {
		            System.out.println("No two numbers add up to the target");
		        }
		    }
}
