package com.practice.interview;

import java.util.HashSet;

/*Given an array A[] and a number x, check for pair in A[] with sum as x.

Example1:
Input: arr[] = {0, -1, 2, -3, 1}
       sum = -2
Output: -3, 1
        Valid pair exists.
        
If we calculate the sum of the output,
1 + (-3) = -2

Example2:

Input: arr[] = {1, -2, 1, 0, 5}
      sum = 0
Output:
       No valid pair exists.

Example3:
Input :  arr[] ={1, 4, 45, 6, 10, -8} 
sum = 16 */

public class PairWithSum {

    public static void findPairWithSum(int[] arr, int targetSum) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int num : arr) {
            int complement = targetSum - num;
            if (seenNumbers.contains(complement)) {
                System.out.println("Pair with sum " + targetSum + " found: " + num + ", " + complement);
                return;
            }
            seenNumbers.add(num);
        }

        System.out.println("No pair found with sum " + targetSum);
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1, -5, 3};
        int targetSum = -2;

        findPairWithSum(arr, targetSum);
    }
}

