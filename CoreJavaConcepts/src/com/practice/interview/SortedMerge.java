package com.practice.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Write a SortedMerge() function that takes two lists, 
each of which is unsorted, 
and merges the two together into one new list which is in sorted (increasing) order

Examples : 

Input : a[] = {10, 5, 15} --> (15,2)
        b[] = {20, 3, 2} --> (20,0)
Output : Merge List :
        {2, 3, 5, 10, 15, 20}

Input : a[] = {1, 10, 5, 15}
        b[] = {20, 0, 2}
Output : Merge List :
        {0, 1, 2, 5, 10, 15, 20} */

public class SortedMerge {

    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();

        // Add all elements from both lists to the merged list
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        // Sort the merged list in increasing order
        Collections.sort(mergedList);

        return mergedList;
    }
    
    public static int[] mergeArrayMethod1(int[] arr1, int[] arr2) {
    	int[] mergeArray = new int[arr1.length+arr2.length];
    	
    	System.arraycopy(arr1, 0, mergeArray, 0, arr1.length);
    	System.arraycopy(arr2, 0, mergeArray, arr1.length, arr2.length);
    	
    	Arrays.sort(mergeArray);
    	
    	return mergeArray;
    }
    
    public static int[] mergeArrayMethod2(int[] arr1, int[] arr2) {
    	int[] mergeArray = new int[arr1.length+arr2.length];
    	
    	int len = arr1.length;
    	
    	for (int index=0 ; index < len; index++) {
    		mergeArray[index] = arr1[index];
		}
    	
    	for (int index=0 ; index < arr2.length; index++) {
    		mergeArray[len + index] = arr2[index];
		}
    	
    	Arrays.sort(mergeArray);
    	
    	return mergeArray;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(5);
        list1.add(15);

        List<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(3);
        list2.add(2);

        List<Integer> mergedList = mergeLists(list1, list2);

        System.out.println("========================= Merge List =====================");
        System.out.println(mergedList);
        
       System.out.println("========================== Method 1 ======================="); 
       int a[] = {1, 10, 5, 15};
       int  b[] = {20, 0, 2};
       System.out.println(Arrays.toString(mergeArrayMethod1(a, b)));
       
       System.out.println("========================== Method 2 ======================="); 
       System.out.println(Arrays.toString(mergeArrayMethod2(a, b)));
    }
}
