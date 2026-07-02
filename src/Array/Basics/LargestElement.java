package Array.Basics;
/*
Given an array of integers nums, return the value of the largest element in the array


Example 1

Input: nums = [3, 3, 6, 1]

Output: 6

Explanation: The largest element in array is 6
 */


public class LargestElement {
    public static void main(String[] args){
        int arr[] = {10,20,5,2};

        int max = arr[0];
        for(int i=0; i<arr.length; i++){

            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}