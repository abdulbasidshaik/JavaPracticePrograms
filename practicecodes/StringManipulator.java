package com.wipro.practicecodes;

public class StringManipulator {
//9
    public static String reverseAndExtractMiddle(String s1, String s2, int length) {
        // Step 1: Concatenate the strings
        String concatenated = s1 + s2;
        
        // Step 2: Reverse the concatenated string
        String reversed = new StringBuilder(concatenated).reverse().toString();
        
        // Step 3: Extract the middle substring of the given length
        int midPoint = reversed.length() / 2;
        int start = Math.max(0, midPoint - length / 2);  // Start index for the middle substring
        int end = Math.min(reversed.length(), start + length);  // End index for the middle substring
        
        return reversed.substring(start, end);
    }

    public static void main(String[] args) {
        // Test the method with some inputs
        System.out.println("Result: '" + reverseAndExtractMiddle("hello", "world", 5) + "'");
        System.out.println("Result: '" + reverseAndExtractMiddle("", "world", 3) + "'");
        System.out.println("Result: '" + reverseAndExtractMiddle("hello", "", 10) + "'");
        System.out.println("Result: '" + reverseAndExtractMiddle("a", "b", 0) + "'");
        System.out.println("Result: '" + reverseAndExtractMiddle("", "", 1) + "'");
        System.out.println("Result: '" + reverseAndExtractMiddle("Java", "Python", 20) + "'");
    }
}
