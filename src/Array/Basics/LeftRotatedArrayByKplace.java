package Array.Basics;

import java.util.Scanner;

public class LeftRotatedArrayByKplace {
    public static void leftRotatedK(int nums[] , int k){
        for(int i=1; i<=k; i++){
            int temp = nums[0];

            for(int j=0; j<nums.length-1; j++){
                nums[j] = nums[j+1];
            }
            nums[nums.length-1] = temp;
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter "+n+" elements in the Array : ");
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        leftRotatedK(nums,2);

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }

    }
}
