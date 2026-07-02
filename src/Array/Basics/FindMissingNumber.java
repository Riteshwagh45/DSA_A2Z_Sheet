package Array.Basics;
/*
Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.


Example 1

Input: nums = [0, 2, 3, 1, 4]

Output: 5

Explanation:

nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]
 */

public class FindMissingNumber {
    static void main(String[] args) {
        int arr[] = {0, 1, 2, 4, 5, 6};
        int n = arr.length;
        int tempsum = n*(n+1)/2;
        int actualSum = 0;

        for(int i=0; i<arr.length; i++){
            actualSum += arr[i];
        }

        System.out.println(tempsum-actualSum);

    }
}
